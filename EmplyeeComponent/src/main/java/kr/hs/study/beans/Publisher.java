package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Publisher implements Employee{
	
	private int go;
	private int leave;

	public Publisher(@Value("9") int go, @Value("5") int leave) {
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
		System.out.println("ÆÛºí¸®¼Å " + go + "½Ã Ãâ±Ù");
	}

	@Override
	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å " + leave + "½Ã Åð±Ù");
	}

}
