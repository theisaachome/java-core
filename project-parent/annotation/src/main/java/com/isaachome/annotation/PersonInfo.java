package com.isaachome.annotation;

public @interface PersonInfo {
    String firstName();
    String lastName() default "your-lastname";
}
