package Test1;


abstract class Shape {

    abstract void calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class ShapeAbstraction {

    public static void main(String[] args) {

        Circle c = new Circle(5);

        Rectangle r = new Rectangle(10, 5);

        c.calculateArea();

        r.calculateArea();
    }
}

