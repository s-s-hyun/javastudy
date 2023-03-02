package quest;

public class hero {
		
		int pow;
		int hp;
		int spe;
		
		public void pow(billan b) {
			b.hp = b.hp - this.pow;
			System.out.println("공격에 성공했습니다.");
			System.out.println(b.hp);
			System.out.println("");
		}
		
		public void hill() {
			this.hp = this.hp + 5;
			System.out.println("체력을 회복했습니다.");
			System.out.println(this.hp);
			System.out.println("");			
		}
		
		public void sleep() {
			this.hp = this.hp + 10;
			System.out.println("숙면을 취해 체력이 회복되었습니다.");
			System.out.println(this.hp);
			System.out.println("");			
		}
}
