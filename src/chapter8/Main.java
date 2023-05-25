package chapter8;

public class Main {

	public static void main(String[] args) {

		//宿題
		// Squareクラスを作成する
		//	1. コンストラクタ
		//		・引数：高さと幅を受け取る。（int型）
		// 	2. クラスメソッド：info
		//		・引数：なし
		//		・戻り値：なし
		//		・処理内容：「このクラスは、面積を求めるクラスです。」を出力する
		//	3. インスタンスメソッド：area
		//		・引数：なし
		//		・戻り値：int
		//		・処理内容：コンストラクタ引数で設定した高さと幅から、四角形の面積を返却するする。
		// 上記で作成したクラスを複数インスタンス化し、各種メソッドを実行する。
		Square s1 = new Square(10, 15);
		Square s2 = new Square(5, 10);
		
		Square.info();
		s1.info();
		s2.info();
		
		int s1Area = s1.area();
		int s2Area = s2.area();
		System.out.println("s1の面積は、" + s1Area);
		System.out.println("s2の面積は、" + s2Area);
		
	}

}
