public class prac35 extends Thread {
    private int value = 0;

    public void run() {
        while (true) {
            value++;
            System.out.println("Value: " + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        prac35 incrementer = new prac35();
        incrementer.start();
    }
}
