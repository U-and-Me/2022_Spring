package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		Book obj1 = ctx.getBean("m1", Magazine.class);
		Book obj2 = ctx.getBean("n1", Novel.class);
		Book obj3 = ctx.getBean("p1", Poet.class);
		
		obj1.create();
		obj1.buy();
		obj1.sell();
		
		obj2.create();
		obj2.buy();
		obj2.sell();
		
		obj3.create();
		obj3.buy();
		obj3.sell();
		
		ctx.close();
		
	}

}
