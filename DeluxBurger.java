 package resturant;

public class DeluxBurger extends Burger {

    public DeluxBurger() {
        super("Delux Burger", "no meat", "white", 50.0, "no additions");
        System.out.println(" it contains white bread only");
    }

    public void chips() {
        super.setDadditions("chips");
        super.setPrice(super.getPrice() + 6.5);

    }

    public void drinks() {
        super.setDadditions("drinks");
        super.setPrice(super.getPrice() + 11.5);

    }
}
