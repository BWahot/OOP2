package SOLID_PRINCIPLES.dependency_inversion.with_dip;

//Testing it on a low-level module(concrete class)
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

