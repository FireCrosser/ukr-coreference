package ua.edu.ukma.ukrcoref.hobbs.visitor;

import java.util.List;
import ua.edu.ukma.ukrcoref.parsetree.RelativeClause;
import ua.edu.ukma.ukrcoref.parsetree.Sentence;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NumeralNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PrepositionNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.VerbNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.NounPhraseNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.PrepositionPhraseNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.VerbPhraseNode;

public class PronounVisitor implements NodeVisitor {

    private final List<PronounNode> pronouns;

    public PronounVisitor(List<PronounNode> pronouns) {
        this.pronouns = pronouns;
    }

    @Override
    public boolean visit(Sentence node) {
        return true;
    }

    @Override
    public boolean visit(RelativeClause node) {
        return true;
    }

    @Override
    public boolean visit(NounPhraseNode node) {
        return true;
    }

    @Override
    public boolean visit(VerbPhraseNode node) {
        return true;
    }

    @Override
    public boolean visit(PrepositionPhraseNode node) {
        return true;
    }

    @Override
    public boolean visit(NounNode node) {
        return false;
    }

    @Override
    public boolean visit(VerbNode node) {
        return false;
    }

    @Override
    public boolean visit(PronounNode node) {
        pronouns.add(node);
        return false;
    }

    @Override
    public boolean visit(NumeralNode node) {
        return false;
    }

    @Override
    public boolean visit(PrepositionNode node) {
        return false;
    }

}
