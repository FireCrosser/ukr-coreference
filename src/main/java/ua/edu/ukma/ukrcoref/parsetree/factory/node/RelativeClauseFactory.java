package ua.edu.ukma.ukrcoref.parsetree.factory.node;
import ua.edu.ukma.ukrcoref.parsetree.RelativeClause;

public class RelativeClauseFactory implements NodeAbstractFactory<RelativeClause>{

    @Override
    public RelativeClause createNode() {
        return new RelativeClause();
    }
}
