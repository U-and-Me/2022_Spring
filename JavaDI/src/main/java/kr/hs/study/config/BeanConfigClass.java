package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
public class BeanConfigClass {

	@Bean(name="test1")
	@Lazy
	@Scope("prototype")
	public TestBean3 t1() {
		TestBean3 t1 = new TestBean3();
		return t1;
	}
	
	@Bean(name="test2")
	@Lazy
	@Scope("prototype")
	public TestBean3 t2() {
		TestBean3 t1 = new TestBean3();
		return t1;
	}
	
	@Bean
	public TestBean4 java4() {
		// 자바코드로 생성자DI
		TestBean4 t4 = new TestBean4(100, "spring4", new DataBean4());
		return t4;
	}
	
	@Bean
	public TestBean4 java5() {
		// 자바코드로 setterDI
		TestBean4 t4 = new TestBean4();
		t4.setData1(200);
		t4.setData2("spring5");
		t4.setData4(new DataBean4());
		
		return t4;
	}
	
}
