package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1�� method1");
	}
	
	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	
	public void method1(String s1) {
		System.out.println("String �Ű����� method1");
	}
	
	public void method1(int a, int b) {
		System.out.println("int �Ű����� 2�� method1");
	}
	
	public void method1(int a, String s) {
		System.out.println("int �Ű����� 1��, String �Ű����� 1�� method1");
	}
	
	public void method1(int a, double b) {
		System.out.println("int �Ű����� 1��, double �Ű����� 1�� method1");
	}
	
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1�� method2");
	}
	
	public void method2(int a) {
		System.out.println("int �Ű����� method2");
	}
	
	public int method3() {
		System.out.println("���� Ÿ���� int�� method3");
		return 500;
	}
}
