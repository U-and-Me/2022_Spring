package kr.hs.study.beans;

public class Designer implements Employee{

	@Override
	public void Checkin() {
		System.out.println("디자이너 7시 출근");
	}

	@Override
	public void Checkout() {
		System.out.println("디자이너 10시 퇴근");
	}

}
