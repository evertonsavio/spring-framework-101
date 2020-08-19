package dev.evertonsavio.springdemo;

public class TreinadorCricket implements Treinador {

	private FortunaService fortunaService;
	
	public TreinadorCricket() {
		//Cricket inside no-arg method.
	}
	
	public void setFortunaService(FortunaService fortunaService) {
		this.fortunaService = fortunaService;
	}  
	
	//Setters para Litaral Values  
	private String emailAddress;
	private String team;
	
	//Criar os Setters para Injections
	public void setEmailAddress(String emailAddress) {
		System.out.println("TreinadorCricket: setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("TreinadorCricket: setTeam");
		this.team = team;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
}
