package chapter10;

public class Operation {
	
	public static void main(String[] args) {
		
		SuperSenshi s1 = new SuperSenshi("スーパーたかし", 100, 50);
		Senshi s2 = new Senshi("たかし", 50);
		Senshi s3 = new Senshi("さとし", 40);
		
		s1.attack();
		s2.attack();
		s3.attack();
		
		s1.info();
				
		Human human1 = new Senshi("ただし", 10);
		Human human2 = new SuperSenshi("スーパーただし", 100, 50);
		Human[] humans = {human1, human2};
		sleepLine(humans);
	}
	
	static void sleepLine(Human[] humans) {
		for(Human h : humans) {
			h.sleep();
		}
	}


}
