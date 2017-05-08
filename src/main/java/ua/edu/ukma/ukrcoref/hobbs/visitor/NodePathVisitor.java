package ua.edu.ukma.ukrcoref.hobbs.visitor;

import java.util.Deque;
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

public class NodePathVisitor implements NodeVisitor {

    private final Deque<ParseTreeNode> path;

    public NodePathVisitor(Deque<ParseTreeNode> path) {
        this.path = path;
    }

    @Override
    public boolean visit(Sentence node) {
        path.add(node);
        return false;
    }

    @Override
    public boolean visit(RelativeClause node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(NounPhraseNode node) {
        path.add(node);
        return false;
    }

    @Override
    public boolean visit(VerbPhraseNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(PrepositionPhraseNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(NounNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(VerbNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(PronounNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(NumeralNode node) {
        path.add(node);
        return true;
    }

    @Override
    public boolean visit(PrepositionNode node) {
        path.add(node);
        return true;
    }

}
