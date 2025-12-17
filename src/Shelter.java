public class Shelter {

    private String name;


    public Shelter(String name) {
        this.name = name;
    }


    public void show(Pet pet) {
        System.out.println("Shelter name: " + name);
        pet.printPet();
    }
}