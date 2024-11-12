package org.example.Atm;

import org.example.Atm.StateMachine.AtmState;
import org.example.Atm.StateMachine.IdleState;

public class Atm { //singleton object

    private static Atm atmObject = new Atm();

    public void setCurrentAtmState(AtmState currentAtmState) {
        this.currentAtmState = currentAtmState;
    }

    AtmState currentAtmState;
    private int noOfFiveHundredNotes;
    private int noOfTwoThousandNotes;
    private int noOfThousandNotes;
    private int atmBalance;

    public static Atm getAtmObject() {
        atmObject.setCurrentAtmState(new IdleState());
        return atmObject;
    }

    public AtmState getCurrentAtmState() {
        return currentAtmState;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfThousandNotes() {
        return noOfThousandNotes;
    }

    public void deduceThousandNotes(int number) {
        this.noOfThousandNotes -= number;
    }

    public void deduceTwoThousandNotes(int number) {
        this.noOfTwoThousandNotes -= number;
    }

    public void deduceFiveHundredNotes(int number) {
        this.noOfFiveHundredNotes -= number;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfFiveHundredNotes, int noOfTwoThousandNotes, int noOfThousandNotes) {
        this.atmBalance = atmBalance;
        this.noOfThousandNotes = noOfThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }
}
