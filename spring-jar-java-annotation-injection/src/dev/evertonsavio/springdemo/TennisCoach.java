package dev.evertonsavio.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //("thatSillyCoach") //been ID thatSillyCoach
//@Scope("prototype") // Cria Beans diferentes pra cada vez que acessa o container
public class TennisCoach implements Coach {
	
	@Autowired //Aplica direto no field atraves de Java Reflection, mto bom!
	@Qualifier("randomFortuneService") //Porque temos varias implementacoes para a FortuneService
	private FortuneService fortuneService;
	
	public TennisCoach() {
		//Construcor with no parameter
	};
	
	/*@Autowired
	private TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Pratique sua sacada!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Startup stuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Destroy this!");
	}

}
