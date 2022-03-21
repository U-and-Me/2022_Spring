package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration // �� ������ bean�� ������ ����ϴ� ���� �����̴�. => config.xml�� ������ ����
public class BeanConfigClass {
	
	@Bean // �Ʒ� �޼��带 bean���� ����� �����̳ʿ� ���
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean(name="new")
	@Lazy
	@Scope("prototype")
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public TestBean1 java3() {
		TestBean1 t3 = new TestBean1();
		return t3;
	}
	
}
