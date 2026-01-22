public abstract class Pet {

    protected String name;
    protected int age;
    protected boolean adopted;

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
        adopted = true;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " | " + name + " | age=" + age + " | adopted=" + adopted;
    }
}
