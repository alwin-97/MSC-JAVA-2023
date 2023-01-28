public class threadsEx extends Thread { // extending thread class
// public class threadsEx implements Runnable{ // implemeting runnable interface

    public void run() {
        int i ;
        for (i= 0; i <= 5; i++) {
            System.out.println(i);
            try{
                sleep(100);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        // used with extending
        threadsEx thread = new threadsEx();
        thread.start();
        threadsEx thread1 = new threadsEx();
        thread1.start();

        // used via implementing
        // threadsEx tobj =new threadsEx();
        // Thread tclass = new Thread(tobj);
        // tclass.start();
        // Thread tclass2 = new Thread(tobj);
        // tclass2.start();
    }
}
