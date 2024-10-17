class Rectangle{
    float length,breadth;
    Rectangle()
    {
        length=0;
        breadth=0;
    }
    Rectangle(float l, float b)
    {
        length=l;
        breadth=b;
    }

    void area()
    {
        System.out.println("Area of Rectangle : "+length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter of  Rectangle : "+(2*(length+breadth)));
    }
}

class Square extends Rectangle{

    Square() {
        super();
    }
    Square(float s){
        super(s,s);
    }
   @Override
    void area()
    {
        System.out.println("Area of Square : "+length*breadth);
    }
    @Override
    void perimeter()
    {
        System.out.println("Perimeter of Square : "+(2*(length+breadth)));
    }
    
}


public class prac19 {
    public static void main(String[] args) {
        Rectangle r1[]=new Rectangle[2];
        Square s1=new Square(9);
        r1[0]=new Rectangle(1,2);
        r1[0].area();
        r1[0].perimeter();

        s1.area();
        s1.perimeter();
    }
}
