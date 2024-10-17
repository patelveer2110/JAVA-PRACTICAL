
import java.util.*;

public class prac25 {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array value");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i]=sc.nextInt();
            }
            for (int i = 3; i <10; i++) {
                System.out.println(array[i]);
            }
        } catch(InputMismatchException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }
    }
}
