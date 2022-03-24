package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired		// ��ü�� �����ϴµ� DataBean2 Ÿ���� bean�� ������ data1�� �ּҰ��� �־��
	@Qualifier("d1")	// "d1"�� bean�� ������ �Ͷ�
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
