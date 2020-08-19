package dev.evertonsavio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Carregar o arquivo de configuracao
		
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
			//Resgatar o bean do arquivo de configuracao (container)
			
			Treinador oTreinador = context.getBean("meuTreinador", Treinador.class);
			
			Treinador oAlphaTreinador = context.getBean("meuTreinador", Treinador.class);
			
			boolean result = (oTreinador == oAlphaTreinador);
			
			System.out.println("Mesmo objeto? " + result);

	}

}
