package virtual_pet;

public class OrganicCat extends OrganicPet implements litterBox{

    public OrganicCat(String name, String color, int age, int hunger, int thirst, int joy) {
        super(name, color, age, hunger, thirst, joy);
    }

    @Override
    public String toString() {
        return "OrganicCat{" +
                "thirst=" + thirst +
                ", hunger=" + hunger +
                ", joy=" + joy +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void litterBox() {
        joy ++;
    }
}
