package chapter4;

public class Lesson {

	public static void main(String[] args) {
		
		// 配列の生成〜代入
		int[] scores = new int[5];
		scores[2] = 10;
		System.out.println("scores:" + scores[2]);
		System.out.println("配列の長さは" + scores.length);

		// 配列の生成+初期化
		int[] scores1 = new int[] { 10, 20, 30, 40, 50 };
		int[] scores2 = { 60, 70, 80, 90, 100 };
		System.out.println("scores1:" + scores1[3]);
		System.out.println("scores2:" + scores2[4]);

		// 配列の一覧表示(拡張for文）
		System.out.println("配列の中身を表示");
		for (int score : scores1) {
			System.out.println(score);
		}

		// 実行時例外
		//scores1[6] = 10;
		//scores2 = null;
		//scores2[0] = 10;
		
		// 多次元配列の生成〜代入
		int[][] twoDimeScores = new int[2][3];
		twoDimeScores[1][2] = 20;
		
		System.out.println("twoDimeScoresの長さ");
		System.out.println(twoDimeScores.length);
		System.out.println(twoDimeScores[1].length);
		
		// 多次元配列の生成+初期化
		int[][] twoDimeScores2 = {{10,20,30},{40,50,60}};
		System.out.println("twoDimeScoresの長さ");
		System.out.println(twoDimeScores2.length);
		System.out.println(twoDimeScores2[0].length);
		System.out.println(twoDimeScores2[1].length);
		
		// 宿題ー2次元配列の一覧を拡張for文を利用して表示する
		Answer.displayTwoDimentionArray(twoDimeScores2);

	}

}
