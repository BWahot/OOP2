package SOLID_PRINCIPLES.pkg_Liskov;

public class LSPGood {
    public static void printDouble(Number1 number) {
        System.out.println("Double: " + number.doubleValue());
    }

    public static void main(String[] args) {
        Number1 n1 = new Number1(5);             // Output: 10
        Number1 n2 = new NegativeNumber1(-5);    // Output: -10

        printDouble(n1);
        printDouble(n2);
    }
}