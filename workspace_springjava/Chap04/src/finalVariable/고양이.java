package finalVariable;

public class 고양이 {
	final static int 정적상수1 = 1;
	final static int 정적상수2;

	final int 객체상수1 = 1;
	final int 객체상수2;

	static {
		정적상수2 = 2;

		// 상수는 한번 초기화 되면 값을 변경할 수 없다.
		// 정적상수2 = 4;
	}

	고양이() {
		객체상수2 = 2;

		// 상수는 한번 초기화 되면 값을 변경할 수 없다.
		// 객체상수2 = 4;

		final int 지역상수1 = 1;
		final int 지역상수2;

		지역상수2 = 2;
	}
}