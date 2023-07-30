package kadai.dectionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
	
	private Map<String, String> dictionary = new HashMap<>();
	
	public Dictionary() {
		dictionary.put("apple", "りんご");
		dictionary.put("banana", "ばなな");
		dictionary.put("peach", "桃");
	}
	
	public void analyze(List<String> target) {
		for(String key : target) {
			String value = dictionary.get(key);
			if(value != null) {
				System.out.println(key + "の意味は" + value + "です。");
			} else {
				System.out.println(key + "は辞書に存在しない");
			}
		}
	}
}
