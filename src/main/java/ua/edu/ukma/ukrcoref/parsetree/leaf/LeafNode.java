package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public abstract class LeafNode<T> implements ParseTreeNode<T> {

    protected PartOfSpeech value;
    protected ParseTreeNode parent;

    public LeafNode(PartOfSpeech value) {
        this.value = value;
    }
    
    @Override
    public ParseTreeNode getParent() {
        return parent;
    }

    @Override
    public void setParent(ParseTreeNode node) {
        this.parent = node;
    }

    @Override
    public List getChildren() {
        return null;
    }

    @Override
    public void addChild(ParseTreeNode child) {
    }
    
}
