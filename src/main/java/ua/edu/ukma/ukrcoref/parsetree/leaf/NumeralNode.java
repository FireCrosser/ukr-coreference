package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Numeral;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class NumeralNode extends LeafNode<Numeral> {

    private Numeral numeral;

    public NumeralNode(PartOfSpeech value) {
        super(value);
    }

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
        boolean toContinue = v.visit(this);
        if (toContinue == true)
            if (this.getParent() != null)
                this.getParent().acceptUp(v);
    }
}
