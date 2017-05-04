package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.parsetree.INode;
import ua.edu.ukma.ukrcoref.parsetree.pos.Verb;

public class VerbNode extends LeafNode<Verb> {

    private Verb verb;

    @Override
    public Verb getData() {
        return verb;
    }

}
