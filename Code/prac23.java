import java.util.Scanner;

interface Shape {
    String getColour();
    default void displayColour() {
        System.out.println("Colour: " + getColour());
    }
}

interface Circle extends Shape {
    int getRadius();
    default void displayCircle() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + getRadius());
        displayColour();
    }
}

interface Rectangle extends Shape {
    int getLength();
    int getWidth();

    void createRectangleSign(int length, int width, String colour, String text);
    default void displayRectangle() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        displayColour();
    }
}

class Sign implements Rectangle, Circle {
    private String colour;
    private String text;
    private int radius;
    private int length;
    private int width;

    public void createCircleSign(int radius, String colour, String text) {
        this.colour = colour;
        this.radius = radius;
        this.text = text;
    }

    public void createRectangleSign(int length, int width, String colour, String text) {
        this.colour = colour;
        this.length = length;
        this.width = width;
        this.text = text;
    }

    public String getColour() {
        return colour;
    }

    public int getRadius() {
        return radius;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void displayCircleSign() {
        displayCircle();
        System.out.println("Text: " + text);
    }

    public void displayRectangleSign() {
        displayRectangle();
        System.out.println("Text: " + text);
    }
}

public class prac23 {
    public static void main(String[] args) {
        Sign sign = new Sign();
        int choice, length, width, radius;
        String colour, text;
        Scanner sc = new Scanner(System.in);

        System.out.println("Create a sign of the shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter the Choice: ");
        choice = sc.nextInt();
        sc.nextLine();  // Consume the newline

        switch (choice) {
            case 1:
                System.out.print("Enter the Length: ");
                length = sc.nextInt();
                System.out.print("Enter the Width: ");
                width = sc.nextInt();
                sc.nextLine();  // Consume the newline
                System.out.print("Enter the text: ");
                text = sc.nextLine();
                System.out.print("Enter the Colour: ");
                colour = sc.nextLine();
                sign.createRectangleSign(length, width, colour, text);
                sign.displayRectangleSign();
                break;

            case 2:
                System.out.print("Enter the Radius: ");
                radius = sc.nextInt();
                sc.nextLine();  // Consume the newline
                System.out.print("Enter the text: ");
                text = sc.nextLine();
                System.out.print("Enter the Colour: ");
                colour = sc.nextLine();
                sign.createCircleSign(radius, colour, text);
                sign.displayCircleSign();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}