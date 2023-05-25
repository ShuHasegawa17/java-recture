package chapter8;

public class Square {
	
	private int height;
	private int width;
	
	public Square(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public static void info() {
		System.out.println("このクラスは、面積を求めるクラスです。");
	}
	
	public int  area() {
		return this.height * this.width;
	}

}
