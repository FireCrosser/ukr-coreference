package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Numeral;

public class NumeralFactory extends PosJsonAbstractFactory<Numeral>{

    public NumeralFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Numeral createPartOfSpeech() {
        return new Numeral(this.getWord());
    }
    
}
