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
		System.out.println(name+"의 잡지 '" + book + "'을 " + price + "원에 산다");
	}

	@Override
	public void sell() {
		System.out.println(name+"의 잡지 '" + book + "'을 " + price + "원에 판다");
	}

	@Override
	public void create() {
		System.out.println("잡지를 쓰다");
	}

}
