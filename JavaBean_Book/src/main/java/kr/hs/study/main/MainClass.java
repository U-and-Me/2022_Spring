package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(BeanClassConfiguration.class);
		
		Book obj1 = ctx.getBean("n1", Book.class);
		Book obj2 = ctx.getBean("p1", Book.class);
		Book obj3 = ctx.getBean("m1", Book.class);
		
		obj1.buy();
		obj2.sell();
		obj3.buy();
		
		
		ctx.close();

	}

}
