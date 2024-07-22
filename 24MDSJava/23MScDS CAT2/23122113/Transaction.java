
public class Transaction {
    private String Date;
    private String Transaction_type;
    private long Amount;
    private String Description;

    // Here we defined null constructor(those without mentioning the parameters)
    Transaction() {
        Date = " ";
        Transaction_type = " ";
        Amount = 0;
        Description = " ";
    }

    // Here we defined Parameterized constructor where all the parameters in the
    // class are mentioned
    Transaction(String Date, String Transaction_type, Long Amount, String Description) {
        this.Date = Date;
        this.Transaction_type = Transaction_type;
        this.Amount = Amount;
        this.Description = Description;
    }

    // We defined a method to return Amount
    public long getAmount() {
        return Amount;
    }


    // We defined a method PrintDetails such that whole the details given in the
    // class can be called together
    public String PrintDetails() {
        return Date + "," + Transaction_type + "," + Amount + "," + Description;
    }
}