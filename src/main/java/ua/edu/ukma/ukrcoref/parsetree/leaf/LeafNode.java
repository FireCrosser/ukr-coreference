package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.Node;

public abstract class LeafNode<T> implements ParseTreeNode<T> {

    private Node parent;

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void setParent(Node node) {
        this.parent = node;
    }

    @Override
    public List getChildren() {
        return null;
    }

    @Override
    public void addChild(Node child) {
    }
}
