# Ride Rating
# 1. Assumptions:
There will be two actors:  Driver and Passenger

1. The data of the both Driver and Passenger would be stored in a database.
2. There should be an API call for every action: Rating the ride and getting aggregate ratings.

# 2. Approach
The solution is design with the above assumptions and both of the two entities (Driver and Passenger) would have its own Interface, Entity, Service and Repository. The Driver would be able to rate the passenger by a POST request where he would send the rating as a JSON object. Similarly, the passenger would be able to rate the driver. 
Also, the driver will be able to get his aggregated rating with a GET request. Similarly, the passenger will also be able to get his aggregated ratings.

1. There will be total of four operations that can be performed.
2. Two actions that can be performed by the Driver (Passenger): give rating to passenger (driver) and get aggregate rating of all rides for driver (Passenger).
3. The four operations will be: 
<ol>i. rateDriver</ol>
<ol>ii. getDriverRatings</ol>
<ol>iii. ratePassenger</ol>
<ol>iv. getPassengerRatings</ol>
<ol></ol>
4. API call for rating the ride (POST req): 4 parameters would pass,
<ul>  i. driverId</ul>
<ul>  ii. driverName</ul>
<ul>  iii. ratings</ul>
<ul>  iv. totalRides</ul>
5. While retrieving the ratings (GET req), a single value (double) of aggregated ratings would be returned.

# DB Schema used
```
# DB Schema used
 CREATE TABLE DRIVER (
   driverId int PRIMARY KEY,
   driverName varchar(30) NULL,
   ratings int NULL,
   totalRides int NULL
);


 CREATE TABLE PASSENGER (
   passengerId int PRIMARY KEY,
   passengerName varchar(30) NULL,
   ratings int NULL,
   totalRides int NULL
);
```

# Steps to run 
1. Install JAVA version 8.
2. Install Spring Tool Suite.
3. Clone the repository and open the project in Spring Tool Suite. The dependencies will be downloaded automatically.
4. Run the RideRatingApplication.java file to run the server.
5. The base URL to access the API is http://localhost:8080/rating/
6. Chose the API and request accordingly (POST and GET)
