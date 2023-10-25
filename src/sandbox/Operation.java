package sandbox;

// 00 97
// 01 98
//[0] 
// 10 99
// 11 100

// 97,98
// 99,100,null,null,null

// 
class A {
	String val = "A";

	void print() {
		System.out.println("");
		if(val == null ) {
			return;
		}
		
		val = "AA";
		//何かしらの処理
	}
}

class B extends A {
	String val = "B";
	public B() {
		System.out.println("B初期化");
	}
	void print() {
		super.print();
		System.out.println("override!!!");
	}
	void printB() {
		System.out.println("printB!!!");
	}
}

class C extends B {
	private int hp;
	public C(int hp) {
		//super();
		this.hp = hp;
	}
	
	String print(int a) {
		super.print();
		System.out.println("overrideC!!!");
		return "aa";
	}
}

public class Operation {

	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		A c = new C(10);
		System.out.println(a.val);
		System.out.println(b.val);
		a.print();
		b.print();
		c.print();

	}

}
