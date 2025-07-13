package SOLID_PRINCIPLES.pkg_Liskov;
//LSP-Done by swalha
//the code does not follow LSP
class Number {
    protected int value;

    public Number(int value) {
        this.value = value;
    }

    public int doubleValue() {
        return value * 2;
    }
}

class NegativeNumber extends Number {
    public NegativeNumber(int value) {
        super(value);
    }

    @Override
    public int doubleValue() {
        return Math.abs(value * 2);  // takes absolute value of answer so the behaviour is changed

    }
}
