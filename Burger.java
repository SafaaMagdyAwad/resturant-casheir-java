package resturant;
public class Burger {
    private String name;
    private String typeofmeat;
    private String typeofbread;
    private double price;
    private String additions;
    public String getName() {
        return name;
    }
    public String getTypeofmeat() {
        return typeofmeat;
    }
    public String getTypeofbread() {
        return typeofbread;
    }
    public double getPrice() {
        return price;
    }
    public String getadditions() {
        return additions;
    }
    public Burger(String name, String typeofmeat, String typeofbread, double price, String additions) {
        this.name = name;
        this.typeofmeat = typeofmeat;
        this.typeofbread = typeofbread;
        this.price = price;
        this.additions = additions;
    }
    public void beef() {
        typeofmeat = "Beef";
        price = price + 10;
    }
    public void chickens() {
        typeofmeat = "checkens";
        price = price + 20;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTypeofmeat(String typeofmeat) {
        this.typeofmeat = typeofmeat;
    }
    public void setTypeofbread(String typeofbread) {
        this.typeofbread = typeofbread;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDadditions(String additions) {
        this.additions = additions;
    }
    @Override
    public String toString() {
        return "your order is " + name + "  " + typeofmeat + "  " + typeofbread + "bread     " + additions + "      " + price;
    }
}
