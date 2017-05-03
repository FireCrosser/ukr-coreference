package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.INode;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;

public abstract class Phrase<T> implements ParseTreeNode<List<INode>>{
    public abstract INode<T> getHead();
}
