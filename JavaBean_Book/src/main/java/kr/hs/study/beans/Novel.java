package kr.hs.study.beans;

public class Novel implements Book{
	
	private String name;
	private String book;
	private int price;
	
	public Novel(String name, String book, int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	@Override
	public void buy() {
		System.out.println(name+"�� �Ҽ� '" + book + "'�� " + price + "���� ���");
	}

	@Override
	public void sell() {
		System.out.println(name+"�� �Ҽ� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	@Override
	public void create() {
		System.out.println("�Ҽ��� �����");
	}

}
