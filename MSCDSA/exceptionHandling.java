class exceptionHandling{
    public static void main(String[] args) {
        try{
            // int res = 10/0; // division by zero
            // System.out.println(res);
            int arr[] = new int[10];
            System.out.println(arr[100]); // array index out of bound error
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index issue");
        }catch(Exception e){
            System.out.println("Some error occured: "+e.getMessage());
        }finally{
            System.out.println("Final block");
        }
        System.out.println("Program End...");
    }
}