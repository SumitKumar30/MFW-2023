package org.ncu.GreetingApp.fortune;



public class FactoryFortuneService {
	public FortuneService fortuneService(String lang) {
		if(lang.equals("eng")) {
			return new EnglishFortuneService();
		}else {
			throw new RuntimeException("Sorry, "+lang+" is not available!");
		}
	}
}
