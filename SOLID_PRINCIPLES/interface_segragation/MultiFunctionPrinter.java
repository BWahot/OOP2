package SOLID_PRINCIPLES.interface_segragation;

// Separate, focused interfaces
interface Printer {
    void print(Document doc);
}

interface Scanner {
    void scan(Document doc);
}

interface Fax {
    void fax(Document doc);
}

class Document {
    String content = "Strathmore Document";
}

// A class that only prints
class SimplePrinter implements Printer {
    public void print(Document doc) {
        System.out.println("Printing: " + doc.content);
    }
}

// A class that supports all features
class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print(Document doc) {
        System.out.println("Printing: " + doc.content);
    }

    public void scan(Document doc) {
        System.out.println("Scanning: " + doc.content);
    }

    public void fax(Document doc) {
        System.out.println("Faxing: " + doc.content);
    }
}

