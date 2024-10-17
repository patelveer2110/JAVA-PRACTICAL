package extraprac;
import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        for (int i =0;i<5;i++) {
            System.out.println(arr[i]);
        }

        for (int i =0;i<5;i++) {
            System.out.println("Enter the new value of arr["+(i)+"] ");
            arr[i]=sc.nextInt();
        }
        for (int i =0;i<5;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Length of array is "+arr.length);
        sc.close();

    }
    
}
