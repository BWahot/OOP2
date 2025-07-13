package SOLID_PRINCIPLES.dependency_inversion.with_dip;

// Testing it on a high-level module
public class LightSwitch {
    private Switchable device;  // Depends on abstraction

    // Dependency injected via constructor
    public LightSwitch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}