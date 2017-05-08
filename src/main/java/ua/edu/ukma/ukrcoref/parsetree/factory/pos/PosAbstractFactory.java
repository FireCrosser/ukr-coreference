package ua.edu.ukma.ukrcoref.parsetree.factory.pos;

import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public interface PosAbstractFactory<T extends PartOfSpeech> {
    T createPartOfSpeech();
}
