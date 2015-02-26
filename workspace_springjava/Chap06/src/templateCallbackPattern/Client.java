package templateCallbackPattern;

public class Client {
	public static void main(String[] args) {
		Soldier rambo = new Soldier();

		/*
		 * Strategy strategy = new StrategyGun();
		 * rambo.runContext(strategy);
		 */

		/*
		 * Strategy strategy = new IStrategy() {
		 * 
		 * @Override public void doStrategy() {
		 * System.out.println("총! 총초종총 총! 총!"); } };
		 * 
		 * rambo.runContext(strategy);
		 */

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("총! 총초종총 총! 총!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("칼! 카가갈 칼! 칼!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("도끼! 독독..도도독 독끼!");
			}
		});
	}
}