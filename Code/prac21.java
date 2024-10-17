class Degree{
    void getDegree(){
        System.out.println("I got Degree");
    }
}

class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate");
    }
}

public class prac21 {
    public static void main(String[] args) {
        Undergraduate std1=new Undergraduate();
        Postgraduate std2=new Postgraduate();
        std1.getDegree();
        std2.getDegree();
    }
}
