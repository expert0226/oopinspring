package abstraction02;

public class MouseDriver {
	public static void main(String[] args) {
		// 클래스명.countOfTail
		Mouse.countOfTail = 1;

		Mouse mickey = new Mouse();
		Mouse jerry = new Mouse();
		Mouse mightyMouse = new Mouse();

		// 객체명.countOfTail
		System.out.println(mickey.countOfTail);
		System.out.println(jerry.countOfTail);
		System.out.println(mightyMouse.countOfTail);

		// 클래스명.countOfTail
		System.out.println(Mouse.countOfTail);
	}
}