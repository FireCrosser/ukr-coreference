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
    void visit(Sentence node);
    void visit(RelativeClause node);
    void visit(NounPhraseNode node);
    void visit(VerbPhraseNode node);
    void visit(PrepositionPhraseNode node);
    void visit(NounNode node);
    void visit(VerbNode node);
    void visit(PronounNode node);
    void visit(NumeralNode node);
    void visit(PrepositionNode node);
}
