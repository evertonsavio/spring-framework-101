package dev.evertonsavio.springdemo;

public class FortunaFelizService implements FortunaService {

	@Override
	public String getFortune() {

		return "Hoje e seu dia de sorte!";
	}

}
