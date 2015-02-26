package adapterPattern;

public class ClientWithNoAdapter {
	public static void main(String[] args) {
		ServiceA sa1 = new ServiceA();
		ServiceB sb1 = new ServiceB();

		sa1.runServiceA();
		sb1.runServiceB();
	}
}