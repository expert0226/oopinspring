import java.util.Arrays;
import java.util.function.BiFunction;

public class B015 {
	public static void main(String[] args) {
		Double[] nums = { 1.0, 4.0, 9.0, 16.0, 25.0 };

		System.out.println("=== Rambda ===");
		Arrays.stream(nums)
			.map(num -> Math.sqrt(num))
			.forEach(sqrtNum -> System.out.println(sqrtNum));

		System.out.println("=== Method Reference ===");
		Arrays.stream(nums)
			.map(Math::sqrt)
			.forEach(System.out::println);

		BiFunction<Integer, Integer, Integer> bip_rambda 
			= (a, b) -> a.compareTo(b);
		BiFunction<Integer, Integer, Integer> bip_method_reference 
			= Integer::compareTo;

		System.out.println(bip_rambda.apply(10, 12));
		System.out.println(bip_rambda.apply(10, 10));
		System.out.println(bip_rambda.apply(10, 2));
		System.out.println(bip_method_reference.apply(10, 12));
		System.out.println(bip_method_reference.apply(10, 10));
		System.out.println(bip_method_reference.apply(10, 2));
	}
}