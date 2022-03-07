package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml"); // config.xml�� �޸𸮿� �ε���Ŵ : ��ü�� �����ؼ� �����̳ʿ� ����
		
		TestBean test1 = (TestBean)ctx.getBean("test1"); // �ٿ� ĳ����
		System.out.println("test1 : " + test1);
		
		TestBean test2 = ctx.getBean("test1", TestBean.class); // Ŭ���� ����
		System.out.println("test2 : " + test2);
		
		ctx.close();
	}

}
