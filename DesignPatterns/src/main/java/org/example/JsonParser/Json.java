package org.example.JsonParser;

import java.util.HashMap;
import java.util.Map;

public class Json implements JsonObject {
    Map<String, JsonObject> map = new HashMap<>();

    public Json(Map<String, JsonObject> properties) {
        this.map.putAll(properties);
    }

    @Override
    public Object getVal() {
        Map<String, Object> finalMap = new HashMap<>();
        map.forEach((key,value) -> finalMap.put(key, value.getVal()));
        return finalMap;
    }
}
