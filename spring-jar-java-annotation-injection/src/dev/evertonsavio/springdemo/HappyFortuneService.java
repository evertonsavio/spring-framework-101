package dev.evertonsavio.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "I wish you the best of the world!";
	}

}
