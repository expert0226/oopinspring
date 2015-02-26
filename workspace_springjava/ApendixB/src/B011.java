public class B011 {
	public static void main(String[] args) {
		Integer[] ages = { 20, 25, 18, 27, 30, 21, 17, 19, 34, 28 };

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < 20) {
				System.out.format("Age %d!!! Can't enter\n", ages[i]);
			}
		}
	}
}