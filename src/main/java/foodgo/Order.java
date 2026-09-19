package foodgo;

import java.util.ArrayList;
import java.util.List;

/**
 * 擁有(aggregation)範例:Order 擁有多個 OrderItem。
 */
public class Order {
    private static final double DELIVERY_FEE = 30.0;

    private final String orderId;
    private final Customer customer;
    private final Restaurant restaurant;
    private final List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;

    public Order(String orderId, Customer customer, Restaurant restaurant) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.status = OrderStatus.CREATED;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getTotalAmount() {
        double subtotal = items.stream().mapToDouble(OrderItem::getSubtotal).sum();
        return subtotal + DELIVERY_FEE;
    }

    public void submit() {
        this.status = OrderStatus.CREATED;
        System.out.printf("訂單 %s 已成立,合計 $%.1f%n", orderId, getTotalAmount());
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }
}
