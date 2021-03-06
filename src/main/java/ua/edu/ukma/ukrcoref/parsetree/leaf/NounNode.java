package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Noun;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class NounNode extends LeafNode<Noun> {

    private Noun noun;

    public NounNode(PartOfSpeech value) {
        super(value);
    }

    @Override
    public Noun getData() {
        return noun;
    }

   @Override
    public void acceptDown(NodeVisitor v) {
        v.visit(this);
    }

    @Override
    public void acceptUp(NodeVisitor v) {
        boolean toContinue = v.visit(this);
        if (toContinue == true)
            if (this.getParent() != null)
                this.getParent().acceptUp(v);
    }

}
