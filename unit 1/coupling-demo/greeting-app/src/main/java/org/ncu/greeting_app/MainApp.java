package org.ncu.greeting_app;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
		/*
		 * EnglishGreetingService eng = new EnglishGreetingService();
		 * eng.greet("Sumit");
		 * 
		 * FrenchGreetingService fre = new FrenchGreetingService(); fre.greet("Sumit");
		 * 
		 * SpanishGreetingService spa = new SpanishGreetingService();
		 * spa.greet("Sumit");
		 */
    	
    	FactoryGreetingService factory = new FactoryGreetingService();
    	GreetingService service = factory.greeting("spa");
    	
    	service.greet("Sumit");
    }
}
