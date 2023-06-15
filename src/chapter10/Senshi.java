package chapter10;

public class Senshi implements Human {

	String name;
	int hp;

	Senshi(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attack() {
		System.out.println(this.name + "が30のダメージを与えた");
	}

	public void sleep() {
		System.out.println(Human.LIFE + "年眠る");
	}

}
