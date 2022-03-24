package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired		// 객체를 생성하는데 DataBean2 타입의 bean이 있으면 data1에 주소값을 넣어라
	@Qualifier("d1")	// "d1"인 bean을 가지고 와라
	private DataBean2 data1;
	
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2;

	public DataBean2 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
}
