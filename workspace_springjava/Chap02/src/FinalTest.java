public class FinalTest {
	// const int c; // 자바에서 const, goto 는 키워드 이나 쓸 수는 없음

	final int f;
	static final int sf; 
	final static int fs;
	
	static {
		// f = 10; // 당연히 오류
		sf = 55;
		fs = 55;
	}
	
	FinalTest(int k) {
		f = k;
		// sf = k; // 오류
	}
}