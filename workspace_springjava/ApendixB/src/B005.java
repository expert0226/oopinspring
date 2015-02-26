public class B005 {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = (int a) -> {
			return a * a;
		};

		int b = mfi.runSomething(5);

		System.out.println(b);
	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	public abstract int runSomething(int count);
}