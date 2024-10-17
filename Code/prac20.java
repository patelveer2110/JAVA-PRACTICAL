class Shape{
    void print_shape(){
        System.out.println("This is Shape.");
    }
}

class Rectangle extends Shape{
    void print_rect(){
    System.out.println("This is Rectangular Shape.");
    }
}
class Circle extends Shape{
    void print_circle(){
    System.out.println("This is Circluar Shape.");
    }
}

class Square extends Rectangle{
    void print_square(){
        System.out.println("Square is Rectangle.");
    }
}



public class prac20 {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.print_shape();
        sq.print_rect();
        sq.print_square();
    }
}
