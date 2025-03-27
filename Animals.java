public class Animals extends LivingThings {
    public Animals(int birthYear) {
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
    public String makeSound() {
        return "Animal sound";
    }
}