public class Pet {

    private String name;
    private int age;
    private String kind;
    private String color;
    private boolean adopted;


    public Pet(String name, int age, String kind , String color) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.color = color;
        this.adopted = false;
    }


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



    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public void printPet() {
        System.out.println("Name: " + name);
        System.out.println("Kind: " + kind);
        System.out.println("Age: " + age);
        System.out.println("Adopted: " + adopted);
        System.out.println("Color: " + color);
        System.out.println();
    }
}