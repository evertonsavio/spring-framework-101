package dev.evertonsavio.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//ler a spring config java class  
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Adquirir o bean do container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); //("thatSillyCoach", Coach.class);
		
		//chamar o metodo do bean
		System.out.println(theCoach.getDailyWorkout());
		
		//chamar o metodo da dependecia
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail() + " " + theCoach.getTeam());
		
		//Fechar o context
		context.close();
	}

}