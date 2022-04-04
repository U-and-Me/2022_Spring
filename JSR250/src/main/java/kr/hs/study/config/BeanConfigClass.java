package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
}
