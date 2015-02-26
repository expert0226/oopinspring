package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/expert002/expert.xml");
		Tire tire = (Tire)context.getBean("tire");
		Car car = (Car)context.getBean("car");
		car.setTire(tire);

		System.out.println(car.getTireBrand());
	}
}