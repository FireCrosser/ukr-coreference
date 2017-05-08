package ua.edu.ukma.ukrcoref.parsetree.factory.node;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;

public interface NodeAbstractFactory<T extends ParseTreeNode> {

    public T createNode();
}
