package org.ncu.GreetingApp;

public class SpanishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hola, "+name);
	}
}
