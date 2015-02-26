public class B003 {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Hello Rambda 3!!!");
		};

		r.run();
	}
}