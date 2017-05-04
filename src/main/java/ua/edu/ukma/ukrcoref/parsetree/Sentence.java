package ua.edu.ukma.ukrcoref.parsetree;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements ParseTreeNode<List<INode>> {

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
    public List<INode> getData() {
        return null;
    }

    @Override
    public List<INode> getChildren() {
        return children;
    }

    @Override
    public void addChild(INode child) {
        if (children == null)
            children = new ArrayList<>();
        children.add(child);
    }
}
