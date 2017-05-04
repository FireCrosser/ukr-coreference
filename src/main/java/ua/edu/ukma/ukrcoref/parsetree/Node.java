package ua.edu.ukma.ukrcoref.parsetree;

import java.util.List;

public interface Node<T> {

    public Node getParent();

    public void setParent(Node node);

    public T getData();

    public List<Node> getChildren();

    public void addChild(Node child);
}
