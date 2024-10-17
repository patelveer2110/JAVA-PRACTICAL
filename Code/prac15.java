
import java.util.Scanner;
import java.lang.Math;


class Area {

    double length, breadth;

    public Area() {
        length = 1;
        breadth = 1;
    }

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class prac15 {
    public static void main(String[] args) {
        //Area a1=new Area();
        double  length , breadth;
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the length of rectangle :");
        length=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle :");
        breadth=sc.nextDouble();
        Area a2= new Area(length,breadth);

        //System.out.println("Area of Rectangle 1 is : "+a1.returnArea());
        System.out.println("Area of Rectangle is : "+Math.round(a2.returnArea()));
    }
}
