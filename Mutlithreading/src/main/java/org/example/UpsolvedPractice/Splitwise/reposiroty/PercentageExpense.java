package org.example.UpsolvedPractice.Splitwise.reposiroty;

import org.example.UpsolvedPractice.Splitwise.ExpenseMetadata;

import java.util.List;

public class PercentageExpense extends Expense {

    public PercentageExpense(double amount, User paidBy, List<Split> splits, ExpenseMetadata expenseMetadata) {
        super(amount, paidBy, splits, expenseMetadata);
    }
    @Override
    public boolean validate() {
        return false;
    }

}
