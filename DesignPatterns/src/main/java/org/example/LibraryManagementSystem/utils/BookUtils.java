package org.example.LibraryManagementSystem.utils;

import java.util.ArrayList;
import java.util.List;

public class BookUtils {
    public List<String> fetchListFromCSL(String value) { //fetches from comma separated list
        List<String> list = new ArrayList<>();
        String val = "";
        for(char c: value.toCharArray()) {
            if(c == ',') {
                list.add(val);
                val = "";
            } else val += c;
        }
        if(!val.equals("")) {
            list.add(val);
        }
        return list;
    }
}
