package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration // 이 파일은 bean을 만들라고 명령하는 설정 파일이다. => config.xml과 동일한 역할
public class BeanConfigClass {
	
	@Bean // 아래 메서드를 bean으로 만들어 컨테이너에 등록
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
