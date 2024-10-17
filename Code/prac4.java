import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        float totalExpense=0;
        float array[]= new float[30];
        Scanner sc= new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            array[index]=sc.nextFloat();
            System.out.println("Expense of day "+(index+1)+" is "+array[index]);
            totalExpense+=array[index];
        }

        System.out.println("The Total Expense is "+totalExpense);
sc.close();
    }
    
}