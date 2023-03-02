package practice;

public class Kim {

	int str;
	int def;
	int bal;
	
	public void defend(Son son) {
		if(this.def > son.shoot) {
			System.out.println("김병지 선수 골을 막아냅니다");
		}else {
			System.out.println("아쉽게 먹혔습니다");
		}
	}
}
