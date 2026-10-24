package com.isaachome.designpattern.builder;

public class UserClientApp {
    static void main() {
        var johnDoe = new User.Builder()
                .withAddress("Yangon,Myanmar")
                .withEmail("johndoe@gmail.com")
                .withName("John Doe")
                .build();
        System.out.println(johnDoe);
    }
}
