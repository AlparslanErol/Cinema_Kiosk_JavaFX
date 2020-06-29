package GUI;

public class UserAccount {

    private String username;
    private String password;
    private boolean active;

    public UserAccount() {}

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.active = true;
    }

    public void deactivateAccount() {
        boolean active = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}