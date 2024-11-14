package org.example.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class ArrayObject implements JsonObject{
    public List<JsonObject> elements = new ArrayList<>();

    public ArrayObject(List<JsonObject> objects) {
        this.elements.addAll(objects);
    }

    @Override
    public Object getVal() {
        return elements;
    }
}
