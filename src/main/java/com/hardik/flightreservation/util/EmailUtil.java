package com.hardik.flightreservation.util;

//@Component
//public class EmailUtil {
//	@Value("${com.hardik.flightreservation.itinerary.email.body}")
//	private String EMAIL_BODY = "Please find your Itinerary attached.";
//
//	@Value("${com.hardik.flightreservation.itinerary.email.subject}")
//	private String EMAIL_SUBJECT = "Itinerary for your Flight";
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(EmailUtil.class);
//
//	@Autowired
//	private JavaMailSender sender;
//
//	public void sendItinerary(String toAddress, String filePath) {
//		LOGGER.info("Inside sendItinerary()");
//
//		MimeMessage message = sender.createMimeMessage();
//
//		try {
//			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
//			messageHelper.setTo(toAddress);
//			messageHelper.setSubject(EMAIL_SUBJECT);
//			messageHelper.setText(EMAIL_BODY);
//			messageHelper.addAttachment("Itinearary", new File(filePath));
//			sender.send(message);
//		} catch (MessagingException e) {
//			LOGGER.error("Exception inside sendItinerary" + e);
//		}
//	}
//
//}
