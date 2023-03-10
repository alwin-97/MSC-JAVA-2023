class ExceptionHandling{
    // static String arr;

    // static returntype fucntionname(argumets)

    public static void main(String[] args) {
        try{
        int a = 13/0;
        int arr[] = new int[10];
        System.out.println(arr[100]);
        }catch(ArithmeticException ex){

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Finally");
        }
    }
}