package org.example.UpsolvedPractice.Splitwise;

import org.example.UpsolvedPractice.Splitwise.reposiroty.Split;
import org.example.UpsolvedPractice.Splitwise.reposiroty.User;

public class PercentSplit extends Split {
    double percent;

    public PercentSplit(User User, double percent) {
        super(User);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
