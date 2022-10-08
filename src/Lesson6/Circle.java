package Lesson6;

public class Circle extends Shape implements Color {
    private double r; // Радиус круга

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String name, int plane, double r) {
        super(name, plane);
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
    public void paint() {
        System.out.println("I am filled in black");
    }
}

