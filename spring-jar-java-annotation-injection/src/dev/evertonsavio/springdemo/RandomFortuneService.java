package dev.evertonsavio.springdemo;

import java.util.Random;

import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Criar um array de Strings
	
	private String[] data = {"omg", "lol", "thats Cool"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
	// pegar uma string random do array
		int index = random.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
