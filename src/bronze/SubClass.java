package bronze;

public class SubClass extends SuperClass {

	public static void main(String[] args) {

		SuperClass s = new SubClass(); // superクラス
		
		SubClass s2 = (SubClass)s; // superクラスを無理やりサブクラスに入れてる
		s2.print();
		
		printTest(s2);
		
		for(int i = 0; i < 5; i++) {
			for(i= 5; i < 10; i++) {
				
			}
		}
		

	}
	
	public static void printTest(SuperClass s) {
		s.print();
		((SubClass)s).print();
	}

}
