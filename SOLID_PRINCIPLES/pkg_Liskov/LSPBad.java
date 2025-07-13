package SOLID_PRINCIPLES.pkg_Liskov;

// Main class
public class LSPBad {
    public static void printDouble(Number number) {
        System.out.println("Double: " + number.doubleValue());
    }

    public static void main(String[] args) {
        Number n1 = new Number(5);           // Output: 10
        Number n2 = new NegativeNumber(-5);  // Output: 10 (but should be -10)
        printDouble(n1);
        printDouble(n2);
    }
}