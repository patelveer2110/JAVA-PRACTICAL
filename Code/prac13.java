
import java.util.Scanner;

class Employee{
    String Fname,Lname;
    double sal,ysal;

    public Employee() {
    }

    Employee(String f, String l, double s)
    {
        Fname=f;
        Lname=l;
        if(s<0)
        {
            sal=0;
        }
        else {
            sal=s;
        }
        ysal=sal*12;
    }
    Scanner sc=new Scanner(System.in);
    void set_fname()
    {
        System.out.println("Enter First Name : ");
        Fname=sc.nextLine();
    }
    void set_lname()
    {
        System.out.println("Enter Last Name : ");
        Lname=sc.nextLine();
    }
    void set_sal()
    {
        System.out.println("Enter Salary : ");
        sal=sc.nextDouble();
        ysal=sal*12;
    }

    void get_fname()
    {
        System.out.println("First name : "+Fname);
    }
    void get_lname()
    {
        System.out.println("Last name : "+Lname);
    }
    void get_sal()
    {
        System.out.println("Salary : "+sal);
    }
    void get_ysal(){
        
        System.out.println("Yearly salary is : "+ysal);
    }
}

class prac13 {
    public static void main(String[] args) {
        Employee e1,e2;
        e1= new Employee();
        e2= new Employee("Veer","Patel",50000);
        e1.set_fname();
        e1.set_lname();
        e1.set_sal();

        System.out.println("\nDetails of Employee 1 :");
        e1.get_fname();
        e1.get_lname();
        e1.get_sal();
        
        e1.get_ysal();
        e1.ysal+=e1.ysal*0.1;
        System.out.println("Salary of employee 1 after the 10% increment : ");
        e1.get_ysal();
        
        System.out.println("\nDetails of Employee 2 :");
        e2.get_fname();
        e2.get_lname();
        e2.get_sal();
        e2.get_ysal();
        
        e2.ysal+=e2.ysal*0.1;
        System.out.println("Salary of employee 2 after the 10% increment : ");
        
        e2.get_ysal();
    }
}
