
import java.util.Scanner;

// Here we are applying inheritance that is Transaction is extended to ExpenseManager class
public class Expensemanager extends Transaction {
    private static final long Amount = 0;
    private long TotalIncome;
    private long Expense;

    Scanner input = new Scanner(System.in);
    private long Income;

    // As per the inheritance property here we define super as per the Transaction file
    public Expensemanager() {
        super();
        TotalIncome = 0;
        Expense = 0;
    }

    // Parameterized Constructor regarding Inheritance Property
    public Expensemanager(String Date, String Transaction_type, Long Amount, String Description, long Income,
            long Expense) {
        super(Date, Transaction_type, Amount, Description);
        // this.TotalIncome = Calculate(this.Amount);
        this.Expense = Expense;
        this.Income = Income;
    }
}

//     public long getTotalExpense(){
//       int coexpense;
//     for (int i = 0;i<coexpense.size();i++){
//         if(coexpense.get(i).getType().contains("TotalIncome")){
//             TotalIncome += coexpense.get(i).getAmount();
//         }else if (coexpense.get(i).getType().contains("Expense")){
//             Object TotalExpense = coexpense.get(i).getAmount();
//         }
//     }

// }
