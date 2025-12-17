public class Adopter {

    private String personName;

    // Constructor
    public Adopter(String personName) {
        this.personName = personName;
    }

    // Method
    public void takePet(Pet pet) {
        if (!pet.getAdopted()) {
            pet.setAdopted(true);
            System.out.println(personName + " took the pet " + pet.getName());
        } else {
            System.out.println("This pet is already adopted");
        }
    }
}