package kr.hs.study.beans;

public class Person {
	private String name = "";
	private int age = 0;
	private String food;

	public Person(String name, int age, String food) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getFood() {
		return food;
	}
	
	void eat() {
		System.out.println(food + " ธิดู");
	}
	
}
