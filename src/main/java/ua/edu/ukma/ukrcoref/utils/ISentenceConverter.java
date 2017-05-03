package ua.edu.ukma.ukrcoref.utils;

import ua.edu.ukma.ukrcoref.parsetree.Sentence;

public interface ISentenceConverter {

    public Sentence convert(String input);
}
