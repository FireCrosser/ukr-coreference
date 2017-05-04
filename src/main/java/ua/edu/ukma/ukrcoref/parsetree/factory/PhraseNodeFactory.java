package ua.edu.ukma.ukrcoref.parsetree.factory;

import ua.edu.ukma.ukrcoref.parsetree.phrase.NounPhraseNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.PhraseNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.PronounPhraseNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.VerbPhraseNode;

public class PhraseNodeFactory implements NodeAbstractFactory {

    private final String code;

    public PhraseNodeFactory(String code) {
        this.code = code;
    }

    @Override
    public PhraseNode createNode() {
        PhraseNode node;
        switch (code) {
            case "NP":
                node = new NounPhraseNode();
                break;
            case "PP":
                node = new PronounPhraseNode();
                break;
            case "VP":
                node = new VerbPhraseNode();
                break;
            default:
                throw new IllegalArgumentException(
                        "Can not create node with such code.");
        }
        return node;
    }

}
