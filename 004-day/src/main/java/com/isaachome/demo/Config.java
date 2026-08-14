package com.isaachome.demo;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static final Map<String, String> config = new HashMap<>();

    static {
        config.put("username", "isaachome");
        config.put("password", "12345");
    }
    {
        System.out.println("Config Initialized");
    }

    static void main() {
        System.out.printf("username: %s\npassword: %s\n", Config.config.get("username"),Config.config.get("password"));
    }
}
