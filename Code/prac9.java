import java.util.Scanner;

public class prac9 {
    static String double_char(String str)
    {
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            newstr+= str.charAt(i);   
            newstr+= str.charAt(i);   
        }

        return newstr;
    }
    
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.nextLine();
        System.out.println("New String is :\n"+double_char(str));
        sc.close();
    }
}
