package alin;

public class alin{

    private String name;
    private int phno;
    private String email;

public alin(int phno, String name, String email){
    this.name= name;
    this.phno=phno;
    this.email=email;
}
public alin(){    
}
public String person(){
    return "Name:"+name+",Phone Number"+phno+",Email ID:"+email+"\n";
}
}