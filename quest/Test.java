package quest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		hero h = new hero();
		billan b = new billan();
		
		h.pow = 100;
		h.hp = 350;
		h.spe = 150;
		
		b.pow = 90;
		b.hp = 360;
		b.spe = 155;
		b.lev = 1;
		
		while(true) {
			System.out.println("[명령 목록]\n1. 공격\n2. 힐\n3. 잠\n4. 종료\n(숫자로 입력)");
			Scanner scanner = new Scanner(System.in);
			int sel = scanner.nextInt();
			if(sel == 1) {
				h.pow(b);
			} else if (sel == 2) {
				h.hill();
			} else if (sel == 3) {
				h.sleep();
			} else if (sel == 4) {
				System.out.println("시스템이 종료 되었습니다.");
				break;
			} else {
				System.out.println("다른 값을 입력해주세요.\n");
			}
		}
	}

}
