package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml의 역할과 동일 : bean 생성

@Configuration // 해당 파일이 spring 객체 생성 파일이라는 것을 알려줌
public class BeanClassConfiguration {
	
	//  <bean id="t1" class="kr.hs.study.beans.TestBean1" /> 생성
	@Bean // bean 생성
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1; //t1 객체 생성
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
}
