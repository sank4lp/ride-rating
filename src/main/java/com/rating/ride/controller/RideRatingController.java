package com.rating.ride.controller;

import com.rating.ride.entity.Driver;
import com.rating.ride.entity.Passenger;
import com.rating.ride.service.IDriverInterface;
import com.rating.ride.service.IPassengerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/rating", produces= MediaType.APPLICATION_JSON_VALUE)
public class RideRatingController {

    @Autowired
    private IDriverInterface driverService;

    @Autowired
    private IPassengerInterface passengerService;

    @RequestMapping(method= RequestMethod.POST, value="/driver")
    public String RateRide(@RequestBody Driver driver) {
        return driverService.rateDriver(driver);
    }

    @RequestMapping(method=RequestMethod.GET, value="/driver/{id}")
    public double getDriverRatings(@PathVariable int id) {
        return driverService.getDriverRatings(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/Passenger")
    public String RatePassenger(@RequestBody Passenger Passenger) {
        return passengerService.ratePassenger(Passenger);
    }

    @RequestMapping(method=RequestMethod.GET, value="/Passenger/{id}")
    public double getPassengerRatings(@PathVariable int id) {
        return passengerService.getPassengerRatings(id);
    }
}