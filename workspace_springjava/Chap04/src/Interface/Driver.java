package Interface;

interface Speakable {
	double PI = 3.14159;
	final double absoluteZeroPoint = -275.15;

	void sayYes();
}

/*
 * interface Speakable { public static double PI = 3.14159; public static final
 * double absoluteZeroPoint = -275.15;
 * 
 * public abstract void sayYes(); }
 */

class Specker implements Speakable {
	public void sayYes() {
		System.out.println("I say NO!!!");
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);

		Specker reporter1 = new Specker();
		reporter1.sayYes();
	}

	public static void test() {
		// 에러: The final field Speakable.PI cannot be assigned
		// Speakable.PI = 3.14;

		// 에러: The final field Speakable.absoluteZeroPoint cannot be assigned
		// Speakable.absoluteZeroPoint = -275.0;
	}
}