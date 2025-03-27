public class Human extends Animal {
    private String region;

    public Human(int birthYear, String region) {
        super(birthYear);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
    public void name(String name) {
        System.out.println("My name is " + name);
    }

    public void dance() {
        System.out.println("I am from " + region + " and I am dancing.");
    }

}
