package encapsulation01.packageOne;

public class ClassAA extends ClassA {	
	void runSomething() {
		//pri = 1;	this.pri = 1;
		def = 1;	this.def = 1;
		pro = 1;	this.pro = 1;
		pub = 1;	this.pub = 1;
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
		//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
		ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	this.pubStatic = 1;
	}
	
	static void runStaticThing() {
		// 객체를 생성하지 않고는 객체 멤버 접근 불가
		//pri = 1;	this.pri = 1;
		//def = 1;	this.def = 1;
		//pro = 1;	this.pro = 1;
		//pub = 1;	this.pub = 1;
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
		//ClassA.priStatic = 1;	priStatic = 1;	//this.priStatic = 1;
		ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
		// 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
		ClassAA caa = new ClassAA();
		//ca.pri = 1;
		caa.def = 1;
		caa.pro = 1;
		caa.pub = 1;
		
		// 객체 참조 변수를 통해 정적 멤버도 접근 가능, 권장하지는 않음
		//ca.priStatic = 1;
		caa.defStatic = 1;
		caa.proStatic = 1;
		caa.pubStatic = 1;
	}
}