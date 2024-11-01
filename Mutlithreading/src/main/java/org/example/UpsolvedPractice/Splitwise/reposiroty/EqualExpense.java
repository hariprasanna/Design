package org.example.UpsolvedPractice.Splitwise.reposiroty;

import org.example.UpsolvedPractice.Splitwise.ExpenseMetadata;

import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(User paidBy, List<Split> splits, ExpenseMetadata expenseMetadata) {
        super(0, paidBy, splits, expenseMetadata);
        //super(paidBy, splits, expenseMetadata);
    }

    @Override
    public boolean validate() {
        return false;
    }
}
