package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("n1")
public class Novel implements Book{
	
	private String name;
	private String book;
	private int price;
	
	public Novel(@Value("kim") String name, @Value("spring1") String book, @Value("10000") int price) {
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
