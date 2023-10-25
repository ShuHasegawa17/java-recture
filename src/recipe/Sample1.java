package recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		// 金額
		List<Integer> recipes = new ArrayList<Integer>(
				Arrays.asList(100, 150, 200, 250, 300, 350, 400, 500, 600, 700, 800, 900, 1000));
		// Collections.shuffle(recipes);
		int max = 3000;
		int min = 2800;
		int cnt = 5;
		int roopLimit = 10000;
		int roopCnt = 0;
		List<Integer> recipeList = new ArrayList<Integer>();
		while(roopCnt < roopLimit) {
			Collections.shuffle(recipes);
			List<Integer> result =  recipes.subList(0, cnt-1);
		
			int sum = result.stream().reduce((accum, val)-> accum + val).orElse(0);
			if(sum >= min && sum <= max) {
				recipeList = result;
				break;
			}
			
			roopCnt++;
		}
		// 結果
		for(int i: recipeList) {
			System.out.print(i + " ");
		}
		int total = recipeList.stream().reduce((accum, val)-> accum + val).orElse(0);
		System.out.println("");
		System.out.println(total);

	}

}
