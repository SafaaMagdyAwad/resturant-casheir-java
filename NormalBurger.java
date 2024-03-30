package resturant;

public class NormalBurger extends Burger {

    public NormalBurger() {
        super("Normal burger", "no meat", "no bread", 50, "no addition");
    }

    public void extraChees() {
        super.setDadditions("extra Chees");
        super.setPrice(super.getPrice() + 5.5);

    }

    public void extratomatoes() {
        super.setDadditions("extra tomatoes");
        super.setPrice(super.getPrice() + 4.5);

    }

    public void whitebread() {
        super.setTypeofbread("white");
    }

    public void brownebread() {
        super.setTypeofbread("prown");
    }
}
