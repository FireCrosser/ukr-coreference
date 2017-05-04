package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.ArrayList;
import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.INode;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.LeafNode;

public abstract class Phrase<PT> implements ParseTreeNode<List<INode>> {

    private LeafNode<PT> head;
    private INode parent;
    private List<INode> children;

    @Override
    public INode getParent() {
        return parent;
    }

    @Override
    public void setParent(INode node) {
        this.parent = node;
    }

    @Override
    public List<INode> getChildren() {
        return children;
    }

    @Override
    public List<INode> getData() {
        return null;
    }

    @Override
    public void addChild(INode child) {
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
