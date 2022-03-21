package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee obj1 = ctx.getBean("design1", Employee.class);
		Employee obj2 = ctx.getBean("develop1", Employee.class);
		Employee obj3 = ctx.getBean("publisher1", Employee.class);
		
		obj1.Checkin();
		obj1.Checkout();
		obj2.Checkin();
		obj2.Checkout();
		obj3.Checkin();
		obj3.Checkout();
		
		ctx.close();
		
	}

}
