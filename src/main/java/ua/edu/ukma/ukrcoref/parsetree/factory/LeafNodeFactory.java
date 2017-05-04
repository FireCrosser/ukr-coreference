package ua.edu.ukma.ukrcoref.parsetree.factory;

import ua.edu.ukma.ukrcoref.parsetree.leaf.LeafNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NumeralNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PrepositionNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.VerbNode;

public class LeafNodeFactory implements NodeAbstractFactory {

    private final String code;

    public LeafNodeFactory(String code) {
        this.code = code;
    }

    @Override
    public LeafNode createNode() {
        LeafNode node;
        switch (code) {
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
                throw new IllegalArgumentException(
                        "Can not create node with such code.");
        }
        return node;
    }

}
