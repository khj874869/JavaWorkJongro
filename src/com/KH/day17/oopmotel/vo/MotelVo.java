package com.KH.day17.oopmotel.vo;

public class MotelVo {
	private boolean isAvailable;
	public MotelVo() {
	
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	@Override
	public String toString() {
		return "MotelVo [isAvailable =" + isAvailable + "]";
	}
}
