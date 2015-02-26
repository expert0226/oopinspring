package poorSuperClass;

import java.util.Date;

public class 군인 extends 사람 {
	Date 생일;
	String 주민등록번호;
	String 군번;
	
	public 군인(String 이름, Date 생일, String 주민등록번호, String 군번) {
		this.이름 = 이름;
		this.생일 = 생일;
		this.주민등록번호 = 주민등록번호;
		this.군번 = 군번;
	}
	
	void 자다() {
		System.out.println(이름 + " 취침 중");
	}
	
	void 훈련하다() {
		System.out.println(이름 + " 훈련 중");
	}
	
	void 소개하다() {
		String msg = "";
		
		msg += "이름: " + 이름;
		msg += "\n생일: " + 생일;
		msg += "\n주민등록번호: " + 주민등록번호;
		msg += "\n군번: " + 군번;
		
		System.out.println(msg);
	}
}