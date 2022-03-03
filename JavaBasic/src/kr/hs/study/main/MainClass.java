package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld hello1 = new HelloWorldKr();
		// 부모의 참조변수로 자식 객체를 가리킴
		callMethod(hello1);
		
		
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}