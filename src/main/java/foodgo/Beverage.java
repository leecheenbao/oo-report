package foodgo;

public class Beverage extends MenuItem {
    private final String temperature;

    public Beverage(String itemId, String name, double price, String temperature) {
        super(itemId, name, price);
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
