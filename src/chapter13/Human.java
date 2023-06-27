package chapter13;

public class Human {
	
	private String name;
	private int age;
	public String[] hobby;
	
	@Override
    public boolean equals(Object obj) {
		Human obj1 = (Human)obj;
		return this.name == obj1.name && this.age == obj1.age;
    }
	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 100) {
			this.age = age;
			 
		} else {
			throw new IllegalArgumentException("エラー");
		}
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println(name + age);
	}
}
