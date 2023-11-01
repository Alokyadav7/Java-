package GUI;

import java.util.PrimitiveIterator;

public class User {
    private String Name;
    private String UserName;
    private String Password;

    public User(String name, String userName, String password) {
        Name = name;
        UserName = userName;
        Password = password;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getUserName() {

        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
