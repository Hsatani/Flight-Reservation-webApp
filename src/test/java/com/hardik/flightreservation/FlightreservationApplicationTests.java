package com.hardik.flightreservation;

//@SpringBootTest
//public class FlightreservationApplicationTests {
//
//	@Autowired
//	PassengerRepository repo;
//
//	@Autowired
//	FlightRepository flightRepo;
//
//	@Autowired
//	ReservationRepository reservationRepo;

//	@Autowired
//	PDFGenerator pdfGenerator;
//
//	@Autowired
//	EmailUtil emailUtil;
//
//	@Test
//	public void contextLoads() {
//	}

//	@Test
//	public void testGenerateItenarary() {
//		Reservation reservation = reservationRepo.findById(1L).get();
//		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
//		pdfGenerator.generateItinerary(reservation, filePath);
//	}
//
//	@Test
//	public void testEmail() {
//		Reservation reservation = reservationRepo.findById(1L).get();
//		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
//		emailUtil.sendItinerary("thippireddy.bharath@gmail.com", filePath);
//	}
//
//}
