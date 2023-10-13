package OOPs.EncapsulationAndAbstraction;

public class Encapsulation {
    // Cannot directly access the userid and password
    // Encapsulation is the subprocess of data hiding
    private String userId;
    private String password;

    public Encapsulation(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
