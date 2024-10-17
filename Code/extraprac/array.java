package extraprac;

public class array {

    void func(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    int min(int a[])
    {
        int min =a[0];
        for (int i = 0; i < a.length; i++) {
            if (min>a[i]) {
                min=a[i];
            }
        } 
        return min;
    }
    
}
