package Transactions;

public class Expensemanager extends Transaction { // Extending Transaction class

    public long income; // Declaring data members
    public long expense;

    public Expensemanager() { // Default constructor
        long income;
        long expense;
    }

    public Expensemanager(String date, long amount, String trans_type) { // Parameterized constructor
        super(date, amount, trans_type);
        if(trans_type.equals("Income")){
            this.income = amount;
        }
        else if(trans_type.equals("Expense")){
            this.expense = amount;
        }
    }

    public String getExpenseDetails() {      // Getting expense details
        return date + "\t" + amount + "\t" + trans_type;
    }
}