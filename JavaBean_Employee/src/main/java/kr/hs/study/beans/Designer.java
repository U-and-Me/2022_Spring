package kr.hs.study.beans;

public class Designer implements Employee{
	
	private int go;
	private int leave;
	
	public Designer(int go, int leave) {
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
		System.out.println("디자이너 " + go + "시 출근");
	}

	@Override
	public void Checkout() {
		System.out.println("디자이너 " + leave +"시 퇴근");
	}

}
