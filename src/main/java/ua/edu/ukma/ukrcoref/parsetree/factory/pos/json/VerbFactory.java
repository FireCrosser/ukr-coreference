package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.pos.Verb;

public class VerbFactory extends PosJsonAbstractFactory<Verb>{

    public VerbFactory(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public Verb createPartOfSpeech() {
        return new Verb(this.getWord());
    }
    
}
