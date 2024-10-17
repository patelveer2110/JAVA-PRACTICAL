import java.util.*;

class Complex {

    int real, img;

    Complex() {
        real = 0;
        img = 0;
    }

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void display() {
        if (img >= 0) {
            System.out.println(real + "+" + img + "i");
        } else {
            System.out.println(""+real + img + "i");
        }
    }

    static void add (Complex c1, Complex c2){
        Complex c =new Complex();
        c.real=c1.real+c2.real;
        c.img =c1.img+c2.img;
        System.out.print("The Sum is : ");
        c.display();
    }
    static void sub (Complex c1, Complex c2){
        Complex c =new Complex();
        c.real=c1.real-c2.real;
        c.img =c1.img-c2.img;
        System.out.print("The difference is : " );
        c.display();
    }
    static void mul (Complex c1, Complex c2){
        Complex c =new Complex();
        c.real=(c1.real*c2.real)-(c1.img*c2.img);
        c.img =(c1.real*c2.img)+(c1.img*c2.real);
        System.out.print("The Product is : ");
        c.display();
    }

}
public class prac16 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r1,r2,i1,i2;
        System.out.println("Enter the value of Complex number 1 :\nreal part:");
        r1=sc.nextInt();
        System.out.println("imaginary part : ");
        i1=sc.nextInt();
        System.out.println("Enter the value of Complex number 2 :\nreal part:");
        r2=sc.nextInt();
        System.out.println("imaginary part : ");
        i2=sc.nextInt();

        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);

        Complex.add(c1,c2);
        Complex.sub(c1,c2);
        Complex.mul(c1,c2);

    }
}
