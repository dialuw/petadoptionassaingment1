import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private final List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void showAvailable() {
        for (Pet pet : pets) {
            if (!pet.isAdopted()) {
                System.out.println(pet);
            }
        }
    }

    public void saveAllToDB() {
        for (Pet pet : pets) {
            PetDAO.addPet(pet);
        }
    }

}
