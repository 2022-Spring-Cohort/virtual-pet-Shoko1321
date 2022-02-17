package virtual_pet;

public abstract class RobotPet extends VirtualPet {
    protected int battery;
    protected int functionality;


    public int getBattery() {
        return battery;
    }

    public int getFunctionality() {
        return functionality;
    }

    public RobotPet(String name, String color, int age) {
        super(name, color, age);
    }


    public void recharge() {
        battery = Math.max(0, battery + 100);
    }

    public void repair() {
        functionality = Math.max(0, functionality + 75);
    }

    @Override
    public void tick() {
        battery--;
        functionality--;
    }

    public abstract void litterBox();
}

