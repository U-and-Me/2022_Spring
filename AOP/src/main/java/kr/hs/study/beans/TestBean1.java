package kr.hs.study.beans;

// target Ŭ����
// joinpoint : method1, method2
public class TestBean1 {
	public void method1() {
		System.out.println("TestBean1�� method1");
		// afterThrowingMethod�� �����Ű�� ���� ���� �߻���Ű��
		int a = 100 / 0;
	}
	
	public void method2() {
		System.out.println("TestBena1�� method2");
	}
}
