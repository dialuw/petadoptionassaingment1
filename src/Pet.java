public class Pet {

    private String name;
    private int age;
    private String kind;
    private String color;
    private boolean adopted;

    // Constructor
    public Pet(String name, int age, String kind , String color) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.color = color;
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
    public String getColor() {
        return color;
    }


    // Setter
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Method
    public void printPet() {
        System.out.println("Name: " + name);
        System.out.println("Kind: " + kind);
        System.out.println("Age: " + age);
        System.out.println("Adopted: " + adopted);
        System.out.println("Color: " + color);
        System.out.println();
    }
}