package adapterPattern;

public class AdapterServicA {
	ServiceA sa1 = new ServiceA();

	void runService() {
		sa1.runServiceA();
	}
}