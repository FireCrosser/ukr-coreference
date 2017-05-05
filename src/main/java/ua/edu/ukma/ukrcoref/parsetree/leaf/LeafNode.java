package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;

public abstract class LeafNode<T> implements ParseTreeNode<T> {

    private ParseTreeNode parent;

    @Override
    public ParseTreeNode getParent() {
        return parent;
    }

    @Override
    public void setParent(ParseTreeNode node) {
        this.parent = node;
    }

    @Override
    public List getChildren() {
        return null;
    }

    @Override
    public void addChild(ParseTreeNode child) {
    }
}
