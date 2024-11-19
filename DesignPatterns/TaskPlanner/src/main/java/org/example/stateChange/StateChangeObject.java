package org.example.stateChange;

import org.example.enums.Status;

import java.util.List;

public class StateChangeObject implements State {
    protected Status status;
    protected List<Status> validStatuses;

    @Override
    public boolean validateState(Status oldStatus, Status newStatus) {
        return validStatuses.contains(newStatus) && validStatuses.contains(oldStatus);
    }

    @Override
    public void moveState(Status newState) {
        if(validStatuses.contains(newState)) {
            this.status = newState;
        }
    }
}
