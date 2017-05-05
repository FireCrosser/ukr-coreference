package ua.edu.ukma.ukrcoref.hobbs.visitor;

import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
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

public interface NodeVisitor {
    boolean visit(Sentence node);
    boolean visit(RelativeClause node);
    boolean visit(NounPhraseNode node);
    boolean visit(VerbPhraseNode node);
    boolean visit(PrepositionPhraseNode node);
    boolean visit(NounNode node);
    boolean visit(VerbNode node);
    boolean visit(PronounNode node);
    boolean visit(NumeralNode node);
    boolean visit(PrepositionNode node);
}
