package com.rating.ride.service.impl;

import com.rating.ride.entity.Driver;
import com.rating.ride.repository.DriverRepository;
import com.rating.ride.service.IDriverInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DriverServiceImpl implements IDriverInterface {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public String rateDriver(Driver ride) {
        Driver existingDriver = driverRepository.findById(ride.getDriverId()).orElse(null);
        if(Objects.isNull(existingDriver)) {
            existingDriver=ride;
            existingDriver.setTotalRides(1);
        }
        else {
            double ratings = existingDriver.getRatings();
            existingDriver.setRatings(ratings + ride.getRatings());
            int totalRides = existingDriver.getTotalRides();
            existingDriver.setTotalRides(totalRides + 1);
        }
        driverRepository.save(existingDriver);
        return new String("Success");
    }

    @Override
    public double getDriverRatings(int id) {
        Driver existingDriver = driverRepository.findById(id).orElse(null);
        if(Objects.nonNull(existingDriver)) {
            existingDriver.setRatings(existingDriver.getRatings()/existingDriver.getTotalRides());
            return existingDriver.getRatings();
        }
        return 0d;
    }
}
