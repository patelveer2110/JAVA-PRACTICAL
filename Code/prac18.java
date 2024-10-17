import java.math.BigInteger;
import java.util.Scanner;

class Member{
    String name,address;
    int age;
    BigInteger phone_number;
    float salary;
    Scanner sc=new Scanner(System.in);
    void set_data()
    {
        System.out.println("Enter the name :");
        name=sc.nextLine();
        System.out.println("Enter the Age :");
        age=sc.nextInt();
        System.out.println("Enter the Phone number :");
        phone_number=sc.nextBigInteger();
        sc.nextLine();
        System.out.println("Enter the Address :");
        address=sc.nextLine();
        System.out.println("Enter the Salary :");
        salary=sc.nextFloat();
    }

    void get_data(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone number : "+phone_number);
        System.out.println("Address : "+address);
    }

    void print_Salary()
    {
        System.out.println("Salary : "+salary);
    }
}

class Employee extends Member{
    String specialisation;
    @Override
    void set_data()
    {
        super.set_data();
        System.out.println("Enter the area of specialisation : ");
        sc.nextLine();
        specialisation=sc.nextLine();
    }
    @Override
    void get_data(){
        super.get_data();
        super.print_Salary();
        System.out.println("Specialisation : "+specialisation);
    }
}

class Manager extends Member{
    String department;
    @Override
    void set_data()
    {
        super.set_data();
        System.out.println("Enter the department : ");
        sc.nextLine();
        department=sc.nextLine();
    }
    @Override
    void get_data(){
        super.get_data();
        super.print_Salary();
        System.out.println("Department : "+department);
    }
}

public class prac18 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Manager m1=new Manager();
        System.out.println("Enter the data of Employee : ");
        e1.set_data();
        System.out.println("Enter the data of Manager : ");
        m1.set_data();

        System.out.println("\nEmployee details :\n");
        e1.get_data();

        System.out.println("\nManager Details :\n");
        m1.get_data();
    }
}
