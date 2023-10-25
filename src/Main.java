import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main implements A, B {
	@Override
	public String toString2() {
		B.super.toString2();
		return "aaa";
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.name = "child";
		System.out.println(c.getName());
		
		List<String> list = new ArrayList<>(Arrays.asList("abc", "acddddd", "bcbbb", "cd", "de"));
		list.stream() //Streamを生成する
			.filter(param -> true)//param.startsWith("a")) //絞り込みの中間処理を行う
			.sorted((a,b)-> a.length() - b.length())
			.map(a -> a.charAt(0))
			.forEach(val->System.out.println(val)); //結果取得の終端処理を行う

	}

}
