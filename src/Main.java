import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Shelter shelter = new Shelter();
        shelter.addPet(new Dog("Rex", 4));
        shelter.addPet(new Cat("Luna", 2));

        Adopter adopter = new Adopter("John");

        System.out.println("Available pets:");
        shelter.showAvailable();

        System.out.print("Choose pet name: ");
        String name = scanner.nextLine();

        for (Pet pet : shelter.pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                adopter.takePet(pet);
            }
        }

        shelter.sortByAge();
        System.out.println("\nSorted by age:");
        shelter.showAll();
    }
}