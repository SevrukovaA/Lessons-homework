package Lesson6;

import java.util.Objects;

public abstract class Shape {

    private String name;
    private int plane;

    public int getPlane() {
        return plane;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    public Shape(String name, int plane) {
        this.name = name;
        this.plane = plane;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", plane=" + plane +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return plane == shape.plane && Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plane);
    }

    public abstract double getArea(); //площадь

    public double getPerimeter() {
        return 0; //периметр
    }

}
