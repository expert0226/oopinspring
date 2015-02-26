package richSuperClass;

import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		사람 김학생 = new 학생("김학생", new Date(2000, 01, 01), "20000101-1234567",
				"20190001");
		사람 이군인 = new 군인("이군인", new Date(1998, 12, 31), "19981231-1234567",
				"19-12345678");

		System.out.println(김학생.이름);
		System.out.println(이군인.이름);

		System.out.println(김학생.생일);
		System.out.println(이군인.생일);

		System.out.println(김학생.주민등록번호);
		System.out.println(이군인.주민등록번호);

		// System.out.println(김학생.학번); // 사용불가
		// System.out.println(이군인.군번); // 사용불가

		System.out.println(((학생) 김학생).학번);
		// 캐스팅 필요
		System.out.println(((군인) 이군인).군번);
		// 캐스팅 필요

		김학생.먹다();
		이군인.먹다();

		김학생.자다();
		이군인.자다();

		김학생.소개하다();
		이군인.소개하다();

		// 김학생.공부하다(); // 사용불가
		// 이군인.훈련하다(); // 사용불가

		((학생) 김학생).공부하다(); // 캐스팅 필요
		((군인) 이군인).훈련하다(); // 캐스팅 필요
	}
}