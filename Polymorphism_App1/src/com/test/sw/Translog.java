package com.test.sw;

import java.util.Date;

public final class Translog {
	private final double tid;
	private  final long hAcc;
	private final long bAcc;
	private  final float amt;
	private final Date dTime;
	public Translog(double tid, long hAcc, long bAcc, float amt, Date dTime) {
		this.tid = tid;
		this.hAcc = hAcc;
		this.bAcc = bAcc;
		this.amt = amt;
		this.dTime = dTime;
	}
	public final double getTid() {
		return tid;
	}
	public final long gethAcc() {
		return hAcc;
	}
	public final long getbAcc() {
		return bAcc;
	}
	public final float getAmt() {
		return amt;
	}
	public final Date getdTime() {
		return dTime;
	}
	
	
	
	
	
	

}
