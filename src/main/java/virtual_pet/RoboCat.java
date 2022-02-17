package virtual_pet;

public class RoboCat extends RobotPet implements litterBox{
    public RoboCat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "RoboCat{" +
                "battery=" + battery +
                ", functionality=" + functionality +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void litterBox(){
        functionality ++;
    }
}
