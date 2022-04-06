package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Test t1() {
		Person p1 = new Person("kim", 30, "¹ä");
		return new Test(p1);
	}
	
	@Bean
	public Test t2() {
		Person p1 = new Person("lee", 20, "¹°");
		return new Test(p1);
	}
	
	@Bean
	public Test t3() {
		Person p1 = new Person("park", 10, "°úÀÚ");
		return new Test(p1);
	}
	
}
