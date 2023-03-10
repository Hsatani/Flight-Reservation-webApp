package com.hardik.flightreservation.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hardik.flightreservation.dto.ReservationRequest;
import com.hardik.flightreservation.entities.Flight;
import com.hardik.flightreservation.entities.Passenger;
import com.hardik.flightreservation.entities.Reservation;
import com.hardik.flightreservation.repos.FlightRepository;
import com.hardik.flightreservation.repos.PassengerRepository;
import com.hardik.flightreservation.repos.ReservationRepository;
//import com.hardik.flightreservation.util.EmailUtil;
//import com.hardik.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

//	@Value("${com.hardik.flightreservation.itinerary.dirpath}")
//	private String ITINERARY_DIR;

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	ReservationRepository reservationRepository;

//	@Autowired
//	PDFGenerator pdfGenerator;

//	@Autowired
//	EmailUtil emailUtil;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);

	@Override
	@Transactional
	public Reservation bookFlight(ReservationRequest request) {

		LOGGER.info("Inside bookFlight()");
		// Make Payment

		Long flightId = request.getFlightId();
		LOGGER.info("Fetching  flight for flight id:" + flightId);
		Flight flight = flightRepository.findById(flightId).get();

		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		LOGGER.info("Saving the passenger:" + passenger);
		Passenger savedPassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);

		LOGGER.info("Saving the reservation:" + reservation);
		Reservation savedReservation = reservationRepository.save(reservation);

//		String filePath = ITINERARY_DIR + savedReservation.getId() + ".pdf";
//		LOGGER.info("Generating  the itinerary"+filePath);
	//	pdfGenerator.generateItinerary(savedReservation, filePath);
//		LOGGER.info("Emailing the Itinerary");
	//	emailUtil.sendItinerary(passenger.getEmail(), filePath);

		return savedReservation;
	}

}
