package ua.edu.ukma.ukrcoref.parsetree.leaf;

import ua.edu.ukma.ukrcoref.parsetree.pos.Numeral;

public class NumeralNode extends LeafNode<Numeral> {

    private Numeral numeral;

    @Override
    public Numeral getData() {
        return numeral;
    }
}
