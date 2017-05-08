package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public class PosJsonFactory {
    
     public static PartOfSpeech createNode(PosJsonAbstractFactory factory) {
        return factory.createPartOfSpeech();
    }
}
