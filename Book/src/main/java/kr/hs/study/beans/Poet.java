package kr.hs.study.beans;

public class Poet implements Book{
	
	private String name;
	private String book;
	private int price;
	
	@Override
	public void buy() {
		System.out.println(name+"�� �� '" + book + "'�� " + price + "���� ���");
	}

	@Override
	public void sell() {
		System.out.println(name+"�� �� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	@Override
	public void create() {
		System.out.println("�ø� ����");
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
