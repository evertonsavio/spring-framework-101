package dev.evertonsavio.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Estou cansado mas estou feliz!";
	}

}
