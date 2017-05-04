package ua.edu.ukma.ukrcoref.parsetree;

import java.util.List;

public interface INode<T> {

    public INode getParent();

    public void setParent(INode node);

    public T getData();

    public List<INode> getChildren();

    public void addChild(INode child);
}
