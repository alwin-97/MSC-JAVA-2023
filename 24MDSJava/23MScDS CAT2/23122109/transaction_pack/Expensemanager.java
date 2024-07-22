package transaction_pack;

public class Expensemanager extends Transaction{
    private int total_income;
    private int expense;

    public Expensemanager(){
        super();
        this.total_income=0;
        this.expense=0;
    }

    public Expensemanager(String Date, String Transaction_type, int Amount, String description, int total_income, int expense){
        super(Date, Transaction_type, Amount, description);
        this.total_income=total_income;
        this.expense=expense;
    }

   public int getIncome(){
    return this.total_income;
   }

   public int getExpense(){
    return this.expense;
   }
    
}
