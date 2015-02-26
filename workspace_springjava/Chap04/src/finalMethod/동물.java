package finalMethod;

public class 동물 {
	final void 숨쉬다() {
		System.out.println("호흡 중");
	}
}

class 포유류 extends 동물 {
	// 에러 발생: Cannot override the final method from 동물
	/*
	 * void 숨쉬다() { System.out.println("호흡 중"); }
	 */
}