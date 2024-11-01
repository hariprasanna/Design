package org.example.UpsolvedPractice.Splitwise.reposiroty;

public abstract class Split {
    User User; //who added
    double amount;
    public Split(User User) {
        this.User = User;
    }

    public org.example.UpsolvedPractice.Splitwise.reposiroty.User getUser() {
        return User;
    }

    public void setUser(org.example.UpsolvedPractice.Splitwise.reposiroty.User user) {
        User = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

