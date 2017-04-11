package ua.edu.ukma.ukrcoref;

import org.languagetool.AnalyzedToken;

public class TaggerProcessor {

    public static Noun processAnalyzedToken(final AnalyzedToken token) {
        Noun noun = new Noun(token.getLemma());
        String[] parts = token.getPOSTag().split(":");
        switch (parts[2]) {
            case "m":
                noun.setGender(NounProperties.Gender.MASCULINE);
                break;
            case "f":
                noun.setGender(NounProperties.Gender.FEMININE);
                break;
            case "n":
                noun.setGender(NounProperties.Gender.NEUTER);
                break;
            default:
                noun.setGender(null);
        }
        switch (parts[1]) {
            
        }
        return noun;
    }
}
