class parent{
    void print_parent()
    {
        System.out.println("This is parent class");
    }
}

class child extends parent{
    void print_child()
    {
        System.out.println("This is child class");
    }
}


public class prac17 {
    public static void main(String[] args)
    {
        parent p1  =new parent();
        child c1 = new child();
        p1.print_parent();
        c1.print_child();
        c1.print_parent();

    }
}
