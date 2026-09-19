package foodgo;

public class Admin extends User {
    private final int adminLevel;

    public Admin(String userId, String name, String phone, int adminLevel) {
        super(userId, name, phone);
        this.adminLevel = adminLevel;
    }

    public int getAdminLevel() {
        return adminLevel;
    }

    public void approveAccount(User user) {
        System.out.println("Admin " + getName() + " approved account: " + user.getName());
    }
}
