package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World 2!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        int kk=0;
        if ( kk==1 ) {}
        if ( kk==0 ) { foo(); }
        return message;
    }

    private static void foo() {
        int pp=0;
        if ( pp==0 ) {}
        if ( pp==1 ) { foo(); }
        return;
    }
    
}
