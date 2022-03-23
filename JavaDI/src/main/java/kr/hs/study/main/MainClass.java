package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean3 obj1 = ctx.getBean("test1", TestBean3.class);
		System.out.println(obj1);
		
		TestBean3 obj2 = ctx.getBean("test2", TestBean3.class);
		System.out.println(obj2);
		
		System.out.println("===================================================");
		
		TestBean4 obj3 = ctx.getBean("java4", TestBean4.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		System.out.println(obj3.getData4());

		System.out.println("===================================================");
		
		TestBean4 obj4 = ctx.getBean("java5", TestBean4.class);
		System.out.println(obj4.getData1());
		System.out.println(obj4.getData2());
		System.out.println(obj4.getData4());
		
	}

}
