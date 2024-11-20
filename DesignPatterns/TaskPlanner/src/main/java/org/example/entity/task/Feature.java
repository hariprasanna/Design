package org.example.entity.task;


import org.example.enums.ImpactLevel;
import org.example.enums.Status;
import org.example.stateChange.State;

import java.util.Arrays;

import static org.example.enums.Status.*;

public class Feature extends Task implements State {
    private String featureSummary;
    private ImpactLevel impactLevel;

    public Feature() {
        validStatuses = Arrays.asList(OPEN, IN_PROGRESS, TESTING, DEPLOYED);
    }

    @Override
    public boolean validateState(Status oldStatus, Status newStatus) {
        return validStatuses.contains(oldStatus) && validStatuses.contains(newStatus);
    }

}
