package foodgo;

public class MainDish extends MenuItem {
    private final int spicyLevel;

    public MainDish(String itemId, String name, double price, int spicyLevel) {
        super(itemId, name, price);
        this.spicyLevel = spicyLevel;
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }
}
