package bean;

import java.io.Serializable;

public class Cash implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int rs2000;
	private int rs500;
	private int rs100;
	
	public Cash() {
	}

	public int getRs2000() {
		return rs2000;
	}

	public void setRs2000(int rs2000) {
		this.rs2000 = rs2000;
	}

	public int getRs500() {
		return rs500;
	}

	public void setRs500(int rs500) {
		this.rs500 = rs500;
	}

	public int getRs100() {
		return rs100;
	}

	public void setRs100(int rs100) {
		this.rs100 = rs100;
	}
	
}
