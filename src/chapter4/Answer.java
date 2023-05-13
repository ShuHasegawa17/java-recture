package chapter4;

class Answer {
	
	static void displayTwoDimentionArray(int[][] twoDimeArray) {
		System.out.println("Answer-2次元配列の値を表示");
		for(int[] array: twoDimeArray) {
			for(int value: array) {
				System.out.println(value);
			}
		}
		
	}

}
