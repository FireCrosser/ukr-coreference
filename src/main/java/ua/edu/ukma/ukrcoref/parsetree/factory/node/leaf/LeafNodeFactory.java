package ua.edu.ukma.ukrcoref.parsetree.factory.node.leaf;

import ua.edu.ukma.ukrcoref.parsetree.factory.node.NodeAbstractFactory;
import ua.edu.ukma.ukrcoref.parsetree.leaf.LeafNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public abstract class LeafNodeFactory<T extends LeafNode> implements NodeAbstractFactory<T> {
    protected final PartOfSpeech partOfSpeech;

    public LeafNodeFactory(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
