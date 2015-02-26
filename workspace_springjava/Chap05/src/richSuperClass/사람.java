package richSuperClass;

import java.util.Date;

public abstract class 사람 {
	String 이름;
	Date 생일;
	String 주민등록번호;
	
	void 먹다() {
		System.out.println(이름 + " 식사 중");
	}

	void 자다() {
		System.out.println(이름 + " 취침 중");
	}

	abstract void 소개하다();
}