package kadai.family;

public abstract class Family {
	public String family = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	public void commonIntroduce() {
		System.out.println("名前は" + this.family + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
}
