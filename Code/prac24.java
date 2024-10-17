
import java.util.Scanner;

import java.util.InputMismatchException;

public class prac24 {

    public static void main(String[] args) {
        int x, y;
        float ans;

        try {
            System.out.println("Enter the value of x :");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            System.out.println("Enter the value of y :");
            y = sc.nextInt();
            ans = x / y;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("The Value of y can't be zero!!!!");
        } catch (InputMismatchException e2) {
            System.out.println(e2);
        } catch (Exception e3) {
            System.out.println(e3);
        }

    }
}
