package aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/aop005/expert.xml");
		
		IPerson romeo = (IPerson)context.getBean("boy");
		IPerson juliet = (IPerson)context.getBean("girl");

		romeo.housework();
		juliet.housework();
	}
}