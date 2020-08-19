package dev.evertonsavio.springdemo;

import org.springframework.stereotype.Component;

@Component //("thatSillyCoach") //been ID thatSillyCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Pratique sua sacada!";
	}

}
