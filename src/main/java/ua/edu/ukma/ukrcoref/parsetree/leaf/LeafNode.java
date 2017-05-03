package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;


public abstract class LeafNode<T> implements ParseTreeNode<T>{

    @Override
    public List getChildren() {
        return null;
    }
    
}
