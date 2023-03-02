package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
		 garen g = new garen();
		 umi u = new umi();
		 Scanner scanner = new Scanner(System.in);

//		 List<String> names = new ArrayList<String>();
		
		 
		
		 g.att = 50;
		 g.hp = 200;
		 g.def = 100;
		 g.simpan = 70;
		 
		 
		 u.abi = 30;
		 u.hp = 170;
		 u.def = 50;
		 u.hill = 70;
		 
		 int r = 0;
		
		 g.garen();
		 u.umi();
		 int a;
		 
		 while(true) {
			 System.out.println("플레이어를 선택 해주세요");
			 r = scanner.nextInt();
			 if(r == 1) {
				 System.out.println("가렌을 선택했습니다. 가렌으로 무엇을 하시겠습니까");
				 break;
			 }else if(r == 2) {
				 System.out.println("유미를 선택하였습니다 유미로 무엇을 하시겠습니까");
				 break;
			 }else {
				 System.out.println("다시 선택하세요.");
			 }
		 }
			 
	
		 while(true) {
			 String s = scanner.next();
			 if(s.equals("simpan")) {
				 System.out.printf("심판을 사용했습니다 유미의 체력이 %d 남았습니다", g.simpan);
				 }
			 if(s.equals("att")) {
				 System.out.printf("기본공격을 사용했습니다 유미의 체력이 %d 남았습니다", g.att);
				 
				 }
				 
				 if(s.contentEquals("def")) {
				 System.out.printf("유미가 마법을 사용했지만 플레이어의 방아력이 높아 체력이 %d만 감소합니다", g.def);	
				 }
				 
				 if(s.contentEquals("hp")) {
				 System.out.printf("방어력의 한계치가 다달아 체력이 %d만큼 감소합니다.", g.hp);
				 }
				 System.out.println();
				 
				 if(s.equals("hill") ) {
					 System.out.printf("힐을 사용했습니다.여분의 힐량은 %d만큼의 추가 체력으로 표시됩니다.", u.hill);
					 }
				 if(s.equals("abi")) {
					 System.out.printf("기본공격을 사용했습니다 가렌의 체력이 %d 남았습니다", u.abi);
					 }
				 
		 }

		 

	    
		 }
		 
	 

//		 System.out.print("방어력이 크게 감소합니다    ");
//		 System.out.println(u.def);
//		 System.out.print("hp가 줄어듭니다.");
//		 System.out.println(u.hp);
//		 
		
		 
	 }


