package com.rating.ride.service.impl;

import com.rating.ride.entity.Passenger;
import com.rating.ride.repository.PassengerRepository;
import com.rating.ride.service.IPassengerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PassengerServiceImpl implements IPassengerInterface {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public String ratePassenger(Passenger passenger) {
        Passenger existingPassenger = passengerRepository.findById(passenger.getPassengerId()).orElse(null);
        if(Objects.isNull(existingPassenger)) {
            existingPassenger=passenger;
            existingPassenger.setTotalRides(1);
        }
        else {
            double ratings = existingPassenger.getRatings();
            existingPassenger.setRatings(ratings + passenger.getRatings());
            int totalRides = existingPassenger.getTotalRides();
            existingPassenger.setTotalRides(totalRides + 1);
        }
        passengerRepository.save(existingPassenger);
        return new String("Success");
    }

    @Override
    public double getPassengerRatings(int id) {
        Passenger existingPassenger = passengerRepository.findById(id).orElse(null);
        if(Objects.nonNull(existingPassenger)) {
            existingPassenger.setRatings(existingPassenger.getRatings()/existingPassenger.getTotalRides());
            return existingPassenger.getRatings();
        }
        return 0d;
    }
}
