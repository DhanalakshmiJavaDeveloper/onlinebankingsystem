package com.liveproject.pckg.entity;
public class Bank {
	
	public int cusid;
	public String cusname;
	public long accountnumber;
	public long pinnumber;
	public long balance;
	public Bank() {
		super();
		
	}
	
	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public long getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(long pinnumber) {
		this.pinnumber = pinnumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [cusid=" + cusid + ", cusname=" + cusname + ", accountnumber=" + accountnumber + ", pinnumber="
				+ pinnumber + ", balance=" + balance + "]";
	}
	
}