package chapter3;

import java.util.Random;

public class Lesson {

	public static void main(String[] args) {

		// if文
		int height = new Random().nextInt(40) + 140;
		System.out.println("身長は、" + height + "cm");
		if (height >= 170) {
			System.out.println("サイズはL");
		} else if (height >= 160) {
			System.out.println("サイズはM");
		} else if (height >= 150) {
			System.out.println("サイズはM");
		} else {
			System.out.println("サイズはその他");
		}

		// switch文
		int fortune = new Random().nextInt(5) + 1;
		System.out.println("fourtunは、" + fortune);
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("中吉");
			break;
		default:
			System.out.println("凶");
		}

		// while
		boolean loop = false;
		while (loop) {
			System.out.println("while");
		}
		do {
			System.out.println("do while");
		} while (loop);

		// for文
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "回目のループ");
		}

		// continue文
		int randNum = new Random().nextInt(10) + 10;
		System.out.println("ランダムな値、" + randNum);
		for (int i = 1; i <= randNum; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("奇数の値、" + i);
		}

		// 宿題ー階乗計算
		//		1. 「数値を入力してください。　」とコンソールに表示する
		//		2. 数値を入力させる　（　new java.util.Scanner(System.in).nextInt() を利用する）
		//		3. 数値が1〜10以外の場合はコンソールに「1〜10の間の数を入力してください。」を表示し、1に戻る。
		//		4.数値が1〜10の間の場合に、以下の処理を実施する。
		//		5. 入力した数値の数だけ繰り返し処理を行い、階乗結果を変数に代入する
		//		　　（例：5を入力　→　5　 * 4 * 3 * 2 * 1 の結果）
		//		6.　結果の変数をコンソールに表示する。
		Answer.accumulation();

	}

}
