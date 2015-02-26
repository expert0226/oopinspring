package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/expert003/expert003.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("expert003.xml", Driver.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");

		//Car car = (Car)context.getBean("car");
		Car car = context.getBean("car", Car.class);

		System.out.println(car.getTireBrand());
	}
}