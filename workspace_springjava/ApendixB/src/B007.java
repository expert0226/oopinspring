public class B007 {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = a -> a * a;

		doIt(mfi);
	}

	public static void doIt(MyFunctionalInterface mfi) {
		int b = mfi.runSomething(5);

		System.out.println(b);
	}
}