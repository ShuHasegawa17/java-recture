package chapter3;

import java.util.Scanner;

class Answer {
	
	static void accumulation() {
		
		while(true) {
			System.out.println("数値を入力してください");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			if(num < 1 || num > 10) {
				System.out.println("1〜10の間の数を入力してください。");
				continue;
			}
			int ans = 1;
			for(int i =0; i < num; i++) {
				ans *=(i+1);
			}
			System.out.println("階乗結果は"+ ans + "です。");
			scanner.close();
			break;

		}
		
	}
}
