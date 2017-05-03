package ua.edu.ukma.ukrcoref.parsetree;

import java.util.List;

public interface INode<T> {

    public INode getParent();
    
    public T getData();

    public List<INode> getChildren();
}
