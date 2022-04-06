package kr.hs.study.beans;

public class Test{
	private Person p1;

	public Test(Person p1) {
		super();
		this.p1 = p1;
	}

	public void print() {
		System.out.print(p1.getName() + " " + p1.getAge() + " ");
		p1.eat();
	}
	
	
}
