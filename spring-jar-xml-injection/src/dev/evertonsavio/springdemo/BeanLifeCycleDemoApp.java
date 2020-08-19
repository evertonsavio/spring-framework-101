package dev.evertonsavio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Carregar o arquivo de configuracao
		
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
			//Resgatar o bean do arquivo de configuracao (container)
			
			Treinador oTreinador = context.getBean("meuTreinador", Treinador.class);
			
			System.out.println(oTreinador.getTreinoDiario());
			
			context.close();

	}

}
