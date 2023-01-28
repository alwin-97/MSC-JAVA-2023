final class finalClass{
    void printHello(){
        System.out.println("Hello");
    }
}

class finalMethodClass{
    final void printGreetings(String args){
        System.out.println(args);
    }
}

// class finalEx extends finalClass{ // cannot inherit final class
class finalEx extends finalMethodClass{

    // void printGreetings(String args){} // cannot override final methods

    public static void main(String []args){

        System.out.println(args.length);
        for(int i=0; i<args.length;i++){
            System.out.println("--> "+ args[i]);
        }

        final String var = "Final Value";
        System.out.println(var);
        // var = "new Value"; // cannout assign new value to final keyword 
        // System.out.println(var);

        finalClass obj = new finalClass();
        obj.printHello();
    }
}