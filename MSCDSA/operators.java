public class operators {
    public static void main(String[] args) {

        System.out.println("Program Start");

        // boolean condition = false;
        // int age = 30;
        // if (age > 40 || age < 5) {
        //     System.out.println("If Block");
        // } else if (age > 40 && age < 45) {
        //     System.out.print("Else if Block");
        // } else {
        //     System.out.println("Else Block");
        // }

        int caseVal = 3;
        switch(caseVal){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
            case 3:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Case Default");
                break;
        }

        System.out.println("Program End");
    }
}
