package chapter8;

public class Hero {

	public int hp;
	public String name;
	public static final String CLASS_NAME = "勇者";
	
	Hero(int hp, String name) {
		this.hp = hp;
		this.name = name;
	}
	

	/**
	 * Heroクラスです。
	 * @param name 名前
	 */
	Hero(String name) {
		this(100, name);

	}
	
	/**
	 * 攻撃を行う処理
	 */
	public void attack() {
		System.out.println(this.name + "攻撃"+ CLASS_NAME);
	}
	
	public static void info() {
		System.out.println(CLASS_NAME + "は武道家と剣士の熟練度がMAXでなれる。");
	}
	
}
