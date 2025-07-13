package SOLID_PRINCIPLES.pkg_Liskov;
//LSP-Done by swalha
//this code follows lsp principles

// Base class
class Number1 {
    protected int value;

    public Number1(int value) {
        this.value = value;
    }

    public int doubleValue() {
        return value * 2;
    }
}


class NegativeNumber1 extends Number1 {
    public NegativeNumber1(int value) {
        super(value);
        if (value >= 0) {
            throw new IllegalArgumentException("Value must be negative");
            //Does not change the behaviour only ensures value is negative.

        }
    }


}

