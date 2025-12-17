public class Pet {

    private String name;
    private int age;
    private String kind;
    private boolean adopted;

    // Constructor
    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.adopted = false;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public boolean getAdopted() {
        return adopted;
    }

    // Setter
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    // Method
    public void printPet() {
        System.out.println("Name: " + name);
        System.out.println("Kind: " + kind);
        System.out.println("Age: " + age);
        System.out.println("Adopted: " + adopted);
        System.out.println();
    }
}