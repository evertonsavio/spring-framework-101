package dev.evertonsavio.springdemo.scopesandlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.evertonsavio.springdemo.Coach;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Mesmo objeto " + result);
		
		System.out.println("Mesmo objeto " + theCoach);
		
		System.out.println("Mesmo objeto " + alphaCoach);

		context.close();
	}
}
