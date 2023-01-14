package org.ncu.GreetingApp;

public class EnglishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hello, "+name);
	}
}
