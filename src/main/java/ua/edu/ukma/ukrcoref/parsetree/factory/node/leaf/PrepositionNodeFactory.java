package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.leaf.PrepositionNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class PrepositionNodeFactory extends LeafNodeFactory<PrepositionNode> {

    public PrepositionNodeFactory(PartOfSpeech partOfSpeech) {
        super(partOfSpeech);
    }

    @Override
    public PrepositionNode createNode() {
        return new PrepositionNode(this.partOfSpeech);
    }
}
