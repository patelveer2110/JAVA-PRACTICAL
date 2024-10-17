
class MyThread extends Thread {
    public void run(){
        System.out.println("Hello world");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }
}



public class prac32 {
    public static void main(String[] args) {
     MyThread t1 =new MyThread();
     MyThread2 runnable =new MyThread2();
     Thread t2 =new Thread(runnable);
     
     t1.start();
     t2.start();
    }
}
