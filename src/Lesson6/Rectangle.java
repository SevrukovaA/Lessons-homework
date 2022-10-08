package Lesson6;

public class Rectangle extends Shape implements Color {
    private double a;
    private double b;

    public Rectangle(String name, int plane, double a, double b) {
        super(name, plane);
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getCircumference() {
        return 2 * (a + b);
    }

    public double getArea() {
        return a * b;
    }

    public double getGirth() {
        return 0;
    }

    public void paint() {
        System.out.println("I am filled in blue");
    }
}
