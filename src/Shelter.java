public class Shelter {

    private String name;

    // Constructor
    public Shelter(String name) {
        this.name = name;
    }

    // Method
    public void show(Pet pet) {
        System.out.println("Shelter name: " + name);
        pet.printPet();
    }
}