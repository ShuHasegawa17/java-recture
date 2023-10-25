package recipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recipe {

	public static void main(String[] args) {
		// 金額
		List<Integer> recipes = new ArrayList<Integer>(
				Arrays.asList(100, 150, 200, 250, 300, 350, 400, 500, 600, 700, 800, 900, 1000));
		//Collections.shuffle(recipes);
		int max = 3000;
		int min = 2800;
		int cnt = 3;
		List<List<Integer>> results = new ArrayList<>();
		
		Recipe r = new Recipe();
		results = r.calcRecipe(0, recipes, new ArrayList<Integer>(), results);
		for(List<Integer> result: results) {
			for(Integer i: result) {
				System.out.print(i + " ");				
			}
			System.out.println("aa");
		}

	}
	
	private  List<List<Integer>> calcRecipe(int cnt, List<Integer> target, List<Integer> sub, List<List<Integer>> result) {
	
		//List<Integer> newTarget = new ArrayList<Integer>(target);
		if(cnt == 3) {
			return result;
		}
		for(int i = 0; i < target.size(); i++) {
			int val = target.remove(i);
			sub.add(val);
			if(sub.size() == 3) {
				System.out.println("サイズ" + sub.size());
				result.add(sub);
				//return result;
				sub = new ArrayList<Integer>();											
			} else {
				calcRecipe(++cnt, target, sub, result);	
			}
		}
		
		return result;
	}
	

	private List<Integer> calcRecipe(int max, int min, int cnt, List<Integer> target, List<Integer> result) {
		if (cnt == 0) {
			return new ArrayList<Integer>();
		}

		int sum = result.stream().reduce((accum, value) -> accum + value).orElse(0);
		if (max <= sum && max >= min &&cnt == 0) {
			return result;
		}
		
		List<Integer> newTarget = new ArrayList<Integer>();
		Collections.copy(newTarget, target);
		for(int i = 0; i < target.size(); i ++) {
			int val = newTarget.remove(i);
			if(val + sum <= max) {
				result.add(val);
				break;
			}
		}
		

		return result;

	}

}
