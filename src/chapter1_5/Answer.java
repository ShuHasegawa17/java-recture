package chapter1_5;

public class Answer {

	// |5|最大値or最小値|{5,3,10,2,8}の配列, 真偽値|minMax|真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する|
	public static void main(String[] args) {

		int[] list = { 5, 3, 10, 2, 8 };
		int minValue = minMax(list, true);
		System.out.println(minValue);
		int maxValue = minMax(list, false);
		System.out.println(maxValue);

	}

	static int minMax(int[] list, boolean isMin) {
		int result = list[0]; // 5

		for (int num : list) { // 5,3,10,2,8 
			// 今の値（result）とループの値比較して、今の値 > ループ値
			if ((isMin && result > num) || (!isMin && (result < num))) {
				result = num;
			}
			//			if (isMin) {
			//				if (result > num) {
			//					result = num;
			//				}
			//			} else {
			//				if (result < num) {
			//					result = num;
			//				}
			//			}

		}
		return result;
	}

}
