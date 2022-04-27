package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		// dao ��������
		TestDAO dao = ctx.getBean(TestDAO.class);

		// TestBean ��ü ����
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setUserid("kim");
		t1.setUserpass("1111");
		t1.setUsername("��ٸ�");

		// dao insert
		dao.insert_data(t1);

		// TestBean ��ü ����
		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setUserid("lee");
		t2.setUserpass("2222");
		t2.setUsername("�̷δ�");

		// dao insert
		dao.insert_data(t2);

		// TestBean ��ü ����
		TestBean t3 = ctx.getBean(TestBean.class);
		t3.setUserid("park");
		t3.setUserpass("3333");
		t3.setUsername("��ȣ��");

		// dao insert
		dao.insert_data(t3);
		
		System.out.println("insert success!!");

		ctx.close();
	}

}
