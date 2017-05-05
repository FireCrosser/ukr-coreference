package ua.edu.ukma.ukrcoref.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;
import java.util.Set;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.factory.LeafNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.NodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.PhraseNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.RelativeClauseFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.SentenceFactory;

public class JsonConverter implements SentenceConverter {

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

//    TODO: Upgrade factory
    private ParseTreeNode createNewNode(String key, JsonElement value,
            ParseTreeNode parent) {
        ParseTreeNode node;
        switch (key) {
            case "S":
                node = NodeFactory.createNode(new SentenceFactory());
                break;
            case "REL":
                node = NodeFactory.createNode(new RelativeClauseFactory());
                break;
            case "NP":
            case "PP":
            case "VP":
                node = NodeFactory.createNode(new PhraseNodeFactory(key));
                break;
            case "NN":
            case "PRP":
            case "V":
            case "IN":
            case "NUM":
                node = NodeFactory.createNode(new LeafNodeFactory(key));
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
            if (key.equals("S") || key.equals("REL") || key.equals("NP") || key.equals("PP"))
                parseJsonToNode(value, node);
        }
        return node;
    }
}
