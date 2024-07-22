package transactions; 
//  packagee import 
import java.io.Serializable;
import java.io.Date;
// define a class named transaction.
public class Transaction implements Serializable {
    private int transNo;
    private Date transDate;
    private double amount;
    private String transDesc;
    // impplement constructors 
    public Transaction(int transNo,Date transDate,double amount,String transDesc){
        this.transNo=transNo;
        this.amount=amount;

    }
    public int getTransNo(){
        return transNo;
    }
    public void setTransNo(int transNo){
        this.transNo=transNo;
    }
    public Date getTransDate(){
        return transDate;
    }
    public void setTransDate(date transDate){
        this.transDate = transDate;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public String toString(){
        return "Trans_No:"+ transNo +",Trans_Date:" + transDate + ",Amount:"+amount;
    }
}