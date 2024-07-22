package CAT-2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager implements Serializable {
    private List<Transaction> transactions;
    private double totalIncome;
    private double totalExpense;



public ExpenseManager() {
    this.transactions = new ArrayList<>();
    this.totalIncome = 0;
    this.totalExpense = 0;
}

public void addTransaction (Transaction transaction) {
    transactions.add(transaction);
    if(transaction.getTransaction_Type().equalsIgnoreCase("Income")) {
        totalIncome += transaction.getamount();
    } else if (transaction.getTransaction_Type().equalsIgnoreCase("Expense")){
        totalExpense += transaction.getamount();
    


    }
    }

    public void viewTransactions() {
        for(Transaction transaction:transactions) {
            System.out.println(transaction);
        }
    }
    public void totalstatistics() {
        System.out.println("Total Income"+totalIncome);
        System.out.println("Total Expense"+totalExpense);
        System.out.println("Net Balance"+(totalIncome-totalExpense));



    }

    public List<Transaction> getTransactions() {
        return transactions;

    }

    public double getTotalIncome (){
        return totalIncome;
    }

    public double getTotalExpense(){
        return totalExpense;
    }
}

