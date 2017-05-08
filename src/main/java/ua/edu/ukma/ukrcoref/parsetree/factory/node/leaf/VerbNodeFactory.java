package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.leaf.VerbNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class VerbNodeFactory extends LeafNodeFactory<VerbNode> {

    public VerbNodeFactory(PartOfSpeech partOfSpeech) {
        super(partOfSpeech);
    }

    @Override
    public VerbNode createNode() {
        return new VerbNode(this.partOfSpeech);
    }
}
