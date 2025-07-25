package SOLID_PRINCIPLES.Open;

//This code applies the open/closed principle

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of Circle: " + calculator.calculateArea(circle));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(rectangle));
    }
}

