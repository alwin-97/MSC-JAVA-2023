package transactions;
// impllement the package 
// define a class epensemanager inherits the transactions class whiich stores the totalincome
public class Expensemanager extends Transaction{
    private double cashRecieved;
    private double balanceGiven;
    private int totalIncome;
    private int expense;
    private String cardNumber;
    private String cardOwnername;
    // constructors impplementating 
    public Expensemanager(int transNo,java.util.Date transDate,double amount,double cashRecieved,double balanceGiven,int totalIncome,int expense){
        super(transNo,transDate,amount);
        this.cashRecieved = cashRecieved;
        this.balanceGiven = balanceGiven;
        this.totalIncome = totalIncome;
        this.expense = expense;
    }
    public Expensemanager(int transNo,java.util.Date transDate,double amount,String cardNumber,String cardOwnerName){
        super(transNo,transdate,amount);
        this.cardNumber = encryptCardNumber(cardNumber);
        this.cardOwnerName= cardOwnerName;
    }
    private String encryptCardNumber(String cardNumber){
        return cardNumber;
    }
    public String toString(){
        if(cardNumber!=null){
            return super.toString()+",card Number:"+cardNumber+",CArd Owner's Name:" + cardOwnerName;
        }else{
            return super.toString()+", CAsh Recieved: "+cashRecieved+",balance given: "+balanceGiven;
        }
    }
}