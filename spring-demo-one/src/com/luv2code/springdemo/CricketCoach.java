package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside Cricket coach construcotr");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket coach setFortuneService");

		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
