package Lesson6;

public class ShapeDemo {
    public static void main(String args[]) {
        Square square = new Square(8, 8);
        Square s = new Square( "square", 1, 5, 5);
        System.out.println(s.toString());
        square.paint();

        // Находим периметр и площадь треугольника
        System.out.println("Периметр  составляет:" + square.getPerimeter());
        System.out.println("Площадь  составляет:" + square.getArea());



        // Находим длину и площадь окружности
        Circle circle = new Circle(9);
        Circle c = new Circle("rjk", 1, 13);
        System.out.println(c.toString());
        c.paint();

        System.out.println("\nПериметр круга :" + circle.getPerimeter());
        System.out.println("Площадь круга равна:" + circle.getArea());


        // Находим периметр и площадь треугольника
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle t = new Triangle("hhhd", 1, 5, 6, 8);
        System.out.println(t.toString());
        t.paint();

        System.out.println("\nПериметр треугольника равен:" + triangle.getPerimeter());
        System.out.println("Площадь треугольника  равна:" + triangle.getArea());
    }
}



