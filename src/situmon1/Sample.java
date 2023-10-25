package situmon1;

public class Sample implements ISample, ISample2 {
	private void innerMethod(String msg) {
		System.out.println("内部メソッド呼び出し");
		System.out.println(msg);
	}

	public void outerMethod(String msg) {
		System.out.println("外部メソッド呼び出し");
		System.out.println(msg);

		// 同じインスタンスに定義されているメソッドの場合、メソッド名(引数)
		outerMethod("innerMethodを表示");
	}

	void Amethod() {
	};

	@Override
	public void dMethod() {
		// TODO 自動生成されたメソッド・スタブ
		ISample.super.dMethod();
	}

	//	@Override
	//	public void dMethod() {
	//		// TODO 自動生成されたメソッド・スタブ
	//		ISample.super.dMethod();
	//	}
	public static void staticMethod(String msg) {
		System.out.println("staticメソッド呼び出し");
		System.out.println();
	}
}