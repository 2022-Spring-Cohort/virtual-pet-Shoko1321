package virtual_pet;

import java.util.ArrayList;

public class PetShelter {

    ArrayList<VirtualPet> pets;

    public PetShelter() {
        pets = new ArrayList<>();
        pets.add(new OrganicCat("Happy", "gray", 15,10,10,10));
        pets.add(new RoboCat("Pig", "pink", 5));
        pets.add(new RoboDog("RoboSnail", "green", 15));
        pets.add(new OrganicDog("Spoder", "black", 25,10,10,10));
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
            stats[count] = pet.toString();
            count++;
        }
        return stats;
    }


    public void selectPet (String name) {pets.clone();}
    public void adoptPetByName(String name){
        pets.remove(findPetByName(name));
    }
    public void adoptPetByIndex(int index){
        pets.remove(index);
    }
    public VirtualPet getPetByIndex(int index){
        return pets.get(index);
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
