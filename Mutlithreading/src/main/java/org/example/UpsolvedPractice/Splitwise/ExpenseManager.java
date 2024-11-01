package org.example.UpsolvedPractice.Splitwise;

import org.example.UpsolvedPractice.Splitwise.reposiroty.Expense;
import org.example.UpsolvedPractice.Splitwise.reposiroty.Split;
import org.example.UpsolvedPractice.Splitwise.reposiroty.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseManager {
    List<Expense> expenses;
    Map<String, User> userMap;
    Map<String, Map<String, Double>> balanceSheet;

    public ExpenseManager() {

    }

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
        balanceSheet.put(user.getUserId(), new HashMap<>());
    }

    public void addExpense(ExpenseType expenseType, double amount, String paidBy, List<Split> splits, ExpenseMetadata expenseMetadata) {
        //Expense expense = ;
    }

}
