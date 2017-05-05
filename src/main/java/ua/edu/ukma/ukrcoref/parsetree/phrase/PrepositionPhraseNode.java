package ua.edu.ukma.ukrcoref.parsetree.phrase;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Preposition;

public class PrepositionPhraseNode extends PhraseNode<Preposition> {

    @Override
    public void acceptDown(NodeVisitor v) {
        if (this.getChildren() != null)
            this.getChildren().stream().
                    forEach((n) -> {
                        n.acceptDown(v);
                    });
        v.visit(this);
    }
    
    @Override
    public void acceptUp(NodeVisitor v) {
        v.visit(this);
        if (this.getParent() != null)
            this.getParent().acceptUp(v);
    }

}
