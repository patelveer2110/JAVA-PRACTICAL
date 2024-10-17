
import java.util.Arrays;


public class prac10 {
    public static void main(String[] args) {
        String str ="Hello World";
        System.out.println("Length of string :"+str.length());
        System.out.println("LowerCase of the string : "+str.toLowerCase());
        System.out.println("UpperCase of the string : "+str.toUpperCase());
        
        char arr[]=str.toCharArray();
        char newarr[]=new char[str.length()];
        for (int i = (arr.length-1),j=0; i >=0; i--) {
            newarr[j] = arr[i];
            j++;
        }
        
       System.out.println("Reverse string is : "+new String(newarr));

        String str1=str.toLowerCase();
        newarr=str1.toCharArray();
        Arrays.sort(newarr);

        System.out.println("Sorted String is : "+new String(newarr));


    }
    
}
