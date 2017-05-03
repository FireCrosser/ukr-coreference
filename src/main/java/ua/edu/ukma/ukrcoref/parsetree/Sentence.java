package ua.edu.ukma.ukrcoref.parsetree;

import java.util.List;

public class Sentence implements ParseTreeNode<List<INode>> {

    private INode parent;
    private List<INode> data;
    private List<INode> children;

    @Override
    public INode getParent() {
        return parent;
    }
    
    @Override
    public List<INode> getData() {
        return data;
    }

    @Override
    public List<INode> getChildren() {
        return children;
    }
}
