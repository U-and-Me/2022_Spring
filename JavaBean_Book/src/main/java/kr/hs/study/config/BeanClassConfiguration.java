package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
public class BeanClassConfiguration {

	@Bean
	public Novel n1() {
		Novel n1 = new Novel("kim", "spring1", 8000);
		return n1;
	}
	
	@Bean
	public Poet p1() {
		Poet p1 = new Poet();
		p1.setName("lee");
		p1.setBook("spring2");
		p1.setPrice(10000);
		
		return p1;
	}
	
	@Bean
	public Magazine m1() {
		Magazine m1 = new Magazine("park", "spring3", 20000);
		return m1;
	}
}
