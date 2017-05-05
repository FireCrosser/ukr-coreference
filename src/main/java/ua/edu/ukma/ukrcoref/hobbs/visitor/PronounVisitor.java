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
    public void visit(Sentence node) {
    }

    @Override
    public void visit(RelativeClause node) {
    }

    @Override
    public void visit(NounPhraseNode node) {
    }

    @Override
    public void visit(VerbPhraseNode node) {
    }

    @Override
    public void visit(PrepositionPhraseNode node) {
    }

    @Override
    public void visit(NounNode node) {
    }

    @Override
    public void visit(VerbNode node) {
    }

    @Override
    public void visit(PronounNode node) {
        pronouns.add(node);
    }

    @Override
    public void visit(NumeralNode node) {
    }

    @Override
    public void visit(PrepositionNode node) {
    }

}
