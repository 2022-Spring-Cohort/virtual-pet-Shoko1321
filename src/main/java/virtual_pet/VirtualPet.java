package virtual_pet;




abstract public class VirtualPet {


    protected String name;
    protected String color;
    protected int age;


    public VirtualPet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }


    public void tick() {
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }



}

