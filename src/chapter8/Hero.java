package chapter8;

public class Hero {

	public int hp;
	public String name;
	
	Hero(int hp, String name) {
		this.hp = hp;
		this.name = name;
	}
	
	Hero(String name) {
		this(100, name);

	}
	
	public void attack() {
		System.out.println(this.name + "攻撃");
	}
	
}
