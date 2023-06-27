package objecttest;

public class Test {
	static String name = "ミナト";
}

class Main {
	public static void main(String[]args) {
		Test t1 = new Test();
		Test t2 = new Test();
		// クラスフィールドはインスタンス共通の値
		System.out.println(t1.name); // ミナト
		System.out.println(t2.name); // ミナト
		// クラスフィールドの値を変えると全てのインスタンスに影響する。
		t1.name = "たかし";
		System.out.println(t1.name); // たかし
		System.out.println(t2.name); // たかし
		// ※本来クラスフィールドのアクセスはクラス名でアクセスする。(Test.name)
		// 説明のため、インスタンスでアクセスしている。
		
//		Car c = new Car();
//		c.run();
		//c.enging();
	}
}