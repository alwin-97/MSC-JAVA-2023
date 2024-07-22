package transaction_pack;

//this is the parent class
public class Transaction{
    String Date;
    String Transaction_type;
    int Amount;
    String description;
    
//default constructor
    public Transaction(){
        this.Date ="";
        this.Transaction_type="";
        this.Amount=0;
        this.description="";
    }
//parametric constructor
    public Transaction(String Date, String Transaction_type, int Amount, String description){
        this.Date = Date;
        this.Transaction_type=Transaction_type;
        this.Amount=Amount;
        this.description=description;
    }

    public String addTransaction(){
    String addedTrans = this.Date + ";"+this.Transaction_type+";"+Integer.toString(this.Amount)+";"+this.description;
    return addedTrans;
    }




}