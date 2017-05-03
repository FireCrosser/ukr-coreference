package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.List;
import ua.edu.ukma.ukrcoref.Noun;
import ua.edu.ukma.ukrcoref.parsetree.INode;

public class NounPhrase extends Phrase<Noun> {

    @Override
    public INode<Noun> getHead() {
        return null;
    }

    @Override
    public INode getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<INode> getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<INode> getChildren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
