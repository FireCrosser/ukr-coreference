package ua.edu.ukma.ukrcoref.parsetree.factory.node;

import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;

public class NodeFactory {

    public static ParseTreeNode createNode(NodeAbstractFactory factory) {
        return factory.createNode();
    }
}
