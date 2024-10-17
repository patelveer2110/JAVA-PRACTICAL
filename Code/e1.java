class parent{
    parent()
    {
        System.out.println("Parent");
    }
}



class Emp extends parent{
    Emp(){
        this(10);
       // super();
        //this(10,29);
        System.out.println("0");
    }
    Emp(int a){
        this(10, 20);
        System.out.println("1");
    }
    Emp(int a, int b){
        System.out.println("2");
    }
}



public class e1 {
    public static void main(String[] args) {
        Emp e1=new Emp();
       System.out.println( e1.getClass());

    }
    
}
