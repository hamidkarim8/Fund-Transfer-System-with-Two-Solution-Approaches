package DecoratorPackage;
public class User {
    private String username;
    private String password;
    private String email;
    private boolean isLoggedIn;
  
    public User(String username, String password, String email) {
      this.username = username;
      this.password = password;
      this.email = email;
      this.isLoggedIn = false;
    }
  
    public boolean isLoggedIn() {
      return isLoggedIn;
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

    // Getters and setters for user attributes
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
  
    public String getEmail() {
      return email;
    }
  
    public void setEmail(String email) {
      this.email = email;
    }


}
