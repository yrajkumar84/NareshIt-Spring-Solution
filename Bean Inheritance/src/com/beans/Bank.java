package com.beans;

public class Bank {

	private String accno;
	private String accName;
	private String Addrs;
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setAddrs(String addrs) {
		this.Addrs = addrs;
	}
	
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", accName=" + accName + ", Addrs=" + Addrs + "]";
	}
	
	
}
