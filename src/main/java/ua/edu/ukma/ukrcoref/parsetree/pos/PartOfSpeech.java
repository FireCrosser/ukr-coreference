package ua.edu.ukma.ukrcoref.parsetree.pos;

public abstract class PartOfSpeech {

    protected String word;

    public PartOfSpeech(String word) {
        this.word = word;
    }
    
    public String getWord() {
        return this.word;
    }
}
