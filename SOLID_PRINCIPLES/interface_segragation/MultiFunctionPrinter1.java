package SOLID_PRINCIPLES.interface_segragation;

// Fat interface: too many responsibilities
interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void fax(Document doc);
}

class Document {
    String content = "Strathmore Document";
}

// A simple printer is forced to implement scan and fax
class SimplePrinter implements Machine {
    public void print(Document doc) {
        System.out.println("Printing: " + doc.content);
    }

    public void scan(Document doc) {
        // Not supported
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax(Document doc) {
        // Not supported
        throw new UnsupportedOperationException("Fax not supported");
    }
}

// A multi-function printer can implement all features correctly
class MultiFunctionPrinter1 implements Machine {
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
