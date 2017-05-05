package ua.edu.ukma.ukrcoref.parsetree;

import java.util.ArrayList;
import java.util.List;
import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;

public class RelativeClause implements ParseTreeNode {

    private ParseTreeNode parent;
    private List<ParseTreeNode> children;

    @Override
    public ParseTreeNode getParent() {
        return parent;
    }

    @Override
    public void setParent(ParseTreeNode node) {
        this.parent = node;
    }

    @Override
    public List<ParseTreeNode> getData() {
        return null;
    }

    @Override
    public List<ParseTreeNode> getChildren() {
        return children;
    }

    @Override
    public void addChild(ParseTreeNode child) {
        if (children == null)
            children = new ArrayList<>();
        children.add(child);
    }

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
