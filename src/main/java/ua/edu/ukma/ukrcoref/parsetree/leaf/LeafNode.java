package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.INode;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;

public abstract class LeafNode<T> implements ParseTreeNode<T> {

    private INode parent;

    @Override
    public INode getParent() {
        return parent;
    }

    @Override
    public void setParent(INode node) {
        this.parent = node;
    }

    @Override
    public List getChildren() {
        return null;
    }

    @Override
    public void addChild(INode child) {
    }
}
