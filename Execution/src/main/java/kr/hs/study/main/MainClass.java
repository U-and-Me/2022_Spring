package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		
		obj1.method1();
		obj1.method2();
		obj1.method1(100);
		obj1.method1("spring");
		obj1.method1(100, 200);
		obj1.method1(100, "spring");
		obj1.method1(100, 123.45);
		//obj1.method1();
		obj1.method2(100);
		obj1.method1();
		obj1.method3();
		
		ctx.close();
		
	}

}
