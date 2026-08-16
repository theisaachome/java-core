package com.isaachome.demo;

public class UserAccount {
    // Hiding the states
    private String username;
    private String userpin;

    public UserAccount(String userpin, String username) {
        this.userpin = userpin;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUserpin(String newPin) {
        // Validation 4 digit pin
        if (newPin.length() != 4) {
            throw new IllegalArgumentException("Pin must be 4 digits");
        }
        this.userpin = newPin;
    }
}
