package org.example.entity.task;

import org.example.enums.Severity;
import org.example.enums.Status;

import java.util.Arrays;

import static org.example.enums.Status.*;

public class Bug extends Task {
    private Severity severity;
    public Bug() {
        validStatuses = Arrays.asList(OPEN, IN_PROGRESS, FIXED);
    }

    @Override
    public boolean validateState(Status oldStatus, Status newStatus) {
        return false;
    }

    @Override
    public void moveState(Status newState) {

    }
}
