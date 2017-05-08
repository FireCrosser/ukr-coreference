package ua.edu.ukma.ukrcoref.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;
import java.util.Set;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.LeafNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.NodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.PhraseNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.RelativeClauseFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.SentenceFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.NounNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.NumeralNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.PrepositionNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.PronounNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf.VerbNodeFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.NounFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.NumeralFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.PosJsonFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.PrepositionFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.PronounFactory;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.json.VerbFactory;

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
                node = NodeFactory.createNode(new NounNodeFactory(
                        PosJsonFactory.createNode(new NounFactory(value.
                                getAsJsonObject()))));
                break;
            case "PRP":
                node = NodeFactory.createNode(new PronounNodeFactory(
                        PosJsonFactory.createNode(new PronounFactory(value.
                                getAsJsonObject()))));
                break;
            case "V":
                node = NodeFactory.createNode(new VerbNodeFactory(
                        PosJsonFactory.createNode(new VerbFactory(value.
                                getAsJsonObject()))));
                break;
            case "IN":
                node = NodeFactory.createNode(new PrepositionNodeFactory(
                        PosJsonFactory.createNode(new PrepositionFactory(value.
                                getAsJsonObject()))));
                break;
            case "NUM":
                node = NodeFactory.createNode(new NumeralNodeFactory(
                        PosJsonFactory.createNode(new NumeralFactory(value.
                                getAsJsonObject()))));
                break;
            default:
                throw new IllegalArgumentException(
                        "Can not create node with such code.");
        }
        if (node != null) {
            if (parent != null) {
                node.setParent(parent);
                parent.addChild(node);
            }
            if (key.equals("S") || key.equals("REL") || key.equals("NP")
                    || key.equals("PP") || key.equals("VP"))
                parseJsonToNode(value, node);
        }
        return node;
    }
}
