package dev.evertonsavio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AloSpringApp {

	public static void main(String[] args) {
	
			//Carregar a configuracao file
		
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//Recuperar o Bean do containner
			
			Treinador treinador = context.getBean("meuTreinador", Treinador.class); //Bean ID / Interface
			
			//Chamar os metodos do Bean
			
			System.out.println(treinador.getTreinoDiario());
			
			//Encerrar o contexto
			context.close();
	}

}
