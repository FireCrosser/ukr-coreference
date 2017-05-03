package ua.edu.ukma.ukrcoref;

public class NounProperties {

    public enum Gender {
        MASCULINE,
        FEMININE,
        NEUTER,
        NONE;
    }

    public enum Case {
        NOMINATIVE,
        GENITIVE,
        DATIVE,
        ACCUSATIVE,
        INSTRUMENTAL,
        LOCATIVE,
        VOCATIVE;
    }

    public enum Number {
        SINGULAR,
        PLURAL;
    }

    public enum Declension {
        FIRST,
        SECOND,
        THIRD,
        FOURTH;
    }

    public enum DeclensionGroup {
        HARD,
        SOFT,
        MIXED,
        NONE;
    }
}
