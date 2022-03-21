package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book obj1 = ctx.getBean("novel1", Book.class);
		obj1.buy();
		
		Book obj2 = ctx.getBean("poet1", Book.class);
		obj2.sell();
		
		Book obj3 = ctx.getBean("magazine1", Book.class);
		obj3.buy();
		
		ctx.close();

	}

}
