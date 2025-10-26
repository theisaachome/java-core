package com.isaachome;

/**
 * Hello world!
 *
 */
public class App 
{

    String name1;
    public static void main( String[] args )
    {
        var app = new App();
        if(app.name1.isEmpty() ){
            System.out.println("name is empty"+app.name1.isEmpty());
        }else if(app.name1.length()==0){
            System.out.println("name length is empty"+app.name1.length());
        }else {
            System.out.println("We got your name "+app.name1);
        }
        System.out.println( "Hello World!" );
    }
}
