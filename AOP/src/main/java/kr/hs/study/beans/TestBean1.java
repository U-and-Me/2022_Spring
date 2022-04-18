package kr.hs.study.beans;

// target 클래스
// joinpoint : method1, method2
public class TestBean1 {
	public void method1() {
		System.out.println("TestBean1의 method1");
		// afterThrowingMethod를 실행시키기 위해 예외 발생시키기
		int a = 100 / 0;
	}
	
	public void method2() {
		System.out.println("TestBena1의 method2");
	}
}
