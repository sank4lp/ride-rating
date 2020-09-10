package com.rating.ride.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    private int driverId;

    private String driverName;

    private double ratings;

    private int totalRides;

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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

