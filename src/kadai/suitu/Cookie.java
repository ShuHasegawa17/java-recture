package kadai.suitu;

public class Cookie {
	
	private int suger;
	private int butter;
	private int flower;
	
	public int getSuger() {
		return suger;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public int getButter() {
		return butter;
	}
	public void setButter(int butter) {
		this.butter = butter;
	}
	public int getFlower() {
		return flower;
	}
	public void setFlower(int flower) {
		this.flower = flower;
	}
	
	public void bakingTime() {
		System.out.println("10分");
	}
	
	public void tasty() {
		System.out.println("甘い！");
	}

}
