package foodgo;

/**
 * 對應 03_劇本與使用案例.md 的 PlaceOrder 劇本(王小美的晚餐訂購),
 * 示範 04_類別識別與類別圖.md 的繼承 / 擁有(aggregation) / Qualification 設計。
 */
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("R001", "阿明滷肉飯", "小吃");
        MenuItem riceBowl = new MainDish("M001", "滷肉飯(大)", 60.0, 1);
        MenuItem tea = new Beverage("M002", "紅茶(冰)", 30.0, "冰");
        restaurant.addMenuItem(riceBowl);
        restaurant.addMenuItem(tea);

        Merchant merchant = new Merchant("U001", "阿明", "0911111111", restaurant);

        Customer wangXiaomei = new Customer("U002", "王小美", "0922222222", "台北市大安區復興南路一段X號");

        Order order = new Order("ORD20260919001", wangXiaomei, restaurant);
        order.addItem(new OrderItem(riceBowl, 2));
        order.addItem(new OrderItem(tea, 1));

        Payment payment = new CreditCardPayment("PAY001", order.getTotalAmount(), "**** 1234");
        if (payment.charge()) {
            wangXiaomei.placeOrder(order);
        }

        merchant.acceptOrder(order);
        System.out.println("訂單狀態: " + order.getStatus());

        DeliveryRider rider = new DeliveryRider("U003", "小李", "0933333333", "機車", "大安區");
        Delivery delivery = new Delivery("DLV001", order);
        rider.acceptDelivery(delivery);
        order.setStatus(OrderStatus.DELIVERING);
        System.out.println("訂單狀態: " + order.getStatus());

        // Qualification 範例:Customer[orderId] -> 唯一一筆 Order
        Order found = wangXiaomei.getOrderById("ORD20260919001");
        System.out.println("依 orderId 查回訂單: " + found.getOrderId() + ", 合計 $" + found.getTotalAmount());
    }
}
