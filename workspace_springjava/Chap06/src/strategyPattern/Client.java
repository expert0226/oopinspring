package strategyPattern;

public class Client {
	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();

		// 총을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new StrategyGun();
		rambo.runContext(strategy);

		System.out.println();

		// 검을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new StrategySword();
		rambo.runContext(strategy);

		System.out.println();

		// 활을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new StrategyBow();
		rambo.runContext(strategy);
	}
}