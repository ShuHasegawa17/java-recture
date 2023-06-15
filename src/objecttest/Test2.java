package objecttest;

public class Test2 {

	String name;
//	Test2(String name) {
//		this.name = name;
//	}
	void printName() {
		System.out.println("名前は" + this.name);
	}
}


class Main2 {
	public static void main(String[]args) {
		// インスタンスを作成し、インスタンスフィールドに初期値を設定
		Test2 t1 = new Test2();
		t1.name = "みなと";
		
		// インスタンスを作成したが、インスタンスフィールドの初期値設定を忘れた。
		Test2 t2 = new Test2();
		
		t1.printName(); // 名前はミナトです
		t2.printName(); // 名前はNULLです　→初期値がないため名前が表示できない	
	}
}
