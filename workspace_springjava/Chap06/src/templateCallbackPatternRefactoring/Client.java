package templateCallbackPatternRefactoring;

public class Client {
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("총! 총초종총 총! 총!");
		
		System.out.println();
		
		rambo.runContext("칼! 카가갈 칼! 칼!");
		
		System.out.println();
		
		rambo.runContext("도끼! 독독..도도독 독끼!");
	}
}