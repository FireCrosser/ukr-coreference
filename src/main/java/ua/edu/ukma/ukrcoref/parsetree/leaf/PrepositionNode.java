package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.parsetree.pos.Preposition;

public class PrepositionNode extends LeafNode<Preposition>{

    private Preposition preposition;
    
    @Override
    public Preposition getData() {
        return preposition;
    }
    
}
