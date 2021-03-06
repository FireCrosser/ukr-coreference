package ua.edu.ukma.ukrcoref.parsetree.phrase;

import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;
import ua.edu.ukma.ukrcoref.parsetree.pos.Verb;

public class VerbPhraseNode extends PhraseNode<Verb> {

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
