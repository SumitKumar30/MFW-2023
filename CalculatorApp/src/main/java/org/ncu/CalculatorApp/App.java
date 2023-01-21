package org.ncu.CalculatorApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Step 1: Initialize the Spring container
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// Step 2: Get the desired bean
    	Calculator cal = context.getBean("calc",Calculator.class);
        
    	// Step 3: Perform the desired operation
    	cal.compute("sub", 10, 20);
    	
    	// Step 4: close the context
    	context.close();
    }
}
