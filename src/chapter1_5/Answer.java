package chapter1_5;

import java.util.Random;

public class Answer {

	// |5|最大値or最小値|{5,3,10,2,8}の配列, 真偽値|minMax|真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する|
	public static void main(String[] args) {

		int[][] result = {{1,2,3},{4,5,6}};
		//printTwoDimention(result);
//		int[] list = { 5, 3, 10, 2, 8 };
//		int minValue = minMax(list, true);
//		System.out.println(minValue);
//		int maxValue = minMax(list, false);
//		System.out.println(maxValue);
		
		int[] arry = {1,2,3,4,5};
		int[] arry2 = twoTimesCopyArray(arry);
		
		for(int a : arry2) {
			System.out.println(a);
		}
		
		for(int a : arry) {
			System.out.println(a);
		}


	}
	
	public static int randomHit() {
		int result;
		while (true) {
			result = new Random().nextInt(51) + 1;
			if (result % 7 == 0) {
				break;
			}
		}
		return result;
	}
	
	static void printTwoDimention(int[][] result) {
//		int[] result = {1,2,3};
//		int[][] result = {{1,2,3},{4,5,6}};
		for(int[] r: result) {
			for(int r2: r) {
				System.out.println(r2);
			}
		}
		
	}
	static int[] twoTimesCopyArray(int[] source) {
		int[] dest = new int[source.length];
		for(int i = 0; i < source.length; i++) {
			dest[i] = source[i] * 2;
		}
		return dest;
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
