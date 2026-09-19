package foodgo;

import java.util.ArrayList;
import java.util.List;

/**
 * 擁有(aggregation)範例:Restaurant 擁有多個 MenuItem。
 */
public class Restaurant {
    private final String restaurantId;
    private final String name;
    private final String category;
    private boolean open;
    private final List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String restaurantId, String name, String category) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.category = category;
        this.open = true;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }
}
