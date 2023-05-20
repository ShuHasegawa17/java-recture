package chapter5;

class Answer {
	/**
	 * 引数の総和を求めるメソッド
	 * @param targets 計算対象の数値配列 
	 * @return 計算結果の総和
	 */
	static int accumlate(int[] targets) {
		int ans = 0;
		for(int target: targets) {
			ans += target;
		}
		return ans;
	}
}
