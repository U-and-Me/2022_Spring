package kr.hs.study.beans;

public class Developer implements Employee{
	
	private int go;
	private int leave;

	public Developer(int go, int leave) {
		super();
		this.go = go;
		this.leave = leave;
	}

	public int getGo() {
		return go;
	}



	public void setGo(int go) {
		this.go = go;
	}



	public int getLeave() {
		return leave;
	}



	public void setLeave(int leave) {
		this.leave = leave;
	}



	@Override
	public void Checkin() {
		System.out.println("개발자 " + go + "시 출근");
	}

	@Override
	public void Checkout() {
		System.out.println("개발자 " + leave + "시 퇴근");
	}
	
}
