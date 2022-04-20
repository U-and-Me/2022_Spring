package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1의 method1");
	}
	
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	
	public void method1(String s1) {
		System.out.println("String 매개변수 method1");
	}
	
	public void method1(int a, int b) {
		System.out.println("int 매개변수 2개 method1");
	}
	
	public void method1(int a, String s) {
		System.out.println("int 매개변수 1개, String 매개변수 1개 method1");
	}
	
	public void method1(int a, double b) {
		System.out.println("int 매개변수 1개, double 매개변수 1개 method1");
	}
	
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1의 method2");
	}
	
	public void method2(int a) {
		System.out.println("int 매개변수 method2");
	}
	
	public int method3() {
		System.out.println("리턴 타입이 int인 method3");
		return 500;
	}
}
