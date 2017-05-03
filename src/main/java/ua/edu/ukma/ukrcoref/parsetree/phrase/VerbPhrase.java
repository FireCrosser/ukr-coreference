package ua.edu.ukma.ukrcoref.parsetree.phrase;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.INode;
import ua.edu.ukma.ukrcoref.parsetree.pos.Verb;

public class VerbPhrase extends Phrase<Verb> {

    @Override
    public INode<Verb> getHead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<INode> parts;

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
