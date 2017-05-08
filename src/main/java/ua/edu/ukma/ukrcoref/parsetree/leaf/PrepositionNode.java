package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;
import ua.edu.ukma.ukrcoref.parsetree.pos.Preposition;

public class PrepositionNode extends LeafNode<Preposition> {

    private Preposition preposition;

    public PrepositionNode(PartOfSpeech value) {
        super(value);
    }

    @Override
    public Preposition getData() {
        return preposition;
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
