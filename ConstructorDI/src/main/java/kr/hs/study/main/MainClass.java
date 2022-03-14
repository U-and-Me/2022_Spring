package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		obj1.print();
		System.out.println("obj1 : " + obj1);
		
		System.out.println("=====================================================");
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		obj2.print();
		
		System.out.println("=====================================================");
		
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		obj3.print();
		
		System.out.println("=====================================================");
		
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		obj4.print();
		
		System.out.println("=====================================================");
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		obj5.print();
		
		System.out.println("=====================================================");
		
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.print();
		
		System.out.println("=====================================================");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		obj7.print();
		
		ctx.close();
		
	}

}
