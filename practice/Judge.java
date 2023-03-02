package practice;

public class Judge {
	
	int no;
	int bal;
	
	public void define(Kim kim, Son son) {
		if(kim.bal == son.bal) {
			System.out.println("심판 : Continue!");
		} else if (kim.bal > son.bal) {
			System.out.println("심판 : kim선수 반칙! 엘로우카드!!");
		} else {
			System.out.println("심판 : son선수 반칙! 레드카드!!");
		}
	}
}
