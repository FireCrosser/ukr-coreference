package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class NounNodeFactory extends LeafNodeFactory<NounNode>{

    public NounNodeFactory(PartOfSpeech partOfSpeech) {
        super(partOfSpeech);
    }

    @Override
    public NounNode createNode() {
        return new NounNode(this.partOfSpeech);
    }
    
}
