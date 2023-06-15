package chapter10;

public class SuperSenshi extends Senshi{

	int mp;

	SuperSenshi(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	@Override
	void attack() {
		System.out.println(this.name + "が60のダメージを与えた。");
	}

	void info() {
		System.out.println("名前：" + this.name + ", HP：" + this.hp + ", MP:" + this.mp);

	}
	
	public void sleep() {
		System.out.println(Human.LIFE -50 + "年眠る");
	}

}
