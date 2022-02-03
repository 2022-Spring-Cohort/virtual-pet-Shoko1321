package virtual_pet;


//     Iteration 2
//        Ability for players to admit pets into the shelter or adopt them
//        Ability for players to see a list of all pets in the shelter
//        Ability for players to see the current status of all pets at once, such as hunger, boredom, and health
//        Ability for players to choose to interact with one pet or all pets, such as feed, play, and take to doctor

public class VirtualPet {


    private String name;
    private String furColor;
    private int age;
    private int hunger;
    private int thirst;
    private int joy;


    public VirtualPet(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.hunger = 50;
        this.thirst = 50;
        this.joy = 25;
    }


    public void tick() {
        hunger = Math.min(100, hunger + 5);
        thirst = Math.min(100, thirst + 5);
        joy = Math.max(0, joy - 5);
    }

    public String stats() {

        return name + " hunger: " + hunger + " thirst: " + thirst + " joy: " + joy;

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

    public void careAll(){
        feed();
        water();
        play();
    }


    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }



}

