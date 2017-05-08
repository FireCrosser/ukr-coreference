package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Adjective;

public class AdjectiveFactory extends PosJsonAbstractFactory<Adjective>{

    public AdjectiveFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Adjective createPartOfSpeech() {
        return new Adjective(this.getWord());
    }
    
}
