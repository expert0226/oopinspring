public class B002 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Rambda 2!!!");
			}
		};

		r.run();
	}
}