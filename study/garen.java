package study;

public class garen {
	
	static int att;
	static int hp;
	static int def;
	static int simpan;
	
	public void garen() {
		this.simpan = hp - 70;
		this.att = hp - 50;
		this.def -= 30;
		this.hp = hp - def - att;
	}

	

	public garen() {
		// TODO Auto-generated method stub
		
	}
}

