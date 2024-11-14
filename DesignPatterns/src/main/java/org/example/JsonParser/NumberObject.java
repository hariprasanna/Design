package org.example.JsonParser;

public class NumberObject implements JsonObject {
    public int numberVal;

    public NumberObject(Integer numberVal) {
        this.numberVal = numberVal;
    }

    public Object getVal() {
        return this.numberVal;
    }
}
