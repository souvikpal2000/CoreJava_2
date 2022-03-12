package com.ibm.springcoredemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ibm.springcoredemo.beans.Country;
import com.ibm.springcoredemo.beans.Greetings;
import com.ibm.springcoredemo.beans.Person;
import com.ibm.springcoredemo.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    	//FileSystemXmlApplicationContext container02 = new FileSystemXmlApplicationContext("<path>");
        
    	//ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans3.xml"); 
        /*Greetings g1 = container.getBean(Greetings.class, "wish1");
        g1.setMessage("Good Night");
        Greetings g2 = container.getBean(Greetings.class, "wish1");
        System.out.println(g1.getMessage());
        System.out.println(g2.getMessage());*/
    	
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	//Person p = container.getBean(Person.class, "per1");
    	Person p = container.getBean(Person.class);
    	System.out.println(p.getSsn() + " : " + p.getName());
    	System.out.println(p.getAddress().getHno() + " : " +p.getAddress().getStreetName());
    	System.out.println(p.getAddress().getCity() + " : " + p.getAddress().getState());	
    	
    	/*Country c = container.getBean(Country.class, "country1");
    	System.out.println(c.getCountryId() + ", " + c.getCountryName() + " : " + c.getStates());*/
        container.close();
    }
}
