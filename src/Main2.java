import java.util.ArrayList;
import java.util.List;

public class Main2 {

	class X {
		public String toStoString() {
			return "Xです";
		}
	}
	class Y extends X {
		public String toStoString() {
			return "Yです";
		}
	}
	
	public static void method1(List<? extends X> list) {
		System.out.println(list.get(0));
	}
	
	public static void method2(List<? super X> list) {
		System.out.println(list.get(0));
	}
	
	public static void main(String[] args) {
		
		List<X> l1 = new ArrayList<>();
		l1.add(new Main2().new X());
		
		List<Y> l2 = new ArrayList<>();
		l2.add(new Main2().new Y());
		
		method1(l1);
		method1(l2);
		
		method2(l1);
		//method2(l2);
		
	
		


	}

}
