package org.ncu.greeting_app;

public class FrenchGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}
}
