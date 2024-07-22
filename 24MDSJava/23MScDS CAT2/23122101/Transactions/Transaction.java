package Transactions;

public class Transaction {

    public String date; // Declaring the required variables
    public String trans_type;
    public long amount;
    public String descp;

    public Transaction() { // Creating the default constructor
        String date = " ";
        String trans_type = " ";
        long amount = 0;
        String descp = " ";
    }

    public Transaction(String date, String trans_type, long amount, String descp) { // Creating parameterized constructor
        this.date = date;
        this.trans_type = trans_type;
        this.amount = amount;
        this.descp = descp;
    }

    public Transaction(String date, long amount, String trans_type ) { // Creating a inheriting construtor
        this.date = date;
        this.amount = amount;
        this.trans_type = trans_type;
    }

    public String getDate(){     // To get the transaction date
        return date;
    }

    public String getTransType(){     // To get the transaction type
        return trans_type;
    }

    public long getAmount(){          // To get the transaction amount 
        return amount;
    }

    public String getTransDetails() {      // Getting transaction details
        return date + "\t" + amount + "\t" + trans_type + "\t" + descp;
    }
}