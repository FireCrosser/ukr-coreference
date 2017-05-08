package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Preposition;

public class PrepositionFactory extends PosJsonAbstractFactory<Preposition> {

    public PrepositionFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Preposition createPartOfSpeech() {
        return new Preposition(this.getWord());
    }
}
