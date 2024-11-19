package org.example.stateChange;

import org.example.enums.Status;

public interface State {
    boolean validateState(Status oldStatus, Status newStatus);
    void moveState(Status newState);
}
