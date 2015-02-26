package decoratorPattern;

public class ClientWithNoDecolator {
	public static void main(String[] args) {
		Service service = new Service();
	 	System.out.println(service.runSomething());
	}
}