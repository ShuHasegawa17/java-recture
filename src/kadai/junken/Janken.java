package kadai.junken;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Janken {
	public Map<String, String> jankenMap = new HashMap<>();

	public Janken() {
		jankenMap.put("r", "グー");
		jankenMap.put("s", "チョキ");
		jankenMap.put("p", "パー");
	}

	public String getMyChoice() {

		String result = null;
		System.out.println("じゃんけんを入力してください。");
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				try {
					result = sc.nextLine();
					if (result.equals("r") || result.equals( "s") || result.equals("p")) {
						break;
					}
					System.out.println("r,s,pを入力kしてください。");
				} catch (NoSuchElementException e) {
					System.err.println(e);
					System.out.println("r,s,pを入力kしてください。");
					continue;
				}

			}
		}

		return result;
	}

	private String getRandom() {
		String[] junkenArray = { "r", "s", "p" };
		int randVal = (int) Math.floor(Math.random() * 3);
		return junkenArray[randVal];
	}

	public void playGame(String key) {
		String randVal = getRandom();

		System.out.println("自分は" + jankenMap.get(key) + ",相手は" + jankenMap.get(randVal));
		
		if (key.equals(randVal)) {
			System.out.println("あいこです");
		} else if ((key.equals("r") && randVal.equals("s")) || (key.equals("s") && randVal.equals("p"))
				|| (key.equals("p") && randVal.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("相手の勝ちです");
		}

	}
}
