import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class representing a small local animal shelter.
 */
public class AnimalShelterMain {

    private HashMap<Integer, Animal>Id;
    private HashMap<String, Animal>AnimalName;


    /**
     * Construct a new animal shelter object with no animals.
     */
    public AnimalShelterMain() {
//        this.animals = new ArrayList<>();
        Id = new HashMap<>();
        AnimalName = new HashMap<>();

    }

    /**
     * Add the given animal to the shelter.
     *
     * @param newAnimal
     */
    public void addAnimal(Animal newAnimal) {
        Id.put(newAnimal.getID(), newAnimal);
        AnimalName.put(newAnimal.getName(), newAnimal);
    }



    /**
     * String representation of this shelter with all its animals.
     */
    @Override
    public String toString() {
        return String.format("AnimalShelterMain with animals: %s", this.Id);
    }

    /**
     * Update weight of animal with given ID
     *
     * @param id
     * @param newWeight
     */

    public void updateAnimalWeight(int id, double newWeight){
        Id.get(id).setWeight(20);
    }

    /**
     * Retrieve an Animal with the given name.
     *
     * @param name
     * @return the first Animal found with the given name, or null if none found
     */
    public Animal getAnimalByName(String Name) {
//        for (Animal animal : animals) {
//            if (name.equals(animal.getName())) {
//                return animal;
//            }

//        }
        return AnimalName.get(Name);

    }

    public static void main(String[] args) {
        AnimalShelterMain shelter = new AnimalShelterMain();

        Animal namelessAnimal = new Animal(12345);
        shelter.addAnimal(namelessAnimal);
        System.out.println(shelter);

        Animal fido = new Animal(31516, "Fido", "dog");
        Animal mittens = new Animal(12345, "Mittens", "cat");
        shelter.addAnimal(fido);
        shelter.addAnimal(mittens);
        mittens.setWeight(13.4);
        shelter.addAnimal(new Animal(11111));
        System.out.println(shelter);

        String nameToSearch = "Fido";
        System.out.println("\nSearching for " + nameToSearch + "...");
        System.out.println(shelter.getAnimalByName(nameToSearch));
        double newMittensWeight = 8.7;
        shelter.updateAnimalWeight(mittens.getID(), newMittensWeight);
        System.out.println(mittens);
    }
}
