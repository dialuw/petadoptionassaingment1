public class Adopter {

    private String name;

    public Adopter(String name) {
        this.name = name;
    }

    public void takePet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.adopt();
            System.out.println(name + " adopted " + pet.getName());
        } else {
            System.out.println("Pet already adopted");
        }
    }
}