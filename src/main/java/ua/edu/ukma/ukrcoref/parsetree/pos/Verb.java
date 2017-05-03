package ua.edu.ukma.ukrcoref.parsetree.pos;

import ua.edu.ukma.ukrcoref.NounProperties;

public class Verb implements IPartOfSpeech {

    @Override
    public String getWord() {
        return word;
    }

    private String word;
    private NounProperties.Gender gender;
    private NounProperties.Number number;
}
