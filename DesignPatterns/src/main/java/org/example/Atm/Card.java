package org.example.Atm;

public class Card {
    private UserBankAccount bankAccount;
    private int cardNumber;
    private int PIN_NUMBER = 1111;
    private int expiryDate;

    public boolean isCorrectPinNumber(int pin) {
        return pin==PIN_NUMBER;
    }

    public int getBankAccountNumber() {
        return bankAccount.balance;
    }

}
