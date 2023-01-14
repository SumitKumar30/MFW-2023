package org.ncu.GreetingApp;

import org.ncu.GreetingApp.fortune.FactoryFortuneService;
import org.ncu.GreetingApp.fortune.FortuneService;

/**
 * Hello world!
 *
 */

// Dependent Class
public class MainApp 
{
    public static void main( String[] args )
    {
        FactoryGreetingService factory = new FactoryGreetingService();
        GreetingService service = factory.greetingService("eng");
        service.greet("John");
        
        FactoryFortuneService factory2 = new FactoryFortuneService();
        FortuneService service2 =  factory2.fortuneService("eng");
        service2.tellFortune("John");
    }
}
