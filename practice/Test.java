package practice;

import java.util.Scanner;

public class Test {
	
	 public static void main(String[] args) {
		 
		 Son s = new Son();
		 Kim k = new Kim();
		 Judge j = new Judge();
		 
		 System.out.println("Son의 슈팅능력은? (shoot)");
		 Scanner scanner = new Scanner(System.in);
		 int shoot = scanner.nextInt();
		 s.shoot = shoot;
		 
		 System.out.println("Son의 힘은? (str)");
		 int p = scanner.nextInt();
		 s.str = p;
		 
		 System.out.println("Son의 밸러스는? (bal)");
		 int b = scanner.nextInt();
		 s.bal = b;
		 System.out.println("현재 Son의 능력치는 \n슈팅능력 : " + s.shoot + "\n힘 : " + s.str + "\n밸런스 : " + s.bal);
	
		 System.out.println();
		 System.out.println("Kim의 선방능력은? (def)");
		 int def = scanner.nextInt();
		 k.def = def;
		 
		 System.out.println("Kim의 힘은? (str)");
		 int p1 = scanner.nextInt();
		 k.str = p1;
		 
		 System.out.println("Kim의 밸러스는? (bal)");
		 int b1 = scanner.nextInt();
		 k.bal = b1;
		 System.out.println("현재 Kim의 능력치는\n선방능력 : " + k.def + "\n힘 : " + k.str + "\n밸런스 : " + k.bal);
		 
		 System.out.println();
		 
//		 k.defend(s);
//		 s.Shoot(k);
		 
//		 j.define(k,s);
		
		 s.str(k);
	} 
}
