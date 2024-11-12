package org.example.Atm;

import javax.smartcardio.Card;

public class User {
    private UserBankAccount bankAccount;
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card car) {
        this.card = car;
    }
}
