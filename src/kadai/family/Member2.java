package kadai.family;

public class Member2 extends Family {

	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
	
	public void setGivenName() {
		this.givenName = "一郎";
	}

}
