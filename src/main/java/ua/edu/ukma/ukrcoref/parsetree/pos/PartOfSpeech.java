package ua.edu.ukma.ukrcoref.parsetree.pos;

import java.util.HashSet;
import java.util.Set;
import ua.edu.ukma.ukrcoref.parsetree.pos.tags.Tag;

public abstract class PartOfSpeech {

    protected String word;
//    Describe some semantics of word
    protected Set<Tag> tags;

    public PartOfSpeech(String word) {
        this.word = word;
    }

    public PartOfSpeech(String word, Set<Tag> tags) {
        this.word = word;
        this.tags = new HashSet(tags);
    }
    
    public String getWord() {
        return this.word;
    }

    public Set<Tag> getTags() {
        return this.tags;
    }   
}