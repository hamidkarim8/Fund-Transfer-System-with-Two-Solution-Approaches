package FactoryPackage;

// Factory for creating ConcreteUser instances
public class UserFactory {
    public User createUser(String username, String password, String email) {
        return new PrimaryUser(username, password, email);
    }
}