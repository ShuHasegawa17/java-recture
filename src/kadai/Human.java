package kadai;

public class Human  {

	// public > protected > デフォルト > private
	private String name;
	public int age;
	
	public Human(String name, int age) {
		
		this.name = name;
		this.age =age;
	}
	
	public void aisatu() {
		String name = "aaa";
		System.out.println("私は" + this.name +  "です。");
	}
}
