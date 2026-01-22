public class Adopter {

    private final String name;

    public Adopter(String name) {
        this.name = name;
    }

    public void takePet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.adopt();
            PetDAO.adoptPet(pet.getName());
            System.out.println(name + " adopted " + pet.getName());
        } else {
            System.out.println("Pet already adopted");
        }
    }
}
