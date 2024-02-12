package FactoryPackage;

public class PrimaryUser implements User {
    private String username;
    private String email;
    private String password;
    private boolean isLoggedIn;

    public PrimaryUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        isLoggedIn = false;
    }


    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public String getUsername() {
        return username;
    }

    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
