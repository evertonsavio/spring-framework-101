package dev.evertonsavio.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//ler a spring config java class  
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Adquirir o bean do container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); //("thatSillyCoach", Coach.class);
		
		//chamar o metodo do bean
		System.out.println(theCoach.getDailyWorkout());
		
		//chamar o metodo da dependecia
		System.out.println(theCoach.getDailyFortune());
		
		//Fechar o context
		context.close();
	}

}