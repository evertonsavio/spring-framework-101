package dev.evertonsavio.springdemo;

public class TreinadorRastreador implements Treinador {
	
	private FortunaService fortunaService;
	
	public TreinadorRastreador() {
		//Compile Issue no Main.java
	}
	
	public TreinadorRastreador(FortunaService fortunaService) {
		super();
		this.fortunaService = fortunaService;
	}

	@Override
	public String getTreinoDiario() {
		
		return "Corra 5km";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + fortunaService.getFortune();
	}
	
//Bean lifecycle
// Add init method
	public void doMyStartUpStuff() {
		System.out.println("Starting Stuff..");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Destroy Stuff..");
	}
	
// add a destroy method

}



