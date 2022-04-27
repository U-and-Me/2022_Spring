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

		// TestBean 객체 생성
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setUserid("kim");
		t1.setUserpass("1111");
		t1.setUsername("김다리");

		// dao insert
		dao.insert_data(t1);

		// TestBean 객체 생성
		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setUserid("lee");
		t2.setUserpass("2222");
		t2.setUsername("이로니");

		// dao insert
		dao.insert_data(t2);

		// TestBean 객체 생성
		TestBean t3 = ctx.getBean(TestBean.class);
		t3.setUserid("park");
		t3.setUserpass("3333");
		t3.setUsername("박호니");

		// dao insert
		dao.insert_data(t3);
		
		System.out.println("insert success!!");

		ctx.close();
	}

}
