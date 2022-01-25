package virtual_pet;

import java.util.Scanner;

class VirtualPetApplication {
    public static void main(String[] args) {
        new VirtualPetApplication().game();
    }

    public void game() {

        VirtualPet myPet = new VirtualPet("Happy ", "gray", 5);
        System.out.println();


        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number != 9) {
            myPet.stats();
            mainMenu();
            number = input.nextInt();

            if (number == 0) {
                mainMenu();

            } else if (number == 1) {
                myPet.about();
            } else if (number == 2) {
                myPet.feed();
            } else if (number == 3) {
                myPet.water();
            } else if (number == 4) {
                myPet.play();
            }
            myPet.tick();
        }


    }

    public void mainMenu() {
        System.out.println("Let's play!(Press 0 for help)");
        System.out.println("Enter 1 to hear about the pet");
        System.out.println("Enter 2 to feed the pet");
        System.out.println("Enter 3 to water the pet");
        System.out.println("Enter 4 to play with the pet");
        System.out.println("Enter 9 to quit");

    }

}
