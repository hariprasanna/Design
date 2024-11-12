package org.example.Atm;

public class AtmRoom {
    Atm atm;
    User user;
    public static void main(String[] args) {
        AtmRoom atmRoom = new AtmRoom();
        atmRoom.initialize();
    }

    private void initialize() {

    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        return card;
    }

}
