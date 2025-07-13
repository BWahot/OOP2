package SOLID_PRINCIPLES.Open

//This code does not apply the open/closed principle

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of Circle: " + calculator.calculateArea(circle));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(rectangle));
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}

class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

