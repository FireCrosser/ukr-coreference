package ua.edu.ukma.ukrcoref.hobbs.utils.semantics;

import ua.edu.ukma.ukrcoref.parsetree.ParseTreeNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.NounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.PronounNode;
import ua.edu.ukma.ukrcoref.parsetree.leaf.VerbNode;
import ua.edu.ukma.ukrcoref.parsetree.pos.Verb;

public class NounPronounConstraint implements SemanticConstraint<NounNode, PronounNode>{

    private final NounNode antecedent;
    private final PronounNode anaphora;
    private final Verb verb;

    public NounPronounConstraint(NounNode nounNode, PronounNode verbNode, Verb verb) {
        this.antecedent = nounNode;
        this.anaphora = verbNode;
        this.verb = verb;
    }

    @Override
    public NounNode getFirstArgument() {
        return this.antecedent;
    }

    @Override
    public PronounNode getSecondArgument() {
        return this.anaphora;
    }

    @Override
    public boolean check() {
        ParseTreeNode parentNode = anaphora.getParent();
        for (Object child: parentNode.getChildren())
        {
            if (child.getClass().equals(VerbNode.class))
            {
                
            }
        }
            
        return false;
    }
}
