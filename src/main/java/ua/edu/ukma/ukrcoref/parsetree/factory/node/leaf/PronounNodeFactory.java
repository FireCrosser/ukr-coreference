package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class PronounNodeFactory extends LeafNodeFactory<PronounNode> {

    public PronounNodeFactory(PartOfSpeech partOfSpeech) {
        super(partOfSpeech);
    }

    @Override
    public PronounNode createNode() {
        return new PronounNode(this.partOfSpeech);
    }
}
