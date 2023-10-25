package situmon1;

public class Operation {
	public static void main(String[] args) {
		Sample s = new Sample();
		// インスタンスに定義されているメソッドの場合は、変数.メソッド名(引数)
		s.outerMethod("outerMethodを表示");
		
		// staticなメソッドの場合、クラス名.メソッド名(引数)
		Sample.staticMethod("staticMethodを表示");
		// 非推奨だが変数名での呼び出しもできる
		s.staticMethod("非推奨呼び出し");	
		s.dMethod();
	}
}
