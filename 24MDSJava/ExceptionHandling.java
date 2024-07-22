class ExceptionHandling{
    public static void main(String[] args) {
        System.out.println("Program Start");
        // int[] arr = new int[2];
        // System.out.println(arr[10]);
        try{
            // int[] arr = new int[2];
            System.out.println(5/0);
        }catch(){
            System.out.println(exception.getMessage());
        }
        // catch(ArrayIndexOutOfBoundsException exception){
        //     System.out.println("ArrayIndexOutOfBoundsException");
        // }catch(ArithmeticException exception){
        //     System.out.println("ArithmeticException");
        // }
        System.out.println("End program");
    }
}