package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/expert003/expert.xml");
		Car car = (Car)context.getBean("car");

		System.out.println(car.getTireBrand());
	}
}