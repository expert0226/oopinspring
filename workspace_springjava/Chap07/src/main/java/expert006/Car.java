package expert006;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Resource(name = "tire1")
	// @Autowired
	// @Qualifier("tire2")
	Tire tire;

	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
}