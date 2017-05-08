package ua.edu.ukma.ukrcoref.parsetree.pos;

import ua.edu.ukma.ukrcoref.NounProperties;

public class Noun extends PartOfSpeech {

    public Noun(String word) {
        super(word);
    }

    private NounProperties.Gender gender;
    private NounProperties.Case ncase;
    private NounProperties.Number number;
    private NounProperties.Declension declension;
}
