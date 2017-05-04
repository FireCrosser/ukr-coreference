package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.parsetree.pos.Noun;

public class NounNode extends LeafNode<Noun> {

    private Noun noun;

    @Override
    public Noun getData() {
        return noun;
    }

}
