
import java.util.Scanner;


class Student {

    String name;
    int roll_no;

    void set_student_data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No. :");
        roll_no = sc.nextInt();
        System.out.println("Enter the Name of the Student : ");
        name = sc.nextLine();
    }

    void get_student_data() {
        System.out.println("Roll No.: " + roll_no);
        System.out.println("Name : " + name);
    }
}

class Exam extends Student {

    int marks[] = new int[6];
    Scanner sc = new Scanner(System.in);

    void get_marks() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Marks of Subject " + (i + 1) + " :");
            marks[i] = sc.nextInt();
        }
    }

    void print_marks() {
        System.out.println("Marks of the Student:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }
    }
}

class Result extends Exam {

    int total_marks = 0;

    void get_totalmarks() {
        for (int i = 0; i < 6; i++) {
            total_marks += super.marks[i];
        }
        System.out.println("Total Marks : " + total_marks);
    }
}

public class extra {

    public static void main(String[] args) {

    }
}
