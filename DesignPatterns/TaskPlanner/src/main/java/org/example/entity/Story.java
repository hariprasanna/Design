package org.example.entity;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.example.enums.Status.*;

public class Story extends Task {

    Map<String, Subtrack> subtrackMap = new HashMap<>();
    private String storySummary;

    public Story() {
        this.validStatuses = Arrays.asList(OPEN, IN_PROGRESS, COMPLETED);
    }

}
