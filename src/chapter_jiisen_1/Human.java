package chapter_jiisen_1;

public class Human implements Comparable<Human> {

	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Human)) {
			return false;
		}
		// 名前で同一か判定
		return this.name == ((Human)obj).name;
	}
	
	@Override
	public int hashCode() {
		// TODO 自動生成されたメソッド・スタブ
		return 1;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.age;
	}

	@Override
	public int compareTo(Human o) {
		// 自身が前の場合は−１、自身が後ろの場合は１
		if(this.age < o.age) {
			return 1;
		} else if(this.age > o.age) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
