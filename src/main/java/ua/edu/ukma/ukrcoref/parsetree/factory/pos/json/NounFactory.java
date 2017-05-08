package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Noun;

public class NounFactory extends PosJsonAbstractFactory<Noun>{

    public NounFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Noun createPartOfSpeech() {
        return new Noun(this.getWord());
    }
}
