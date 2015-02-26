package singletonPattern;

public class Client {
	public static void main(String[] args) {
		// private 생성자임으로 new 할 수 없다.
		// Singleton s = new Singleton();

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		s1 = null;
		s2 = null;
		s3 = null;
	}
}