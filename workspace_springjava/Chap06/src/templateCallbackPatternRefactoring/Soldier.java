package templateCallbackPatternRefactoring;

public class Soldier {
	void runContext(String weaponSound) {
		System.out.println("전투 시작");
		executeWeapon(weaponSound).runStrategy();
		System.out.println("전투 종료");
	}

	private Strategy executeWeapon(final String weaponSound) {
		return new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println(weaponSound);
			}
		};
	}
}