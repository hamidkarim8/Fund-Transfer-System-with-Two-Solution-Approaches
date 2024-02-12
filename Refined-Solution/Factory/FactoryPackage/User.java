package FactoryPackage;

public interface User {
    String getUsername();
    String getEmail();
    String getPassword(); 
    boolean login(String enteredPassword);
    void logout();
}
