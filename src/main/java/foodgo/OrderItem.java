package foodgo;

public class OrderItem {
    private final MenuItem menuItem;
    private final int quantity;
    private final double unitPrice;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.unitPrice = menuItem.getPrice();
    }

    public double getSubtotal() {
        return unitPrice * quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
