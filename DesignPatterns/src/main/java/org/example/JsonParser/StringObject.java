package org.example.JsonParser;

public class StringObject implements JsonObject {
    private String stringVal;

    public StringObject(String stringVal) {
        this.stringVal = stringVal;
    }

    public Object getVal() {
        return this.stringVal;
    }
}
