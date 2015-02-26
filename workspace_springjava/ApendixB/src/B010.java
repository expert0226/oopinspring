import java.util.function.*;

public class B010 {
	public static void main(String[] args) {
		Runnable run = () -> System.out.println("hello");
		Supplier<Integer> sup = () -> 3 * 3;
		Consumer<Integer> con = num -> System.out.println(num);
		Function<Integer, String> fun = num -> "input: " + num;
		Predicate<Integer> pre = num -> num > 10;
		UnaryOperator<Integer> uOp = num -> num * num;

		BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str + num);
		BiFunction<Integer, Integer, String> bFun = 
				(num1, num2) -> "add result: " + (num1 + num2);
		BiPredicate<Integer, Integer> bPre = (num1, num2) -> num1 > num2;
		BinaryOperator<Integer> bOp = (num1, num2) -> num1 - num2;
	}
}