package poorSuperClass;

import java.util.Date;

public class 학생 extends 사람 {
	Date 생일;
	String 주민등록번호;
	String 학번;
	
	public 학생(String 이름, Date 생일, String 주민등록번호, String 학번) {
		this.이름 = 이름;
		this.생일 = 생일;
		this.주민등록번호 = 주민등록번호;
		this.학번 = 학번;
	}

	void 자다() {
		System.out.println(이름 + " 취침 중");
	}
	
	void 공부하다() {
		System.out.println(이름 + " 공부 중");
	}
	
	void 소개하다() {
		String msg = "";
		
		msg += "이름: " + 이름;
		msg += "\n생일: " + 생일;
		msg += "\n주민등록번호: " + 주민등록번호;
		msg += "\n학번: " + 학번;
		
		System.out.println(msg);
	}
}