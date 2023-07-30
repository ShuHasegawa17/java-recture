package kadai.dectionary;

import java.util.Arrays;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		List<String> target = Arrays.asList("apple", "banana", "orange");
		Dictionary d =  new Dictionary();
		d.analyze(target);

	}

}
