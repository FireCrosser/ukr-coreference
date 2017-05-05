package ua.edu.ukma.ukrcoref.parsetree.factory;

import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.RelativeClause;

public class RelativeClauseFactory implements NodeAbstractFactory{

    @Override
    public ParseTreeNode createNode() {
        return new RelativeClause();
    }
    
}
