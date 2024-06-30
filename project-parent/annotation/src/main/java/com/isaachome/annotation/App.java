package com.isaachome.annotation;

/**
 * Hello world!
 *
 */
@MyAppVersion(major = 1,minor = 10)
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @PersonInfo(firstName = "John")
    public String getInformation(){
        return "return sometime here";
    }
}
