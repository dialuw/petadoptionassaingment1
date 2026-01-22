void main() {

    Shelter shelter = new Shelter();

    shelter.addPet(new Dog("Rex", 4));
    shelter.addPet(new Cat("Luna", 2));

    shelter.saveAllToDB();

    Adopter adopter = new Adopter("John");

    shelter.showAvailable();

    Scanner scanner = new Scanner(System.in);
    IO.print("Choose pet name: ");
    String name = scanner.nextLine();

    for (Pet pet : shelter.getPets()) {
        if (pet.getName().equalsIgnoreCase(name)) {
            adopter.takePet(pet);
        }
    }

    IO.println("\nPets from database:");
    PetDAO.showPets();
}
