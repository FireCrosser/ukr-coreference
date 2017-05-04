package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.ArrayList;
import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.LeafNode;
import ua.edu.ukma.ukrcoref.parsetree.Node;

public abstract class PhraseNode<PT> implements ParseTreeNode<List<Node>> {

    private LeafNode<PT> head;
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
    public List<Node> getChildren() {
        return children;
    }

    @Override
    public List<Node> getData() {
        return null;
    }

    @Override
    public void addChild(Node child) {
        if (children == null)
            children = new ArrayList<>();
        this.children.add(child);
    }

    public LeafNode<PT> getHead() {
        return head;
    }

    public void setHead(LeafNode<PT> node) {
        if (this.head != null)
            throw new Error("Head node already exists!");
        else
            this.head = node;
        if (children == null)
            children = new ArrayList<>();
        this.addChild(node);
    }
}
