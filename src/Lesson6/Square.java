package Lesson6;

public class Square extends Shape implements Color {

    private double a;
    private double b;

    public Square(double a, double b) {
        if (a != b) {
            System.out.println("Your shape is not a square");
        }else {
            this.a = a;
            this.b = b;
        }
    }

    public Square(double a) {
        this.a = a;
    }




    public double getPerimeter(int a) {
        return 2 * (2 * a);
    }
    @Override
    public double getPerimeter() {
        return 2 * (b + a);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public Square(String name, int plane, double a, double b) {
        super(name, plane);
        this.a = a;
        this.b = b;
    }

    @Override
    public void paint() {
        System.out.println("I am filled in yellow");
    }
}
