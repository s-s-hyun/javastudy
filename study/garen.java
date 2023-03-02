package study;

public class garen {
	
	int att;
	int hp;
	int def;
	int simpan;
	
	public void simpan(umi u) {
		u.hp -= this.simpan;
	}
	
	public void att(umi u) {
		u.hp -= this.att;
	}
	
	public void def(umi u) {
		this.hp = (this.def - u.att);
	}
	
	public void hp() {
		this.hp = this.hp;
	}		
}
