package foodgo;

import java.util.HashMap;
import java.util.Map;

/**
 * Qualification 範例:orders 以 orderId 為 key,
 * Customer[orderId] -> 唯一一筆 Order,不需逐筆搜尋整個集合。
 */
public class Customer extends User {
    private String defaultAddress;
    private int loyaltyPoints;
    private final Map<String, Order> orders = new HashMap<>();

    public Customer(String userId, String name, String phone, String defaultAddress) {
        super(userId, name, phone);
        this.defaultAddress = defaultAddress;
        this.loyaltyPoints = 0;
    }

    public String getDefaultAddress() {
        return defaultAddress;
    }

    public void placeOrder(Order order) {
        orders.put(order.getOrderId(), order);
        order.submit();
    }

    /** Qualification 存取:用 orderId 直接定位訂單 */
    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }
}
