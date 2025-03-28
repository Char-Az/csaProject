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

    public void reproduce(int numOffspring, String name[]) {
        for (int i = 0; i < numOffspring; i++){
            System.out.println("Giving birth to " + name[i] + " offspring.");
        }
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}