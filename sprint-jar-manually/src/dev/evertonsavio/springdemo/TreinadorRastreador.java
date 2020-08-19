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

}
