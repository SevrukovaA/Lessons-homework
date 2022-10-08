package Lesson6;

public class ShapeDemo {
    public static void main(String args[]) {
        Square square = new Square(8, 8);
        Square s = new Square( "square", 1, 5, 5);
        System.out.println(s.toString());
        square.paint();

        // ������� �������� � ������� ������������
        System.out.println("��������  ����������:" + square.getPerimeter());
        System.out.println("�������  ����������:" + square.getArea());



        // ������� ����� � ������� ����������
        Circle circle = new Circle(9);
        Circle c = new Circle("rjk", 1, 13);
        System.out.println(c.toString());
        c.paint();

        System.out.println("\n�������� ����� :" + circle.getPerimeter());
        System.out.println("������� ����� �����:" + circle.getArea());


        // ������� �������� � ������� ������������
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle t = new Triangle("hhhd", 1, 5, 6, 8);
        System.out.println(t.toString());
        t.paint();

        System.out.println("\n�������� ������������ �����:" + triangle.getPerimeter());
        System.out.println("������� ������������  �����:" + triangle.getArea());
    }
}



