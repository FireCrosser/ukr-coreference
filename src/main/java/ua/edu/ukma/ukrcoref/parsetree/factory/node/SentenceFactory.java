package ua.edu.ukma.ukrcoref.parsetree.factory.node;

import ua.edu.ukma.ukrcoref.parsetree.Sentence;

public class SentenceFactory implements NodeAbstractFactory<Sentence> {

    @Override
    public Sentence createNode() {
        return new Sentence();
    }

}
