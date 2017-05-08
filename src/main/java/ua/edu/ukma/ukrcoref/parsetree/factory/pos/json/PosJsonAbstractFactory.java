package ua.edu.ukma.ukrcoref.parsetree.factory.pos.json;

import com.google.gson.JsonObject;
import ua.edu.ukma.ukrcoref.parsetree.factory.pos.PosAbstractFactory;
import ua.edu.ukma.ukrcoref.parsetree.pos.PartOfSpeech;

public abstract class PosJsonAbstractFactory<T extends PartOfSpeech> implements
        PosAbstractFactory<T> {

    protected JsonObject jsonObject;

    public PosJsonAbstractFactory(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    protected String getWord() {
        if (this.jsonObject.has("word"))
            return this.jsonObject.get("word").getAsString();
        else
            throw new IllegalArgumentException(
                    "Json object, which represents word, must have field \"word\"");
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
