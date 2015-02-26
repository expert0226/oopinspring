package inheritance01;

public class Driver03 {
	public static void main(String[] args) {
		동물[] animals = new 동물[7];

		animals[0] = new 동물();
		animals[1] = new 포유류();
		animals[2] = new 조류();
		animals[3] = new 고래();
		animals[4] = new 박쥐();
		animals[5] = new 참새();
		animals[6] = new 펭귄();

		for (int index = 0; index < animals.length; index++) {
			animals[index].showMe();
		}
	}
}