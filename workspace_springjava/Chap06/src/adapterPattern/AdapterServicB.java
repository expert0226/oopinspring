package adapterPattern;

public class AdapterServicB {
	ServiceB sb1 = new ServiceB();

	void runService() {
		sb1.runServiceB();
	}
}