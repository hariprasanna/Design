package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class Jira {
    Map<String, Jira> sprintMap = new HashMap<>();
    int totalSprints = 0;
    void addSprint() {
        Jira jira = new Jira();
        sprintMap.put("id"+String.valueOf(totalSprints), jira);
    }
    void deleteSprint(String id) {
        sprintMap.remove(id);
    }

}
