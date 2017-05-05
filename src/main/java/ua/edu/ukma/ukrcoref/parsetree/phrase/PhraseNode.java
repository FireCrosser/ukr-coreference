package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.ArrayList;
import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.LeafNode;

public abstract class PhraseNode<PT> implements ParseTreeNode<List<ParseTreeNode>> {

    private LeafNode<PT> head;
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
    public List<ParseTreeNode> getChildren() {
        return children;
    }

    @Override
    public List<ParseTreeNode> getData() {
        return null;
    }

    @Override
    public void addChild(ParseTreeNode child) {
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
