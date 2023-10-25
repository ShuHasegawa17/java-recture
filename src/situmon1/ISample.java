package situmon1;

public interface ISample {

	default void dMethod() {
		pMethod();
		System.out.println("default");
	}
	
	default void dMethod2() {
		pMethod();
		System.out.println("default");
	}
	
	default void dMethod3() {
		pMethod();
		System.out.println("default");
	}
	
	private void pMethod() {
		System.out.println("private");
	}
	
	static void sMethod() {
		spMethod();
		System.out.println("static");
	}
	
	private static void spMethod() {
		System.out.println("private static");
	}
}
