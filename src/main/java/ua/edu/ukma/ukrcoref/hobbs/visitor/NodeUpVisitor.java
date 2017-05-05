package ua.edu.ukma.ukrcoref.hobbs.visitor;

import java.util.Queue;
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

public class NodeUpVisitor implements NodeVisitor {

    private final Queue<ParseTreeNode> path;

    public NodeUpVisitor(Queue<ParseTreeNode> path) {
        this.path = path;
    }

    @Override
    public void visit(Sentence node) {
        path.add(node);
    }

    @Override
    public void visit(RelativeClause node) {
        path.add(node);
    }

    @Override
    public void visit(NounPhraseNode node) {
        path.add(node);
    }

    @Override
    public void visit(VerbPhraseNode node) {
        path.add(node);
    }

    @Override
    public void visit(PrepositionPhraseNode node) {
        path.add(node);
    }

    @Override
    public void visit(NounNode node) {
        path.add(node);
    }

    @Override
    public void visit(VerbNode node) {
        path.add(node);
    }

    @Override
    public void visit(PronounNode node) {
        path.add(node);
    }

    @Override
    public void visit(NumeralNode node) {
        path.add(node);
    }

    @Override
    public void visit(PrepositionNode node) {
        path.add(node);
    }

}
