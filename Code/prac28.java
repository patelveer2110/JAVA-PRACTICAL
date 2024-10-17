
import java.io.*;

public class prac28 {

    public static void main(String[] args) throws Exception {
        {

           char c1[]= args[0].toCharArray();
            
                try {
                    BufferedReader f = new BufferedReader(new FileReader("xanadu.txt"));
                    String j;
                    int count = 0;
                    while ((j = f.readLine()) != null) {
                        char c[] =j.toCharArray();
                        for (int k = 0; k < c.length; k++) {
                            if(c[k]==c1[0]){
                                count++;
                            }
                        }

                    }
                    System.out.println("Number of charcter are : " + count);
                } catch (Exception e) {
                    System.out.println(e);
                }
            
        }
    }
}
