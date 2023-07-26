package kadai.family;

public class Member1 extends Family {

	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
	public void setGivenName() {
		this.givenName = "太郎";
	}

}
