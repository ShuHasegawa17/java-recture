
public class Loop {

	public static void main(String[] args) {
		
		 
//		try(A a = new A()) {
//			
//		}
		
		String a = "こんにちは"; // new String("")
		String b = "こんにちは"; // a
		String c = new String("こんにちは");
		System.out.println(c);
		if(a == b) {
			System.out.println("a == b");
		}
		if(a.equals("こんにちは")) {
			System.out.println("a == c");
		}
		if(a.equals(c)) {
			System.out.println("a equeals c");
		}
		
			
//		String[] test = { "a", "b" };
//		for(String s : test) {
//			
//		}
//		
//		
//		String[][] array = { { "a", "b" }, { "c", "d", "e" } };
//		// a,b,c,d,e
//		for (String[] tmp : array) {
//			System.out.println(tmp);
//		
//		}
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
////			for (int j = 0; j < array[i].length; j++) {
////				System.out.println(array[i][j]);
////			}
//		}
	}

}
