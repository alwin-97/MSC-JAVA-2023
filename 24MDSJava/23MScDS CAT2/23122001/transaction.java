package CAT-2;

import java.io.Serializable;
import java.time.LocalDate;



public class Transaction implements Serializable {
    private LocalDate date;
    private String Transaction_Type;
    private double amount;
    private String Description;
public Transaction (LocalDate date,String Transaction_Type,double amount,String Description) {
    this.date = date;
    this.Transaction_Type = Transaction_Type ;
    this.amount = amount;
    this.Desciption = Desciption;
}

public LocalDate getDate() {
    return date;
}

public String getTransaction_Type() {
    return Transaction_Type;
}

public double getamount () {
    return amount;
}

public String Description () {
    return Description;
}

public String toString() {
    return date + "|"+ Transaction_Type + "|" + amount + "|" + Description ;

}


}