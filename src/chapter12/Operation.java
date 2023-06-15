package chapter12;

public class Operation {

	public static void main(String[] args) {
		Character c1 = new Samurai();
		Character c2  = new Nija();
		Character[] cArray = {c1, c2};
		executeAttack(cArray);
		
	}
	
	public static void executeAttack(Character[] cs) {
		for(Character c : cs) {
			c.attack();
		}
	}
}
