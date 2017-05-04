package ua.edu.ukma.ukrcoref.parsetree;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements ParseTreeNode<List<Node>> {

    private Node parent;
    private List<Node> children;

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void setParent(Node node) {
        this.parent = node;
    }

    @Override
    public List<Node> getData() {
        return null;
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }

    @Override
    public void addChild(Node child) {
        if (children == null)
            children = new ArrayList<>();
        children.add(child);
    }
}
