package SOLID_PRINCIPLES.dependency_inversion.with_dip;

//Testing it on a low-level module(concrete class)
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Spinning up...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Spinning down...");
    }
}