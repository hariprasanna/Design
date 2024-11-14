package org.example.JsonParser;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.JsonParser.JsonParsingPhase.*;

public class JsonParser {
    int index;
    private String input;
    private Json json;

    public void insertInput(String input) throws Exception {
        this.input = input;
        this.index = 0;
        this.json = new Json(parseJson());
        System.out.println(json);
    }

    public Map<String, JsonObject> parseJson() throws Exception {
        Map<String, JsonObject> currMap = new HashMap<>();
        JsonParsingPhase phase = OPEN;
        String lastKey = null;
        while(index < input.length()) {
            skipSpaces();
            char c = input.charAt(index);
            switch(phase) {
                case OPEN:
                    phase = KEY;
                    index++;
                    break;
                case KEY:
                    if(c != '"') {invalidJson();}
                    if(!currMap.containsKey(lastKey)) invalidJson();
                    lastKey = parseString();
                    phase = VALUE;
                    break;
                case VALUE:
                    JsonObject o = null;
                    if(index == '{') {
                        index++;
                        o = (JsonObject) parseJson(); //same call
                    } else if(index == '[') {
                        o = new ArrayObject(parseArray());
                    } else if(index == '"') {
                        o = new StringObject(parseString());
                    } else if(Character.isDigit(index)) {
                        o = new NumberObject(parseInt());
                    }
                    currMap.put(lastKey, o);
                    phase = KEY;
                    break;
                case CLOSE:
                    if(c == '}') {

                    }
                    break;
                default:
                    invalidJson();
                    break;
            }
        }
        return currMap;
    }

    public List<JsonObject> parseArray() throws Exception {
        index++;
        skipSpaces();
        boolean isInteger = false;
        List<JsonObject> jsonObjects = new ArrayList<>();
        if(!Character.isDigit(input.charAt(index))) {
            isInteger = true;
        }
        while(index < input.length()) {
            char c = input.charAt(index);
            if(c == ',') {
                index++;
                continue;
            }
            if(isInteger && !Character.isDigit(c)) {
                jsonObjects.add(new NumberObject(parseInt()));
            } else if(c == '"') {
                jsonObjects.add(new StringObject(parseString()));
            }
            index++;
        }
        return jsonObjects;
    }

    public int parseInt() throws Exception {
        int i = index;
        int res = 0;
        while(i++ < input.length()) {
            char c = input.charAt(i);
            if(c == ',') break;
            else if(c == ' ') {
                continue;
            } else if(!Character.isDigit(c)) {
                invalidJson();
            }
            res = res * 10 + (c-'0');
        }
        index = i;
        return res;
    }

    public String parseString() throws Exception { //starts from "
        int i = index;
        StringBuilder s = new StringBuilder();
        int countOfQuotes = 0;
        while(i < input.length()) {
            char c = input.charAt(i);
            if(c == '"' && countOfQuotes < 2) {
                countOfQuotes++;
                if(countOfQuotes == 2) break;
            } else if(c == '"') {
                invalidJson();
            } else {
                s.append(c);
            }
            i++;
        }
        index = i;
        return s.toString();
    }

    public void invalidJson() throws Exception {
        throw new Exception("Invalid Json");
    }

    public void skipSpaces() {
        while(index < input.length()) {
            char c = input.charAt(index);
            if(c == ' ') index++;
        }
    }

}
