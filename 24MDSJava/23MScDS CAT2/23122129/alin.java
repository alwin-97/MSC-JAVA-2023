// Sandeep Kumar G 23122129
package alin;  // encapsulate a group class for alin

import java.io.FileWriter;  // import java file to write
import java.util.Scanner;   // import util scanner to read and scan until the last line
import java.io.IOException; // import IOException to handle errors

public class alin {
    private String name;
    private String email;
    private double phone;

alin () {
    name = " ";
    email = " ";
    phone = 0;
    }
alin (String name,String email,double phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
}

public String get name() {
    return name;
}

public String get email() {
    return email;
}

public String get phone() {
    return ;
}

public StringPrintDetails() {
    return name + ',' + email + ',' +phone + ',';
}

}