package ua.edu.ukma.ukrcoref.hobbs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import ua.edu.ukma.ukrcoref.hobbs.visitor.NodePathVisitor;
import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.phrase.NounPhraseNode;

public class Hobbs {
    
    public List<NounPhraseNode> getAntecedents(PronounNode node) {
        List<NounPhraseNode> antecedents = new ArrayList<>();
        Deque<ParseTreeNode> path = new ConcurrentLinkedDeque<>();
        /*
        Get parent noun phrase and build the path up 
        to first noun phrase or sentence
         */
        NounPhraseNode npn = (NounPhraseNode) node.getParent();
        if (npn != null) {
            if (npn.getParent() != null)
                npn.getParent().acceptUp(new NodePathVisitor(path));
        }
        /*
        Get all children to the left of path and traverse them for noun phrases
         */
        ParseTreeNode pathHead = path.removeLast();
        List<ParseTreeNode> leftNodes = new ArrayList<>();
        if (!path.isEmpty()) {
            ParseTreeNode pathHeadChildren = path.getLast();
            Iterator<ParseTreeNode> iter = pathHead.getChildren().
                    iterator();
            while (iter.hasNext()) {
                ParseTreeNode child = iter.next();
                if (child == pathHeadChildren)
                    break;
                leftNodes.add(child);
            }
        }
        antecedents.addAll(traverseBreadthFirstForAntecedents(leftNodes));
        return antecedents;
    }
    
    public static List<ParseTreeNode> traverseBreadthFirst(ParseTreeNode root) {
        List<ParseTreeNode> result = new ArrayList<>();
        Queue<ParseTreeNode> queue = new ConcurrentLinkedQueue();
        queue.add(root);
        while (!queue.isEmpty()) {
            ParseTreeNode node = queue.remove();
            result.add(node);
            List<ParseTreeNode> children = node.getChildren();
            if (children != null)
                children.stream().
                        forEach((node1) -> {
                            queue.add((ParseTreeNode) node1);
                        });
        }
        return result;
    }

    /*
    TODO: 
    1. Find antecedents without class comparing.
    2. Semantic filters.
    3. Hobbs filters.
    4. Continue traversal after getting to the main Sentence node.
     */
    public static List<NounPhraseNode> traverseBreadthFirstForAntecedents(
            List<ParseTreeNode> nodes) {
        List<NounPhraseNode> antecedents = new ArrayList<>();
        Queue<ParseTreeNode> queue = new ConcurrentLinkedQueue();
        nodes.stream().
                forEach((node) -> {
                    queue.add(node);
                });
        while (!queue.isEmpty()) {
            ParseTreeNode node = queue.remove();
            if (node.getClass().equals(NounPhraseNode.class)) {
                NounPhraseNode nounNode = (NounPhraseNode) node;
                if (nounNode.getHead().equals(NounNode.class))
                    antecedents.add((NounPhraseNode) node);
            }
            List<ParseTreeNode> children = node.getChildren();
            if (children != null)
                children.stream().
                        forEach((node1) -> {
                            queue.add((ParseTreeNode) node1);
                        });
        }
        return antecedents;
    }
}
