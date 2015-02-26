package aop001;

public class Boy {
	public void housework() {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
		
		try {
			System.out.println("컴퓨터로 게임을 한다.");
		} catch (Exception ex) {
			if(ex.getMessage().equals("집에 불남")) {
				System.out.println("119 에 신고한다.");
			}			
		} finally {
			System.out.println("소등하고 잔다.");
		}
		
		System.out.println("자물쇠를 잠그고 집을 나선다.");
	}
}
