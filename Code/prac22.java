import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

/**
 * InnerAdvancedArithmetic
 */
class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n){
            int sum=0;
                for(int i=1;i<=n;i++){
                    if(n%i==0)
                        sum+=i;
                }
                return sum;
        }
}



public class prac22 {
    public static void main(String[] args) {
        MyCalculator c1=new MyCalculator();
        int n;
        do{
        System.out.println("Enter the number between 1-1000 :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        }while(n<1||n>1000);

        System.out.println("The Sum of divisor of "+n+" is : "+c1.divisor_sum(n));

    }
}
