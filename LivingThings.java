import java.time.Year;

public class LivingThings {
    private int birthYear;

    public LivingThings(int birthYear) {
        this.birthYear = birthYear;
    }

    public int calculateAge() {
        return Year.now().getValue() - birthYear;
    }
}
