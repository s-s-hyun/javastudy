package study;

public class umi {

	int att;
	int hp;
	int def;
	int hill;
	
	public void hill() {
		this.hp += this.hill;
	}
		
	public void att(garen g) {
		g.hp -= this.att;
	}
	
	public void def(garen g) {
		this.hp = (this.def - g.att);
	}
	
	public void hp() {
		this.hp = this.hp;
	}
		
}
