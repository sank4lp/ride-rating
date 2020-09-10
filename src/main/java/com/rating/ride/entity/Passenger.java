package com.rating.ride.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {

    @Id
    private int passengerId;

    private String passengerName;

    private double ratings;

    private int totalRides;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public int getTotalRides() {
		return totalRides;
	}

	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}

}

