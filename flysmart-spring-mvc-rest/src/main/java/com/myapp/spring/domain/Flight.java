package com.myapp.spring.domain;

public class Flight {
	
	private long flightid;
	
	private String sourcecity,destinationCity;
	
	private double fare,duration;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(long flightid, String sourcecity, String destinationCity, double fare, double duration) {
		this.flightid = flightid;
		this.sourcecity = sourcecity;
		this.destinationCity = destinationCity;
		this.fare = fare;
		this.duration = duration;
	}

	public long getFlightid() {
		return flightid;
	}

	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}

	public String getSourcecity() {
		return sourcecity;
	}

	public void setSourcecity(String sourcecity) {
		this.sourcecity = sourcecity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
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
		builder.append("Flight [flightid=");
		builder.append(flightid);
		builder.append(", sourcecity=");
		builder.append(sourcecity);
		builder.append(", destinationCity=");
		builder.append(destinationCity);
		builder.append(", fare=");
		builder.append(fare);
		builder.append(", duration=");
		builder.append(duration);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
