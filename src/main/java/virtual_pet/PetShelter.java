package virtual_pet;

import java.util.ArrayList;

public class PetShelter {

    ArrayList<VirtualPet> pets;

    public PetShelter() {
        pets = new ArrayList<>();
        pets.add(new VirtualPet("Happy", "gray", 10));
        pets.add(new VirtualPet("Pig", "pink", 7));
        pets.add(new VirtualPet("Snail", "green", 1));
        pets.add(new VirtualPet("Spoder", "black", 2));
    }



    public void addPet(VirtualPet pet) {
        pets.add(pet);
    }


    public ArrayList<VirtualPet> getPets() {
        return pets;
    }

    public String[] petStats() {
        String[] stats = new String[pets.size()];
        int count = 0;
        for (VirtualPet pet : pets) {
            stats[count] = pet.stats();
            count++;
        }
        return stats;
    }
//
//   // public void feedAll() {
//        for (VirtualPet pet : pets.()) {
//            pet.feed();
//            pet.water();
//            pet.play();
//        }
//    }


    public void adoptPetByName(String name){
        pets.remove(findPetByName(name));
    }
    public void adoptPetByIndex(int index){
        pets.remove(index);
    }

    private VirtualPet findPetByName(String name){
        for (VirtualPet pet:pets) {
            if(pet.getName().equalsIgnoreCase(name)){
                return pet;
            }
        }
        return null;
    }

}
