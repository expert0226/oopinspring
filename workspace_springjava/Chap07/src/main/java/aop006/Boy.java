package aop006;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person {
	public void runSomething() {
		System.out.println("컴퓨터로 게임을 한다.");
	}
}
