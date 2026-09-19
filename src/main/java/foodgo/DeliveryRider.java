package foodgo;

public class DeliveryRider extends User {
    private final String vehicleType;
    private String currentLocation;

    public DeliveryRider(String userId, String name, String phone, String vehicleType, String currentLocation) {
        super(userId, name, phone);
        this.vehicleType = vehicleType;
        this.currentLocation = currentLocation;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    public void acceptDelivery(Delivery delivery) {
        delivery.setRider(this);
    }
}
