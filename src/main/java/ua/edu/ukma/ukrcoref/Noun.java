package ua.edu.ukma.ukrcoref;

import org.apache.commons.lang3.Validate;
import org.languagetool.AnalyzedToken;
import ua.edu.ukma.ukrcoref.NounProperties.Case;
import ua.edu.ukma.ukrcoref.NounProperties.Declension;
import ua.edu.ukma.ukrcoref.NounProperties.Gender;
import ua.edu.ukma.ukrcoref.NounProperties.Number;

public class Noun {

    public Noun(String word) {
        this.word = word;
    }

    public Noun(AnalyzedToken token) {
        createFromAnalyzedToken(token);
    }

    private void createFromAnalyzedToken(AnalyzedToken token) {
        String[] tokenParts = token.getPOSTag().split(":");
        Validate.isTrue(tokenParts[0].equals("noun"), "Word must be a noun.");
        this.setWord(token.getLemma());
        setGenderAndNumberFromAnalyzedTokenGender(tokenParts[2]);
        setCaseFromAnalyzedTokenCase(tokenParts[3]);
    }

    private void setGenderAndNumberFromAnalyzedTokenGender(String gender) {
        this.setNumber(Number.SINGULAR);
        switch (gender) {
            case "m":
                this.setGender(NounProperties.Gender.MASCULINE);
                break;
            case "f":
                this.setGender(NounProperties.Gender.FEMININE);
                break;
            case "n":
                this.setGender(NounProperties.Gender.NEUTER);
                break;
            case "p":
                this.setGender(Gender.NONE);
                this.setNumber(Number.PLURAL);
                break;
            default:
                this.setGender(null);
                this.setNumber(null);
                break;
        }
    }

    private void setCaseFromAnalyzedTokenCase(String ncase) {
        switch (ncase) {
            case "v_naz":
                this.setCase(Case.NOMINATIVE);
                break;
            case "v_rod":
                this.setCase(Case.GENITIVE);
                break;
            case "v_dav":
                this.setCase(Case.DATIVE);
                break;
            case "v_zna":
                this.setCase(Case.ACCUSATIVE);
                break;
            case "v_oru":
                this.setCase(Case.INSTRUMENTAL);
                break;
            case "v_mis":
                this.setCase(Case.LOCATIVE);
                break;
            case "v_kly":
                this.setCase(Case.VOCATIVE);
                break;
        }
    }

    public static boolean isNoun(AnalyzedToken token) {
        String posTag = token.getPOSTag();
        if (posTag != null) {
            String[] properties = posTag.split(":");
            return properties.length == 4
                    && properties[0].equals("noun");
        } else {
            return false;
        }
    }

    public void determineDeclension() {
        return;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Case getCase() {
        return ncase;
    }

    public void setCase(Case ncase) {
        this.ncase = ncase;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Declension getDeclension() {
        return declension;
    }

    public void setDeclension(Declension declension) {
        this.declension = declension;
    }

    @Override
    public String toString() {
        return "Noun{" + "word=" + word + ", gender=" + gender + ", case=" + ncase + ", number=" + number + ", declension=" + declension + '}';
    }

    private String word;
    private Gender gender;
    private Case ncase;
    private Number number;
    private Declension declension;
}
