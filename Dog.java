public class Dog extends Animal {
    private String name;

    public Dog(int birthYear, String name) {
        super(birthYear);
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + "goes woof.");
    }

    public String getName() {
        return name;
    }
}
