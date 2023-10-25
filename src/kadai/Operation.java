package kadai;

public class Operation {

	public static void main(String[] args) {
		
		Human h = new Human("はせがわ", 38);
		Human h2 = new Human("かたやま", 28);
		SuperHuman h3 = new SuperHuman("はせがわ", 30, "千葉");
		
		System.out.println(h.age);
		
		h.aisatu();
		h2.aisatu();
		h3.aisatu();
	
	}

}
