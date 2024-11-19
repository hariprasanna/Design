package org.example.entity;

import org.example.enums.Status;
import org.example.stateChange.StateChangeObject;

import java.util.Arrays;

import static org.example.enums.Status.*;

public class Subtrack extends StateChangeObject {
    private String title;
    private String storySummary;

    public Subtrack(String title, String storySummary) {
        this.validStatuses = Arrays.asList(OPEN, IN_PROGRESS, COMPLETED);
    }

    public Subtrack(String title, String storySummary, Status status) {
        this.title = title;
        this.storySummary = storySummary;
        this.status = status;
    }
}
