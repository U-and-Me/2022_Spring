package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// dao 가져오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		// TestBean 객체 t1 만들어서 100, spring 넣기
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setData1(100);
		t1.setData2("spring");
		
		// dao의 insert_data 호출
		dao.insert_data(t1);
		
		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setData1(200);
		t2.setData2("spring2");
		
		dao.insert_data(t2);
		
		System.out.println("Inserted!!");
		
		ctx.close();

	}

}
