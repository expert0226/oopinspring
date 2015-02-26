public class B009 {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = todo();

		int result = mfi.runSomething(3);

		System.out.println(result);
	}

	public static MyFunctionalInterface todo() {
		return num -> num * num;
	}
}