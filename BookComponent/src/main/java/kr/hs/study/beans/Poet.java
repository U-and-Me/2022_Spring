package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Poet implements Book{
	
	private String name;
	private String book;
	private int price;
	
	public Poet(@Value("park") String name, @Value("spring3") String book, @Value("15000") int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}
	
	@Override
	public void buy() {
		System.out.println(name+"의 시 '" + book + "'을 " + price + "원에 산다");
	}

	@Override
	public void sell() {
		System.out.println(name+"의 시 '" + book + "'을 " + price + "원에 판다");
	}

	@Override
	public void create() {
		System.out.println("시를 짓다");
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
