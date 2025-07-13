package SOLID_PRINCIPLES.dependency_inversion.without_dip;

public class LightSwitch {
    private LightBulb bulb;  // Direct dependency on concrete class

    public LightSwitch() {
        this.bulb = new LightBulb();  // Tight coupling
    }

    public void operate() {
        bulb.turnOn();
    }
}