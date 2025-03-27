public class Animal extends LivingThings {
    public Animal(int birthYear) {
        super(birthYear);
    }
    public int calculateAge() {
        return super.calculateAge();
    }
    public String consume(String food) {
        return "Eating " + food;
    }
    public int reproduce(int numOffspring) {
        return numOffspring;
    }
    public void makeSound() {
        System.out.print("Animal sound");
    }
}