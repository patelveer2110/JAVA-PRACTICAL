
class First extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First");
            
        }
    }
}
class Second extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second"); 
        }
    }
}
class Third extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Third");
            
        }
    }
}

public class prac36 {

    public static void main(String[] args) {
        First t1 = new First();
        Second t2 = new Second();
        Third t3 = new Third();
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
    }
}
