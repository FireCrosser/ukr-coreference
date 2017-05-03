package ua.edu.ukma.ukrcoref.parsetree.leaf;

import java.util.List;
import ua.edu.ukma.ukrcoref.Noun;
import ua.edu.ukma.ukrcoref.parsetree.INode;

public class NounNode extends LeafNode<Noun>{

    private INode parent;
    private Noun noun;
    
    @Override
    public INode getParent() {
        return parent;
    }

    @Override
    public Noun getData() {
       return noun;
    }
    
}
