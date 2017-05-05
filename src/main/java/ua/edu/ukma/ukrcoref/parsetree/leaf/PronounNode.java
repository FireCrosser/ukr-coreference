package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Pronoun;

public class PronounNode extends LeafNode<Pronoun> {

    private Pronoun pronoun;

    @Override
    public Pronoun getData() {
        return pronoun;
    }

    @Override
    public void acceptDown(NodeVisitor v) {
        v.visit(this);
    }
    
    @Override
    public void acceptUp(NodeVisitor v) {
        v.visit(this);
        if (this.getParent() != null)
            this.getParent().acceptUp(v);
    }
}
