package foodgo;

public class Merchant extends User {
    private final Restaurant restaurant;

    public Merchant(String userId, String name, String phone, Restaurant restaurant) {
        super(userId, name, phone);
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void acceptOrder(Order order) {
        order.setStatus(OrderStatus.PREPARING);
    }

    public void markMenuItemAvailability(MenuItem item, boolean available) {
        item.setAvailable(available);
    }
}
