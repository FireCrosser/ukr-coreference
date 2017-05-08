package ua.edu.ukma.ukrcoref.parsetree.pos;

import ua.edu.ukma.ukrcoref.NounProperties;

public class Pronoun extends PartOfSpeech {

    private NounProperties.Gender gender;
    private NounProperties.Case ncase;
    private NounProperties.Number number;
    private NounProperties.Declension declension;

    public Pronoun(String word) {
        super(word);
    }
}
