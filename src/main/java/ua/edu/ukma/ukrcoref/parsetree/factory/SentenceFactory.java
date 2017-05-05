package ua.edu.ukma.ukrcoref.parsetree.factory;

import ua.edu.ukma.ukrcoref.parsetree.Sentence;

public class SentenceFactory implements NodeAbstractFactory {

    @Override
    public Sentence createNode() {
        return new Sentence();
    }

}
