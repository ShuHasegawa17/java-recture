package bronze;

public class Operation {

	public static void main(String[] args) {
		Child c1 = new Child("たかし");
		Child c2 = new Child("たかし");
		
		System.out.println(c1 == c2);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
//		String s1 = "ああ";
//		String s2 = "ああ";
//		System.out.println(s1 == s2);
		
		Viercle v= new Car();
		v.run();
		Car c = new Car();
		c.run();
		//c.enging();
		
	}

}
