package practice;

public class Son {

	int str;
	int shoot;
	int bal;
	
	public void Shoot(Kim kim) {
		if(this.shoot > kim.def) {
			System.out.println("Goal~!");
//			System.out.println(this.no + "번 s 선수의 득점입니다.");
		} else {
			System.out.println("Wu~!!");
		}
	}
	public void str(Kim a) {
		if(this.str > a.str) {
			System.out.println("부상당했어요 김병지선수");
		} else {
			System.out.println("손흥민 선수 시즌 7번쨰 부상입니다");
		}
	}
}
