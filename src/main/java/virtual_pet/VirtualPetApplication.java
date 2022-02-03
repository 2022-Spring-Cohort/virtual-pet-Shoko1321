package virtual_pet;


import java.util.ArrayList;
import java.util.Scanner;

class VirtualPetApplication {
    public static void main(String[] args) {


        ArrayList<String> pets = new ArrayList<String>();


        new VirtualPetApplication().game();
    }


    public void game() {

        VirtualPet myPet = new VirtualPet("Happy ", "gray", 5);
        System.out.println();
        PetShelter myShelter = new PetShelter();

        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number != 9) {
            System.out.println(myPet.stats());

            mainMenu();
            number = input.nextInt();
            input.nextLine();

            if (number == 0) {
                ;

            } else if (number == 1) {
                myPet.feed();
            } else if (number == 2) {
                myPet.water();
            } else if (number == 3) {
                myPet.play();
            } else if (number == 4) {
                for (String stats : myShelter.petStats()) {
                    System.out.println(stats);
                }

            } else if (number == 5) {
                System.out.println("Enter name");
                String name = input.nextLine();
                System.out.println("Enter fur color");
                String furColor = input.nextLine();
                System.out.println("Enter age");
                int age = input.nextInt();
                myShelter.addPet(new VirtualPet(name, furColor, age));

            } else if (number == 6) {
                int count = 0;
                for (String stats : myShelter.petStats()) {
                    System.out.println(count + " " + stats);
                    count++;
                }
                System.out.println("Enter index of pet you would like to adopt:");
                int index = input.nextInt();
                input.nextLine();
                myShelter.adoptPetByIndex(index);
            } else if (number == 7) {
              myPet.careAll();
            }


            myPet.tick();
        }


    }


    public void mainMenu() {
        System.out.println("Let's play!(Press 0 for help)");
        System.out.println("Enter 1 to feed the pet");
        System.out.println("Enter 2 to water the pet");
        System.out.println("Enter 3 to play with the pet");
        System.out.println("Enter 4 to see all pets in the shelter");
        System.out.println("Enter 5 to add a pet");
        System.out.println("Enter 6 to adopt a pet");
        System.out.println("Enter 7 to care for all the pets");
        System.out.println("Enter 9 to quit");


    }

}
