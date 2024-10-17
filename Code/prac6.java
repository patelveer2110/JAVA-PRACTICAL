
import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) 
    {
        double total=1;
        double a=0,b=1;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        System.out.println("The fibonacci series is : \n"+a+"\n"+b);

        for (int i = 2; i < n; i++) {
           double nextterm=a+b;
            a=b;
            b=nextterm;
            total+=b; 
            System.out.println(b); 
        }
        System.out.println("the total of fibonnaci series is : " + (long)total );
        sc.close();
    }
    
}
