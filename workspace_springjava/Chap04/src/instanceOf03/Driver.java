package instanceOf03;

interface 날수있는 {

}

class 박쥐 implements 날수있는 {

}

class 참새 implements 날수있는 {

}

public class Driver {
	public static void main(String[] args) {
		날수있는 박쥐객체 = new 박쥐();
		날수있는 참새객체 = new 참새();

		System.out.println(박쥐객체 instanceof 날수있는);
		System.out.println(박쥐객체 instanceof 박쥐);

		System.out.println(참새객체 instanceof 날수있는);
		System.out.println(참새객체 instanceof 참새);
	}
}