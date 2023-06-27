package chapter13.sub;

import chapter13.Human;

public class Operation {
	
	public static void main(String[] args) {
		Human h = new Human("みなと", 25); // インスタンス1
		h.info();
//		h.setAge(80);
		h.info();
		System.out.println(h.getName());

		Human h2 = new Human("あゆみ", 26); // インスタンス2
		System.out.println(h.equals(h2));
		
		Human h3 = new Human("みなと", 25); // インスタンス3
		System.out.println(h.equals(h3));
		System.out.println(h.toString());
		
		
		
		
		// ほぼバグ
//		h = h2; // インスタンス1　←　インスタンス2（参照渡し）
//		h.info();
//		h.age = 100;
//		
//		h2.info();

		
	}
	

}
