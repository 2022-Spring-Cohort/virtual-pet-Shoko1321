package virtual_pet;

public class RoboDog extends RobotPet implements Walkable{

    public RoboDog(String name, String color, int age) {
        super(name, color, age);
    }



    @Override
    public void walk() {
        battery--;
        functionality++;
    }

    @Override
    public String toString() {
        return "RoboDog{" +
                "battery=" + battery +
                ", functionality=" + functionality +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
