package org.ncu.GreetingApp;

import org.ncu.GreetingApp.fortune.FactoryFortuneService;
import org.ncu.GreetingApp.fortune.FortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

// Dependent Class
public class MainApp 
{
    public static void main( String[] args )
    {
		/*
		 * FactoryGreetingService factory = new FactoryGreetingService();
		 * GreetingService service = factory.greetingService("eng");
		 * service.greet("John");
		 * 
		 * FactoryFortuneService factory2 = new FactoryFortuneService(); FortuneService
		 * service2 = factory2.fortuneService("eng"); service2.tellFortune("John");
		 */
    	
    	// Step 1: Initialize the spring container
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    
    	// Step 2: Get the desired bean
    	GreetingService service = context.getBean("freGreeting", GreetingService.class);
    
    	// Step 3: Perform the required operation
    	service.greet("Sumit");
    	
    	// Step 4: close the context
    	context.close();
    }
}
