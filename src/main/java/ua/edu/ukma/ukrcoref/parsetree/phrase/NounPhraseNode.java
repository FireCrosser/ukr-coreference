package ua.edu.ukma.ukrcoref.parsetree.phrase;

import ua.edu.ukma.ukrcoref.Noun;
import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;

public class NounPhraseNode extends PhraseNode<Noun> {

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
    }
}
