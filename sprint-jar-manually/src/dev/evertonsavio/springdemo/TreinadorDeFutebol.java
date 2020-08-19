package dev.evertonsavio.springdemo;

public class TreinadorDeFutebol implements Treinador {
	
	//Campo Privado -> Dependecy Injection
	private FortunaService fortunaServ;
	
	//Construtor -> Dependecy Injection
	public TreinadorDeFutebol(FortunaService fortunaService) {
		fortunaServ = fortunaService; 
	}
	
	@Override
	public String getTreinoDiario(){
		return "Malhe pelo menos 30min";
	}

	@Override
	public String getDailyFortune() {

		return fortunaServ.getFortune();
	}
	
}
