package This;

class 펭귄 {
	int var = 10;

	void test() {
		int var = 20;

		System.out.println(var);
		System.out.println(this.var);
	}
}

public class Driver {
	public static void main(String[] args) {
		펭귄 뽀로로 = new 펭귄();
		뽀로로.test();
	}
}