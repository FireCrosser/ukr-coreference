package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Numeral;

public class NumeralNode extends LeafNode<Numeral> {

    private Numeral numeral;

    @Override
    public Numeral getData() {
        return numeral;
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
