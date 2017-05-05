package ua.edu.ukma.ukrcoref.hobbs;

import java.util.ArrayList;
import java.util.Deque;
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

    public List<NounNode> getAntecedents(PronounNode node) {
        List<NounNode> antecedents = new ArrayList<>();
        Deque<ParseTreeNode> path = new ConcurrentLinkedDeque<>();
        node.acceptDown(new NodePathVisitor(path));
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
            if (node.getClass().equals(NounPhraseNode.class))
                antecedents.add((NounPhraseNode) node);
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
