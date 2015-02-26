import java.util.Arrays;

public class B013 {
	public static void main(String[] args) {
		Integer[] ages = { 20, 25, 18, 27, 30, 21, 17, 19, 34, 28 };

		Arrays.stream(ages)
				.filter(age -> age < 20)
				.forEach(
						age -> System.out
								.format("Age %d!!! Can't enter\n", age));
	}
}