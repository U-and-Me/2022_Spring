package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml"); // config.xml를 메모리에 로딩시킴 : 객체를 생성해서 컨테이너에 보관
		
		TestBean test1 = (TestBean)ctx.getBean("test1"); // 다운 캐스팅
		System.out.println("test1 : " + test1);
		
		TestBean test2 = ctx.getBean("test1", TestBean.class); // 클래스 지정
		System.out.println("test2 : " + test2);
		
		ctx.close();
	}

}
