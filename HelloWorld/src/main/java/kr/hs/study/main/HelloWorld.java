package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloWorldEn t1 = ctx.getBean("t1", HelloWorldEn.class);
		System.out.println("t1 : " + t1);
		
		ctx.close();
	}

}
