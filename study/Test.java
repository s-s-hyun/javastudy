package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		garen g = new garen();
		umi u = new umi();

		Scanner scanner = new Scanner(System.in);

		g.att = 100;
		g.hp = 500;
		g.def = 80;
		g.simpan = 120;

		u.att = 80;
		u.hp = 380;
		u.def = 60;
		u.hill = 100;

		int a;
		int r;
		while (true) {
			System.out.println("플레이어를 선택 해주세요\n1.가렌\n2.유미");
			r = scanner.nextInt();
			if (r == 1) {
				System.out.println("가렌을 선택했습니다. 가렌으로 무엇을 하시겠습니까");
				a = 1;
				break;
			} else if (r == 2) {
				System.out.println("유미를 선택하였습니다 유미로 무엇을 하시겠습니까");
				a = 2;
				break;
			} else {
				System.out.println("여러 캐릭터를 제작 중입니다 잠시 기다려주시고 다시 선택해주세요.");
			}
		}

		while (true) {
			if (g.hp <= 0) {
				System.out.println("유미 승리!");
				break;
			}
			if (u.hp <= 0) {
				System.out.println("가렌 승리!");
				break;
			}

			String s = scanner.next();

			if (a == 1) {
				if (s.equals("simpan")) {
					g.simpan(u);
					System.out.printf("심판을 사용했습니다 유미의 체력이 %d 남았습니다\n", u.hp);
				} else if (s.equals("att")) {
					g.att(u);
					System.out.printf("기본공격을 사용했습니다 유미의 체력이 %d 남았습니다\n", u.hp);
				} else if (s.contentEquals("def")) {
					g.def(u);
					System.out.printf("유미가 마법을 사용했지만 플레이어의 방아력이 높아 체력이 %d만 감소합니다\n", g.def);
				} else if (s.contentEquals("hp")) {
					g.hp();
					System.out.printf("현재 체력은 %d 입니다\n", g.hp);
				} else {
					System.out.println("커맨드 오류");
				}

			} else if (a == 2) {
				if (s.equals("hill")) {
					u.hill();
					System.out.printf("힐을 사용했습니다.여분의 힐량은 %d만큼의 추가 체력으로 표시됩니다.\n", u.hp);
				} else if (s.equals("att")) {
					u.att(g);
					System.out.printf("기본공격을 사용했습니다 가렌의 체력이 %d 남았습니다\n", g.hp);
				} else if (s.contentEquals("def")) {
					u.def(g);
					System.out.printf("가렌의 물리공격을 방어력으로 일부 감소시켰습니다 체력이 %d 남았습니다\n", u.hp);
				} else if (s.equals("hp")) {
					u.hp();
					System.out.printf("현재 체력은 %d 입니다\n", u.hp);
				} else {
					System.out.println("커맨드 오류");
				}
			}
		}

	}
}
