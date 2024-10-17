import java.util.Scanner;

public class prac8 {
    static int count9(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the value of array :");
        for (int i=0;i<size;i++) {
            System.out.println("a["+i+"]");
            array[i]=sc.nextInt();
        }
        System.out.println("Number of 9 in given array is "+count9(array));
        sc.close();
    }

}
