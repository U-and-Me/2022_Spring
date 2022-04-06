package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Test obj1 = ctx.getBean("t1", Test.class);
		obj1.print();
		
		Test obj2 = ctx.getBean("t2", Test.class);
		obj2.print();
		
		Test obj3 = ctx.getBean("t3", Test.class);
		obj3.print();
		
	}

}
