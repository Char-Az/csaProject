public class Dog extends Animals {
    private String name;

    public Dog(int birthYear, String name) {
        super(birthYear);
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + "goes woof.");
    }
}
