package org.example.UpsolvedPractice.Splitwise.reposiroty;

import org.example.UpsolvedPractice.Splitwise.ExpenseMetadata;

import java.util.List;

public class ExactExpense extends Expense {
    public ExactExpense(double amount, User paidBy, List<Split> splits, ExpenseMetadata expenseMetadata) {
        super(amount, paidBy, splits, expenseMetadata);
    }

    public boolean validate() {
        double totalAmount = getAmount();
        double sum = 0;
        for(Split split : getSplits()) {
            if(!(split instanceof ExactSplit)) {
                return false;
            } else {
                ExactSplit exactSplit = (ExactSplit) split;
                sum += exactSplit.getAmount();
            }
        }
        if(sum != totalAmount) {
            return false;
        }
        return true;
    }

}
