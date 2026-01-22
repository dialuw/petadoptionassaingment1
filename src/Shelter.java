import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    private List<Pet> pets = new ArrayList<>();

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

    public void sortByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }
}
