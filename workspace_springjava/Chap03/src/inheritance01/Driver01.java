package inheritance01;

public class Driver01 {
	public static void main(String[] args) {
		동물 animal = new 동물();
		포유류 mammalia = new 포유류();
		조류 bird = new 조류();
		고래 whale = new 고래();
		박쥐 bat = new 박쥐();
		참새 sparrow = new 참새();
		펭귄 penguin = new 펭귄();

		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
	}
}