package ua.edu.ukma.ukrcoref.parsetree.pos;

import ua.edu.ukma.ukrcoref.NounProperties;

public class Verb extends PartOfSpeech {

    private NounProperties.Gender gender;
    private NounProperties.Number number;

    public Verb(String word) {
        super(word);
    }
}
