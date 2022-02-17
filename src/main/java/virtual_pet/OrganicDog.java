package virtual_pet;

public class OrganicDog extends OrganicPet implements Walkable{
    public OrganicDog(String name, String color, int age, int hunger, int thirst, int joy) {
        super(name, color, age, hunger, thirst, joy);
    }

    @Override
    public String toString() {
        return "OrganicDog{" +
                "thirst=" + thirst +
                ", hunger=" + hunger +
                ", joy=" + joy +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void walk() {
        hunger++;
        joy++;
    }
}
