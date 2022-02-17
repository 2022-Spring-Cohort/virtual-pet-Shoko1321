package virtual_pet;


import java.util.Scanner;

class VirtualPetApplication {
    public void main(String[] args) {


        new VirtualPetApplication().game();
    }


    public void game() {

        //VirtualPet myPet = new OrganicCat("Happy ", "gray", 5,10,10,10);
        System.out.println();
        PetShelter myShelter = new PetShelter();

        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number != 9) {
            //System.out.println(myPet);
            listPets(myShelter.petStats());
            mainMenu();
            number = input.nextInt();
            input.nextLine();

            if (number == 0) {
                listPets(myShelter.petStats());
                System.out.println("Enter index of pet you would like to interact with:");
                int petNum = input.nextInt();
                input.nextLine();
                VirtualPet tempPet = myShelter.getPetByIndex(petNum);
                if(tempPet instanceof RoboDog){
                    System.out.println("Press 1 to charge");
                    System.out.println("Press 2 to maintain");
                    System.out.println("Press 3 to Walk");
                    int choice = input.nextInt();
                    if(choice==1){
                        ((RoboDog)tempPet).recharge();
                    }
                    if(choice==2){
                        ((RoboDog)tempPet).repair();
                    }
                    if(choice==3){
                        ((RoboDog)tempPet).walk();
                    }
                }
                if(tempPet instanceof RoboCat){
                    System.out.println("Press 1 to charge");
                    System.out.println("Press 2 to maintain");
                    System.out.println("Press 3 to change litterBox");
                    int choice = input.nextInt();
                    if(choice==1){
                        ((RoboCat)tempPet).recharge();
                    }
                    if(choice==2){
                        ((RoboCat)tempPet).repair();
                    }
                    if(choice==3){
                        ((RoboCat)tempPet).litterBox();
                    }
                }
                if(tempPet instanceof OrganicDog){
                    System.out.println("Press 1 to feed");
                    System.out.println("Press 2 to water");
                    System.out.println("Press 3 to Walk");
                    int choice = input.nextInt();
                    if(choice==1){
                        ((OrganicDog)tempPet).feed();
                    }
                    if(choice==2){
                        ((OrganicDog)tempPet).water();
                    }
                    if(choice==3){
                        ((OrganicDog)tempPet).walk();
                    }
                }
                if(tempPet instanceof  OrganicCat){
                    System.out.println("Press 1 to feed");
                    System.out.println("Press 2 to water");
                    System.out.println("Press 3 to change litter box");
                    int choice = input.nextInt();
                    if(choice==1){
                        ((OrganicCat)tempPet).feed();
                    }
                    if(choice==2){
                        ((OrganicCat)tempPet).water();
                    }
                    if(choice==3){
                        ((OrganicCat)tempPet).litterBox();
                    }
                }


            } else if (number == 4) {
                listPets(myShelter.petStats());

            } else if (number == 5) {
                System.out.println("Enter name");
                String name = input.nextLine();
                System.out.println("Enter fur color");
                String furColor = input.nextLine();
                System.out.println("Enter age");
                int age = input.nextInt();
                myShelter.addPet(new OrganicCat(name, furColor, age, 10, 10, 10));

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
//                    } else if (number == 7) {
//                        myPet.careAll();
            }
//
//
                   VirtualPet.tick();
        }


    }


    public void mainMenu() {
        System.out.println("Let's play!(Press 0 to swap pets)");
        System.out.println("Enter 1 to interact with a pet");
        System.out.println("Enter 2 to water the pet");
        System.out.println("Enter 3 to play with the pet");
        System.out.println("Enter 4 to see all pets in the shelter");
        System.out.println("Enter 5 to add a pet");
        System.out.println("Enter 6 to adopt a pet");
        System.out.println("Enter 7 to care for all the pets needs ");
        System.out.println("Enter 9 to quit");


    }

    public void listPets(String[] pets) {
        int count = 0;
        System.out.println("*****************************************************************************************************");
        for (String stats : pets) {
            System.out.println(count + " " + stats);
            count++;
        }
        System.out.println("*****************************************************************************************************");
    }

}
