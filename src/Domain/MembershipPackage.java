package Domain;

public class MembershipPackage {

    private String name;
    private double price;

    public MembershipPackage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

