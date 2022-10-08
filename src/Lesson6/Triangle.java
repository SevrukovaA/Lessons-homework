package Lesson6;

public class Triangle extends Shape implements Color {

    private double a; // сторони треугольника
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String name, int plane, double a, double b, double c) {
        super(name, plane);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void paint() {
        System.out.println("I am filled in red");
    }
}