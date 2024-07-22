import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

class Calculator{
    private int num1;
    private int num2;
    private char op;
    private float res;

    Calculator(){
        this.num1 = 0;
        this.num2 = 0;
        this.op = ' ';
    }

    Calculator(int n1,int n2,char opr){
        this.num1 = n1;
        this.num2 = n2;
        this.op = opr;
        this.res = calculate();
    }

    float calculate(){
        switch (this.op) {
            case '+':
                return this.num1 + this.num2;
            case '-':
                return this.num1 - this.num2;
            case '*':
                return this.num1 * this.num2;
            case '/':
                return this.num1 / this.num2;
            default:
                return -1f;
        }
    }

    float getRes(){
        return this.res;
    }
}

class Math{
    public static void main(String[] args) {
        try{
            File file = new File("math.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String tempStr = fileReader.nextLine();
                String[] splitStr = tempStr.split(" ");
                Calculator calcy = new Calculator(Integer.parseInt(splitStr[0]),Integer.parseInt(splitStr[2]),splitStr[1].charAt(0));
                FileWriter fileWriter = new FileWriter("math_res.txt",true);
                fileWriter.write(tempStr + calcy.getRes());
                fileWriter.close();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}