package com.myapp.spring.domain;

public class Flights {

	private int fno;

	private String sname;
	private String dname;
	private long fare;
	private double duration;
	
	public Flights() {
		
	}
	
	public Flights(int fno, String sname, String dname, long fare, double duration) {
	
		this.fno = fno;
		
		this.sname = sname;
		this.dname = dname;
		this.fare = fare;
		this.duration = duration;
	}
	
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public long getFare() {
		return fare;
	}
	public void setFare(long fare) {
		this.fare = fare;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flights [fno=");
		builder.append(fno);
		
		builder.append(", sname=");
		builder.append(sname);
		builder.append(", fare=");
		builder.append(fare);
		builder.append(", duration=");
		builder.append(duration);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
