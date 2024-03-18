package Weekly_Assignment_Task_Management;

public class Admin {

    private String username;
    private String password;

    public Admin(String username, String password)
    {
        this.username= username;
        this.password= password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
