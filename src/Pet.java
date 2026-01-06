public abstract class Pet {

    private String name;
    private int age;
    private boolean adopted;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.adopted = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void adopt() {
        this.adopted = true;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " | Name: " + name + ", Age: " + age + ", Adopted: " + adopted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return name.equals(pet.name) && age == pet.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}