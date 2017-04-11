package ua.edu.ukma.ukrcoref;

import java.util.List;
import org.languagetool.AnalyzedToken;
import org.languagetool.tagging.uk.UkrainianTagger;

public class UTagger extends UkrainianTagger {

    public static void main(String[] args) {
        UTagger tagger = new UTagger();
        List<AnalyzedToken> tokens = tagger.getAnalyzedTokens("ми");
        String delimeter = "";
        for (AnalyzedToken token : tokens) {
            System.out.print(delimeter);
            if (Noun.isNoun(token)) {
                Noun noun = new Noun(token);
                System.out.println(noun);
            }
            System.out.print(token.getLemma() + ' ' + token.getPOSTag());
            delimeter = "\n===============\n";
        }
        System.err.println("\n");
        tokens = tagger.getAnalyzedTokens("жінка");
        delimeter = "";
        for (AnalyzedToken token : tokens) {
            System.out.print(delimeter);
            if (Noun.isNoun(token)) {
                Noun noun = new Noun(token);
                System.out.println(noun);
            }
            System.out.print(token.getLemma() + ' ' + token.getPOSTag());
            delimeter = "\n===============\n";
        }
    }
}
