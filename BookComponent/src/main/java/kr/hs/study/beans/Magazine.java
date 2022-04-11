package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("m1")
public class Magazine implements Book{

	private String name;
	private String book;
	private int price;
	
	public Magazine(@Value("lee") String name, @Value("spring2") String book, @Value("20000") int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	@Override
	public void buy() {
		System.out.println(name+"�� ���� '" + book + "'�� " + price + "���� ���");
	}

	@Override
	public void sell() {
		System.out.println(name+"�� ���� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	@Override
	public void create() {
		System.out.println("������ ����");
	}

}
