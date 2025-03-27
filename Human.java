public class Human extends Animal {
    private String region;
    private String name;

    public Human(int birthYear, String region, String name) {
        super(birthYear);
        this.region = region;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    public void makeSound(String name) {
        System.out.println("My name is " + name);
    }

    public void dance() {
        System.out.println("I am from " + region + ", my name is " + name + " and I am dancing.");
    }

    public static void main(String[] args) {
        Human dave = new Human(2000, "Bronx", "Dave");
        Human jamal = new Human(1992, "Oakland", "Jamal");
        Dog cookie = new Dog(2015, "Cookie");

        dave.dance();
        dave.makeSound();
        System.out.println(dave.getName() + " is " + dave.calculateAge() + " years old.");
        jamal.dance();
        jamal.makeSound();
        System.out.println(jamal.getName() + " is " + jamal.calculateAge() + " years old.");

        cookie.makeSound();
        System.out.println(cookie.getName() + " is " + cookie.calculateAge() + " years old.");
    }
}
