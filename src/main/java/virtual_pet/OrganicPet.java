package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    protected int thirst;
    protected int hunger;
    protected int joy;


    public OrganicPet(String name, String color, int age, int hunger, int thirst, int joy) {
        super(name, color, age);

        this.hunger = 50;
        this.thirst = 50;
        this.joy = 25;

    }


    public void tick() {
        hunger = Math.min(100, hunger + 5);
        thirst = Math.min(100, thirst + 5);
        joy = Math.max(0, joy - 5);
    }

    public void feed() {
        hunger = Math.max(0, hunger - 25);
    }

    public void water() {
        thirst = Math.max(0, thirst - 25);
    }

    public void play() {
        joy = Math.max(0, joy + 25);
    }


    public void care() {
        feed();
        water();
        play();
    }

}