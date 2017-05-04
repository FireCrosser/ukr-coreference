package ua.edu.ukma.ukrcoref.parsetree.factory;

import ua.edu.ukma.ukrcoref.parsetree.RelativeClause;
import ua.edu.ukma.ukrcoref.parsetree.Sentence;

public class SentenceFactory implements NodeAbstractFactory {

    private final String code;

    public SentenceFactory(String code) {
        this.code = code;
    }

    @Override
    public Sentence createNode() {
        Sentence node;
        switch (code) {
            case "S":
                node = new Sentence();
                break;
            case "REL":
                node = new RelativeClause();
                break;
            default:
                node = null;
                break;
        }
        return node;
    }

}
