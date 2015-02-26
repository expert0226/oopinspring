package expert005;

import javax.annotation.Resource;

public class Car {
	@Resource
	Tire tire;

	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
}