package decoratorPattern;

public class ClientWithDecolator  {
	public static void main(String[] args) {
		IService decoreator = new Decoreator();
	 	System.out.println(decoreator.runSomething());
	}
}