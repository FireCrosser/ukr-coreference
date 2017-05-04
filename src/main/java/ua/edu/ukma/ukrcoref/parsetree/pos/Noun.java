package ua.edu.ukma.ukrcoref.parsetree.pos;

import ua.edu.ukma.ukrcoref.NounProperties;

public class Noun implements PartOfSpeech {

    @Override
    public String getWord() {
        return word;
    }

    private String word;
    private NounProperties.Gender gender;
    private NounProperties.Case ncase;
    private NounProperties.Number number;
    private NounProperties.Declension declension;
}
