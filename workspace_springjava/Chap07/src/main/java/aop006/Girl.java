package aop006;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Person {
	public void runSomething() {
		System.out.println("요리를 한다.");
	}
}