package virtual_pet;

import java.util.Scanner;

public class VirtualPet {

        private String name;
        private String furColor;
        private int age;
        private int hunger;
        private int thirst;
        private int joy;

        //public Cat happy = new Cat("Happy", "gray", 5)

        public VirtualPet(String name, String furColor, int age) {
            this.name = name;
            this.furColor = furColor;
            this.age = age;
            this.hunger = 50;
            this.thirst = 50;
            this.joy = 25;
        }

        public void tick(){
            hunger = Math.min(100, hunger + 5);
            thirst = Math.min(100, thirst + 5);
            joy = Math.max(0, joy - 5);
        }

        public void about(){

            System.out.println("My name is " + name + " I have long " + furColor + " fur and I'm "+ age + " years old ");
        }

        public void stats(){

            System.out.println(" My names " + name + " hunger: " + hunger + " thirst: " + thirst + " joy: " + joy );

        }


        public void feed(){
            hunger = Math.max(0,hunger -25);
        }

        public void water(){
            thirst = Math.max(0, thirst -25);
        }

        public void play(){
            joy = Math.max(0, joy +25);
        }


        public String getName(){
            return name;
        }
        public String getFurColor(){
            return furColor;
        }

    public int getAge() {
        return age;
    }
}

