package ua.edu.ukma.ukrcoref.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;
import java.util.Set;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.RelativeClause;
import ua.edu.ukma.ukrcoref.parsetree.Sentence;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NumeralNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PrepositionNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.VerbNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.NounPhrase;
import ua.edu.ukma.ukrcoref.parsetree.phrase.PronounPhrase;
import ua.edu.ukma.ukrcoref.parsetree.phrase.VerbPhrase;

public class JsonConverter implements ISentenceConverter {

    private JsonParser parser;

    @Override
    public Object convert(String input) {
        if (parser == null)
            parser = new JsonParser();
        JsonElement jsonElement = parser.parse(input);
        ParseTreeNode root = parseJsonToNode(jsonElement, null);
        return root;
    }

    private ParseTreeNode parseJsonToNode(JsonElement jsonElement,
            ParseTreeNode parent) {
        ParseTreeNode node = null;
        if (jsonElement != null) {
            if (jsonElement.isJsonObject()) {
                JsonObject object = jsonElement.getAsJsonObject();
                Set<Map.Entry<String, JsonElement>> entries = object.entrySet();
                for (Map.Entry<String, JsonElement> entry : entries) {
                    node = createNewNode(entry.getKey(), entry.getValue(),
                            parent);
                }
            } else if (jsonElement.isJsonArray()) {
                JsonArray array = jsonElement.getAsJsonArray();
                for (JsonElement entry : array) {
                    parseJsonToNode(entry, parent);
                }
            }
        }
        return node;
    }

    private ParseTreeNode createNewNode(String key, JsonElement value,
            ParseTreeNode parent) {
        ParseTreeNode node;
        switch (key) {
            case "S":
                node = new Sentence();
                break;
            case "REL":
                node = new RelativeClause();
                break;
            case "NP":
                node = new NounPhrase();
                break;
            case "PP":
                node = new PronounPhrase();
                break;
            case "VP":
                node = new VerbPhrase();
                break;
            case "NN":
                node = new NounNode();
                break;
            case "PRP":
                node = new PronounNode();
                break;
            case "V":
                node = new VerbNode();
                break;
            case "IN":
                node = new PrepositionNode();
                break;
            case "NUM":
                node = new NumeralNode();
                break;
            default:
                node = null;
                break;
        }
        if (node != null) {
            if (parent != null) {
                node.setParent(parent);
                parent.addChild(node);
            }
            if (key.equals("S") || key.equals("NP") || key.equals("PP"))
                parseJsonToNode(value, node);
        }
        return node;
    }
}
