import java.util.*;

class MyThread extends Thread{
    int start=0 ,end=0 , partialSum=0;
    public void run(){
        for(int i =start;i<end;i++){
            partialSum+=i;
        }
    }
    int getPartialSum(){
        return partialSum;
    }
}

public class prac33 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter the N :");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Number of threads");
        int num_thread=sc.nextInt();

        MyThread t[] =new MyThread[num_thread];

        int div = n/num_thread;
        int s=1;
        int e=s+div;
        for (int i = 0; i < num_thread; i++) {
            t[i] = new MyThread();
            t[i].start=s;
            t[i].end=e;
            s=e;
        }

        t[num_thread-1].end=n+1;

        for (int i = 0; i < num_thread; i++) {
            t[i].start();
        }
        int sum=0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException error) {

        }
        for (int i = 0; i < num_thread; i++) {
            sum+=t[i].getPartialSum();
        }

        System.out.println(sum);
    }
}
