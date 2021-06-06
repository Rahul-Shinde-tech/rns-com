package com.resource;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "FlightDetails")
public class FlightDetails {
	@Id
	private int flightRecord;
	@Column
	private int flightNo;
	@Column
	private String flightName;
	@Column
	private String flightCountryName;
	@Column
	private String flightSource;
	@Column
	private String flightDestination;
	@Column
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date flightDepTime;
	@Column
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date flightArrivalTime;
	
	public static FlightDetails getInstance() {
		return new FlightDetails();
	}
	
	
	public int getFlightRecord() {
		return flightRecord;
	}


	public void setFlightRecord(int flightRecord) {
		this.flightRecord = flightRecord;
	}


	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightCountryName() {
		return flightCountryName;
	}

	public void setFlightCountryName(String flightCountryName) {
		this.flightCountryName = flightCountryName;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public Date getFlightDepTime() {
		return flightDepTime;
	}

	public void setFlightDepTime(Date dept) {
		this.flightDepTime = dept;
	}

	public Date getFlightArrivalTime() {
		return flightArrivalTime;
	}

	public void setFlightArrivalTime(Date flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}

	
	
}
