package org.ncu.greeting_app;

public class SpanishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hola, "+name);
	}
}
