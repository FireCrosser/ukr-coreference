package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Pronoun;

public class PronounFactory extends PosJsonAbstractFactory<Pronoun>{

    public PronounFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Pronoun createPartOfSpeech() {
        return new Pronoun(this.getWord());
    }
    
}
