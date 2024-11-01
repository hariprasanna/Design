package org.example.UpsolvedPractice.Splitwise;

import org.example.UpsolvedPractice.Splitwise.reposiroty.*;

import java.util.List;

public class ExpenseFactory {
    public static Expense getExpense(ExpenseType expenseType, double amount, List<Split> splits, User paidBy, ExpenseMetadata expenseMetadata) {
        switch (expenseType) {
            case EXACT:
                return new ExactExpense(amount, paidBy, splits, expenseMetadata);
            case EQUAL:
            case PERCENT:
                for(Split split : splits) {
                    PercentSplit percentSplit = (PercentSplit) split;
                    percentSplit.setAmount(amount*percentSplit.getPercent());
                }
                new ExactExpense(amount, paidBy, splits, expenseMetadata);
            default:
                new ExactExpense(amount, paidBy, splits, expenseMetadata);
        }
        return null;
    }
}
