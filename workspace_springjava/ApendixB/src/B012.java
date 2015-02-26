public class B012 {
	public static void main(String[] args) {
		Integer[] ages = { 20, 25, 18, 27, 30, 21, 17, 19, 34, 28 };

		for (int age : ages) {
			if (age < 20) {
				System.out.format("Age %d!!! Can't enter\n", age);
			}
		}
	}
}