package bronze;

public class Child extends Parent{
	
	String name;
	
	public Child(String name) {
		this.name = name;
	}
	
	@Override
	public void hello() throws NullPointerException {
		String s = "";
	}
	
	@Override
    public boolean equals(Object obj) {
		
        return this.name == ((Child)obj).name;
    }
	
	@Override
	public String toString() {
		return name;
	}

}
