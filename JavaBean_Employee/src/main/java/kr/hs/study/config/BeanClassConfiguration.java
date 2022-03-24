package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;


@Configuration
public class BeanClassConfiguration {

	@Bean
	public Designer ds1() {
		return new Designer(7, 6);
	}
	
	@Bean
	public Developer dv1() {
		return new Developer(9, 5);
	}
	
	@Bean
	public Publisher p1() {
		Publisher p1 = new Publisher();
		p1.setGo(10);
		p1.setLeave(6);
		return p1;
	}
	
}
