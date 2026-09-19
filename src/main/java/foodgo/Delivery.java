package foodgo;

public class Delivery {
    private final String deliveryId;
    private final Order order;
    private DeliveryRider rider;

    public Delivery(String deliveryId, Order order) {
        this.deliveryId = deliveryId;
        this.order = order;
    }

    public void setRider(DeliveryRider rider) {
        this.rider = rider;
        System.out.println("外送員 " + rider.getName() + " 已接受派單: " + deliveryId);
    }

    public DeliveryRider getRider() {
        return rider;
    }

    public Order getOrder() {
        return order;
    }
}
