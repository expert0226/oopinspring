import java.util.function.Supplier;

public class B016 {
	public static void main(String[] arg) {
		B016 b016_1 = new B016();

		// Error:
		// The target type of this expression must be a functional interface
		// B016 b016_2 = B016::new;

		// Supplier<B016> factory = () -> new B016();
		Supplier<B016> factory = B016::new;

		B016 b016_3 = factory.get();
		B016 b016_4 = factory.get();

		System.out.println(b016_1.hashCode());
		System.out.println(b016_3.hashCode());
		System.out.println(b016_4.hashCode());
	}
}