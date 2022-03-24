package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Employee;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(BeanClassConfiguration.class);
		
		Employee obj1 = ctx.getBean("ds1", Employee.class);
		Employee obj2 = ctx.getBean("dv1", Employee.class);
		Employee obj3 = ctx.getBean("p1", Employee.class);
		
		obj1.Checkin();
		obj1.Checkout();
		
		obj2.Checkin();
		obj2.Checkout();
		
		obj3.Checkin();
		obj3.Checkout();
		
		ctx.close();

	}

}
