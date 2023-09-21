package models;

import lombok.Getter;

@Getter
public class User {

    private final String userId;
    private final String name;
    private final String phoneNumber;
    private final UserType userType;

    public User(String userId, String name, String phoneNumber, UserType userType) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }
}
