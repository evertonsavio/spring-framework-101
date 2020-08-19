package dev.evertonsavio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TreinadorCricket oTreinador = context.getBean("meuTreinadorCricket", TreinadorCricket.class);
		
		System.out.println(oTreinador.getDailyFortune());
		System.out.println(oTreinador.getTreinoDiario());
		

	}

}
