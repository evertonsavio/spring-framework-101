package dev.evertonsavio.springdemo;

public class TreinadorCricket implements Treinador {

	private FortunaService fortunaService;
	
	public TreinadorCricket() {
		//Cricket inside no-arg method.
	}
	
	public void setFortunaService(FortunaService fortunaService) {
		this.fortunaService = fortunaService;
	}

	@Override
	public String getTreinoDiario() {
		return "Pratique mais rapido!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunaService.getFortune();
	}

}
