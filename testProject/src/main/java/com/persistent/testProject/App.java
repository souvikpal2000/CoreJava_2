package com.persistent.testProject;

import java.time.LocalDate;

import com.persistent.testProject.graphics.Circle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Welcome!!! to my Maven Project");
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println("");
        Circle c = new Circle(5);
        System.out.println(c.area());
    }
}
