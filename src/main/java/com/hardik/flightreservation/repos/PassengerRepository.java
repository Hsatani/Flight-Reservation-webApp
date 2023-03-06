package com.hardik.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardik.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
