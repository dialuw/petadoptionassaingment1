public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("Rex", 4, "Dog", "Brown");
        Pet cat = new Pet("Luna", 2, "Cat",  "White");

        Adopter adopter = new Adopter("John");
        Shelter shelter = new Shelter("Animal Care");

        shelter.show(dog);
        shelter.show(cat);

        adopter.takePet(cat);

        if (dog.getAge() > cat.getAge()) {
            System.out.println(dog.getName() + " is older than " + cat.getName());
        } else {
            System.out.println(cat.getName() + " is older than " + dog.getName());
        }

        dog.printPet();
        cat.printPet();
    }
}
