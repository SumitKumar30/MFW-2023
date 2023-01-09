package org.ncu.greeting_app;

public class FactoryGreetingService {
	public GreetingService greeting(String lang) {
		if(lang.equals("eng")) {
			return new EnglishGreetingService();
		}else if(lang.equals("fre")) {
			return new FrenchGreetingService();
		}else if(lang.equals("spa")) {
			return new SpanishGreetingService();
		}else {
			throw new RuntimeException("Sorry, "+lang+" language is not available!!");
		}
	}
}
