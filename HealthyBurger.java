package resturant;

public class HealthyBurger extends Burger {

    public HealthyBurger() {
        super("Healthy Burger", "no meat", "brown", 50, "no additions");
        System.out.println(" it contains brown bread only");
    }

    public void extraChees() {
        super.setDadditions("extra Chees");
        super.setPrice(super.getPrice() + 5.5);

    }

    public void extratomatoes() {
        super.setDadditions("extra tomatoes");
        super.setPrice(super.getPrice() + 4.5);

    }
}
