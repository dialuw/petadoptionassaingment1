import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void showAll() {
        pets.forEach(System.out::println);
    }

    public void showAvailable() {
        pets.stream()
                .filter(p -> !p.isAdopted())
                .forEach(System.out::println);
    }

    public void sortByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }
}