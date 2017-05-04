package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.parsetree.pos.Pronoun;

public class PronounNode extends LeafNode<Pronoun> {

    private Pronoun pronoun;

    @Override
    public Pronoun getData() {
        return pronoun;
    }
}
