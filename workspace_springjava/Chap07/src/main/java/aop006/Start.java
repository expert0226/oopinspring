package aop006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop006.xml", Start.class);
		
		Person romeo = context.getBean("boy", Person.class);
		Person juliet = context.getBean("girl", Person.class);

		romeo.runSomething();
		juliet.runSomething();
	}
}