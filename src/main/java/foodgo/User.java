package foodgo;

public abstract class User {
    private final String userId;
    private final String name;
    private final String phone;

    protected User(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
