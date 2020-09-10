package com.rating.ride.service;

import com.rating.ride.entity.Driver;

public interface IDriverInterface {

    String rateDriver(Driver ride);

    double getDriverRatings(int id);
}
