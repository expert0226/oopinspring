package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/expert002/expert002.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("expert002.xml", Driver.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("expert002/expert002.xml");

		// Car car = (Car)context.getBean("car");
		Car car = context.getBean("car", Car.class);

		// Tire tire = (Tire)context.getBean("tire");
		Tire tire = context.getBean("tire", Tire.class);

		car.setTire(tire);

		System.out.println(car.getTireBrand());
	}
}