package ua.edu.ukma.ukrcoref.parsetree;

import java.util.List;
import ua.edu.ukma.ukrcoref.hobbs.visitor.NodeVisitor;

public interface ParseTreeNode<T>{
    
    public ParseTreeNode getParent();

    public void setParent(ParseTreeNode node);

    public T getData();

    public List<ParseTreeNode> getChildren();

    public void addChild(ParseTreeNode child);
    
    public void acceptDown(NodeVisitor v);
    public void acceptUp(NodeVisitor v);
}
