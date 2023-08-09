package kadai.sosuu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sosuu {
	
	public static boolean[] hitSosuu2() {
		boolean[] array = new boolean[100];
		for(int i=0; i< array.length; i++) {
			array[i] = true;
		}
		for(int i=1; i <= array.length; i++) {
			if(i == 1) {
				array[i-1] = false;
				continue;
			}
			
			for(int j = 1; j <i; j++) {
				if(j == 1) continue;
				if (i % j == 0) {
					array[i-1] = false;
					break;
				}
			}
		}
		return array;
	}
	public static List<Number> hitSosuu() {
		// 1〜100の配列
		int[] int100 = new int[100];
		for(int i=1; i<= int100.length; i++) {
			int100[i-1] = i;
		}		
		List<Number> result = new ArrayList<>();
		
		for(int num: int100) {

			if(num == 1) continue;
			
			// 例）５の場合→1,2,3,4までループする
			boolean isSosuu = true;
			for(int i = 1; i < num; i++ ) {
				// 自分の数と１以外で割り切れないものが素数
				// 割り切れてしまったら素数ではない
				if(i == 1) continue;
				if(num % i == 0) {
					isSosuu = false;
					break;
				}
			}
			if(isSosuu) result.add(num);
		}
		return result;
	}

	public static void main(String[] args) {
		List<Number> hits = hitSosuu();
		System.out.println(Arrays.asList(hits));
		
		boolean[] hits2 = hitSosuu2();
		for(int i =0; i < hits2.length; i++) {
			if(hits2[i]) {
				System.out.print(i +1 + ",");				
			}

		}
	}

}
