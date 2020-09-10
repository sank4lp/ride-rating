package com.rating.ride.service;

import com.rating.ride.entity.Passenger;

public interface IPassengerInterface {

     String ratePassenger(Passenger passenger);

    double getPassengerRatings(int id);
}
