package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;
import ua.edu.ukma.ukrcoref.parsetree.pos.Pronoun;

public class PronounNode extends LeafNode<Pronoun> {

    private Pronoun pronoun;

    public PronounNode(PartOfSpeech value) {
        super(value);
    }

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
        boolean toContinue = v.visit(this);
        if (toContinue == true)
            if (this.getParent() != null)
                this.getParent().acceptUp(v);
    }
}
