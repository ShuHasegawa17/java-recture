package chapter5;

public class Lesson {

	public static void main(String[] args) {
		// メソッド
		hello();

		// メソッドー引数
		// 呼び出し側の引数は実引数、受け取り側の引数は仮引数と呼ぶ
		printSum(10, 20);

		// スコープについて
		String scope = "メソッドで定義した変数はメソッド内のスコープ";
		testScope();

		//　メソッドー戻り値
		String s = getHello();
		System.out.println(s);
		System.out.println("a-bは" + sub(10, 5));

		// オーバーロード
		// シグネチャ（メソッド名、引数の個数と型）が一致しないこと
		overloadMethod();
		overloadMethod(1);
		overloadMethod(1, 2);
		overloadMethod(1L);

		// 配列の参照渡し
		int val = 3;
		intTenTimes(val);
		System.out.println("値渡しはコピー渡し=" + val);
		
		int[] array1 = { 1, 2, 3, 4, 5 };
		arrayTenTimes(array1);
		System.out.println("参照渡しは同じものを指す");
		for(int val1 :array1) {
			System.out.println(val1);
		}

		//　コマンドライン引数
		System.out.println("コマンドライン引数は、");
		for(String arg : args) {
			System.out.println(arg);
		}
		
		// 宿題
		// 引数に渡したint型配列を全て足し、その結果を返す関数「accumlate」を作成する
		// メソッド名：accumlate
		// 引数：int[] 計算対象の数値配列
		// 戻り値 int 計算結果の数値
		int[] intArray = {1,2,3,4,5};
		int ans = Answer.accumlate(intArray);
		System.out.println("配列の総和は、" + ans + " です。");

	}

	private static void hello() {
		System.out.println("hello");
	}

	static void printSum(int a, int b) {
		int ans = a + b;
		System.out.println("合計は" + ans);
	}

	public static void testScope() {
		System.out.println("スコープをまたいだ変数の参照はコンパイルエラー");
		//System.out.println(scope);
	}

	static String getHello() {
		return "Hello!";
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static void overloadMethod() {
		System.out.println("オーバーロード1");
	}

	static void overloadMethod(int a) {
		System.out.println("オーバーロード2");
	}

	static void overloadMethod(int a, int b) {
		System.out.println("オーバーロード3");
	}

	static void overloadMethod(long a) {
		System.out.println("オーバーロード4");
	}

	// NG 戻り値の違いはオーバーロードできない。（コンパイルエラー）
	//	static int overloadMethod() {
	//		System.out.println("オーバーロード5");
	//	}

	static void intTenTimes(int target) {
		target *= 10;
	}

	static void arrayTenTimes(int[] targets) {
		for (int i = 0; i < targets.length; i++) {
			targets[i] *= 10;
		}
		// 拡張for文の場合はコピーを作って設定しているため、参照渡しとならない。
		// そういう意味でも拡張for文のほうが安全。
		// ↓呼び出し元は10倍されない。
		//		for (int target : targets) {
		//		target *= 10;
		//	}
	}

}
