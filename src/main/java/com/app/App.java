package com.app;

import com.app.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Person p1 = new Person("ADAM", 30);

        System.out.println(p1.toString());
        System.out.println(p1.getAge());
    }
}
