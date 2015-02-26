public class B006 {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = a -> a * a;

		int b = mfi.runSomething(5);

		System.out.println(b);
	}
}