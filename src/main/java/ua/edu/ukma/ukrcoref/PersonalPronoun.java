package ua.edu.ukma.ukrcoref;

import org.apache.commons.lang3.Validate;
import org.languagetool.AnalyzedToken;

public class PersonalPronoun {

    public PersonalPronoun(String word) {
        this.word = word;
    }
    
    public PersonalPronoun(AnalyzedToken token) {
        createFromAnalyzedToken(token);
    }
    
    private void createFromAnalyzedToken(AnalyzedToken token) {
        String[] tokenParts = token.getPOSTag().split(":");
        this.setWord(token.getLemma());
//        setGenderAndNumberFromAnalyzedTokenGender(tokenParts[2]);
//        setCaseFromAnalyzedTokenCase(tokenParts[3]);
    }
    
    public static boolean isPersonalPronoun(AnalyzedToken token) {
        String posTag = token.getPOSTag();
        if (posTag != null) {
            String[] properties = posTag.split(":");
            return properties.length == 6 
                    && properties[0].equals("noun") 
                    && properties[3].equals("&pron")
                    && properties[4].equals("pers");
        } else {
            return false;
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public NounProperties.Gender getGender() {
        return gender;
    }

    public void setGender(NounProperties.Gender gender) {
        this.gender = gender;
    }

    public NounProperties.Case getNcase() {
        return ncase;
    }

    public void setNcase(NounProperties.Case ncase) {
        this.ncase = ncase;
    }

    public NounProperties.Number getNumber() {
        return number;
    }

    public void setNumber(NounProperties.Number number) {
        this.number = number;
    }

    private String word;
    private NounProperties.Gender gender;
    private NounProperties.Case ncase;
    private NounProperties.Number number;
}
