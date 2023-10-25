import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operaion {
	
	public int add(int i, int i2) {
		int sum = i + i2;
		return sum;
	}
	public static void main(String[] args) {
//		long i = 1;
//		int in = (int)1L;
		
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("b");
		l.add("c");
	
		l.stream()
			.map(m-> m.concat("AAA"))
			.filter(m -> m.startsWith("b"))
			.forEach( s -> System.out.println(s));
		
		

//[ 0[2], 1[5]	]	

		//		0 → [2] 
//		1 →　[5]
		
		
		
//		00 97
//		01 98
//		10 99
//		11 100
//		for(String s: l) {
//			System.out.println(s);
//		}
//		
//		
//		
//		String[] s =null;
//		String[] s1 = {"a","b"};
//		
//		for(long i = 1,  j = 2; i < 5; i++) {
//			
//		}
//		
//		FileInputStream is = null;
//		try {
//			is = new FileInputStream("sample.txt");
//			throw new FileNotFoundException();
//
//		} catch (Exception e) {
//			System.out.println("A");
//		} finally {
//			if (is != null) {
//				// is.closeも例外をスローするため、try-catchが必要です。
//				try {
//					is.close();
//				} catch (IOException e) {
//				}
//			}
//			System.out.println("B");
//		}
	}
}
