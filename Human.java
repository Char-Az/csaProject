public class Human extends Animals {
    private String region;

    public Human(int birthYear, String region) {
        super(birthYear);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void dance() {
        System.out.println("I am from " + region + " and I am dancing.");
    }
}
