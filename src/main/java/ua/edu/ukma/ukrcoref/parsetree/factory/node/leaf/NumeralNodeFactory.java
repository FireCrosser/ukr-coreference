package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.leaf.NumeralNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class NumeralNodeFactory extends LeafNodeFactory<NumeralNode> {

    public NumeralNodeFactory(PartOfSpeech partOfSpeech) {
        super(partOfSpeech);
    }

    @Override
    public NumeralNode createNode() {
        return new NumeralNode(this.partOfSpeech);
    }

}
