package testCases;

import org.junit.Test;
import Classes.Buissnesslayer.*;
import Classes.Buissnesslayer.impl.*;
import Classes.Interactionlayer.*;
import Classes.Interactionlayer.impl.InteractionlayerFactoryImpl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Ignore;

import Classes.*;

public class TestSuite {

	public GUIController Start = Classes.Interactionlayer.impl.InteractionlayerFactoryImpl.init().createGUIController();
	
	// Use case: Booking of room
	@Test
	public void bookingIsMade() {
		
		
		setupMakeBooking();
				
		Booking succesful1 = makeBooking(1, 2, 3, "09 06 2016", "12 06 2016");
		Booking succesful2 = makeBooking(2, 3, 2, "07 08 2018", "14 08 2018");
		
				
		//should succeed since a user with the email exists in the DB
		assertNotNull(Start.getBookinghandler().getUserhandler().identifyUser("lennart@hotmail.com"));
		//should fail since no user with this email does not exist in the DB
		assertNull(Start.getBookinghandler().getUserhandler().identifyUser("dettaefel"));
		//should succed since the employeeID exists in the DB
		assertNotNull(Start.getBookinghandler().getUserhandler().identifyUser(656));
		//should fail since the employeeID does not exist in the DB
		assertNull(Start.getBookinghandler().getUserhandler().identifyUser(99));
		
		//should fail since not valid email
		assertFalse(Start.getLogincontroller().getUserhandler().isEmailValid("johangillarkakor"));
		//should succeed since email is valid
		assertTrue(Start.getLogincontroller().getUserhandler().isEmailValid("johangillarkakor@hotmail.com"));
		//should fail since invalid EmployeeID, remeber to create Employee Users in setup
		
		String startDate = "07 01 2016";
		String endDate = "08 01 2016";
		Booking newBooking = makeBooking(99, 1, 0, "20 12 2015", "02 01 2016");
		Booking desiredDate = chooseDesireDate(newBooking, startDate, endDate);
		// should succeed
		assertEquals(startDate, desiredDate.getStartDate());
		assertEquals(endDate, desiredDate.getEndDate());		
		
		
//		//Checks that all of our 3 extras are available
		BasicEList<String> extras = getAvailableExtras();
		int extSize = extras.size();
		assertEquals(extSize , 3);
		
		//check that right extras are included in the booking
		Booking booking1 = makeBooking(15, 2, 1, "10 10 2019", "15 10 2019");
		ChooseAvailableExtras(booking1, extras);
		EList<String> chosenExtras = booking1.getExtras();
		assertEquals(extras, chosenExtras);
		
		//Checks that our 3 payment options exist
		BasicEList<String> options = getPaymentOptions();
		int optSize = options.size();
		assertEquals(optSize, 3);
		
		//check that the correct payment option is included in the booking
		Booking booking2 = makeBooking(16, 2, 1, "10 10 2020", "15 10 2020");
		choosePaymentOptions(booking2 , "Card");
		String chosenPayment = booking2.getPayment();
		assertEquals("Card", chosenPayment);
		
		
	}
	
	@Test
	public void checkInTest(){
		setupCheckInAndOut();
		
		//makes sure we can find a booking to check in
		Booking bookingA = makeBooking(20, 2, 1, "10 10 2099", "15 10 2099");
//		System.out.println(bookingA.getRooms());
		MakeBooking(bookingA);
		Booking bookingToCheckIn = SearchForBookingID(20);
//		System.out.println(bookingToCheckIn);
		assertEquals(bookingA, bookingToCheckIn);
		
		// get correct rooms for the booking
		Room roomA = GetRoomForTheBookingNCheckIn(bookingA);
		assertNotNull(roomA);
		
		//make sure the booking is checked in
		bookingToCheckIn.setCheckedIn(true);
		assertEquals(bookingToCheckIn.isCheckedIn(), true);
		
		//alternative flow 1: booking-ID doesn't exist
		Booking bookingToCheckIn2 = SearchForBookingID(23344555);
		assertEquals(bookingToCheckIn2, null);
		
		//make new booking since ID was missing
		Booking bookingToCheckIn3 = makeBooking(25, 2, 2, "10 10 2399", "15 10 2499");
		MakeBooking(bookingToCheckIn3);
		Booking booking99 = SearchForBookingID(25);
		assertEquals(booking99, bookingToCheckIn3);
		
		//alternative flow 2: not enough rooms of selected roomType upon check-in
		int rooooooomType = 2;
		Booking bookingToCheckIn4 = makeBooking(26, 2, rooooooomType, "10 10 2500", "15 10 2699");
		int roomType12 = bookingToCheckIn4.getRoomType();
		Booking newBooking123 = RoomTypeInsufficient(bookingToCheckIn4, roomType12);
		
		assertTrue(newBooking123.getRoomType() > roomType12);
		
		
	}
	
	@Test
	public void checkOutTest() throws ParseException{
		
		setupCheckInAndOut();
		
		//make sure that the booking is checked in before the checkout can be made
		int roomtype = 2;
		int rooms = 1;
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Calendar cal1 = new GregorianCalendar();
	    Calendar cal2 = new GregorianCalendar();
	    String sDate = "21 12 2016";
	    String eDate = "26 12 2016";
		Date date1 = myFormat.parse(sDate);
		Date date2 = myFormat.parse(eDate);
		
		Booking BTCO = makeBooking(22, rooms, roomtype, sDate, eDate);
		MakeBooking(BTCO);
		BTCO.setCheckedIn(true);
		Booking result = IdentifyBooking(22);
		assertEquals(BTCO, result);
		
		//make sure correct payment amount is set for booking
		int amount = ReceivePayAmount(IdentifyBooking(22));
		cal1.setTime(date1);
		cal2.setTime(date2);
		int nights = daysBetween(cal1.getTime(),cal2.getTime());
		assertEquals(amount, (((roomtype * 100) * rooms) * nights));
		
		//Make sure that the booking is checked out after payment has been made
		Booking checkedOut = IdentifyBooking(22);
		CheckOut(checkedOut);
		assertEquals(checkedOut.isCheckedOut(), true);
		
		
		

		
	}
	
	// Sets up the system so that it may be tested.
	public void setupCheckInAndOut(){
		

		Start.getLogincontroller().getUserhandler().CreateEmployee(1);
		Start.getLogincontroller().loginEmployee(1);
	}
	
	// Sets up the system so that it may be tested.
	private void setupMakeBooking() {
		Start.getLogincontroller().loginCreateGuest("Solitaire@Email.com");
		
		
		return;
	}
	
	
	
	//3
	private Booking chooseDesireDate(Booking oldBooking, String startDate, String endDate)
	{
		oldBooking.setStartDate(startDate);
		oldBooking.setEndDate(endDate);
		return oldBooking;
	}
	//4
	private BasicEList<Room> GetRoomTypes(String startDate, String endDate, int roomType)
	{
		return (BasicEList)Start.getBookinghandler().fetchAvailability(startDate, endDate, roomType, 0);
	}
	//5, 7
	private Booking SelectRooms(BasicEList<Room> RoomTypesResult, Booking booking, int type, int amnt)
	{
		BasicEList<Room> results = new BasicEList<Room>();
		
		
		for (int i = 0; i < amnt; i++) {
			results.add(RoomTypesResult.get(i));
		}
		booking.getRooms().addAll(results);
		return booking;
	}
	//8
	private BasicEList<String> getAvailableExtras()
	{
		return (BasicEList<String>) Start.getBookinghandler().fetchAvailableExtras();
	}
	//9
	private Booking ChooseAvailableExtras(Booking booking,BasicEList<String> includedExtras)
	{
		booking.getExtras().addAll(includedExtras);
		return booking;
	}
	//10
	private BasicEList<String> getPaymentOptions()
	{
		return (BasicEList<String>) Start.getBookinghandler().displayPaymentOptions();
		
		
	}
	//11
	private Booking choosePaymentOptions(Booking booking ,String choosenPayment)
	{
		booking.setPayment(choosenPayment);
		return booking;
	}
	//11, 12
	private Boolean MakeBooking(Booking booking)
	{
		return Start.getLogincontroller().getCurrentUser().bookRoom(booking);
		
	}
	
	//CheckedIn
	//4
	private Booking SearchForBookingID(int bookingID)
	{
		return Start.getBookinghandler().fetchBooking(bookingID);
	}
	//6 , 8
	private Room GetRoomForTheBookingNCheckIn(Booking booking)
	{
		Start.getBookinghandler().checkIn(booking);
		return Start.getBookinghandler().fetchAvailability(booking.getStartDate(), booking.getEndDate(), booking.getRooms().get(0).getRoomType(), 0).get(0);
		
	}
	
	//Alt2 1,2
	private Booking GuestDoesNotHaveBooking(int bookingID, String email, String startDate, String endDate, int roomType)
	{
		Booking newbooking = BuissnesslayerFactoryImpl.eINSTANCE.createBooking();
		
		newbooking.getRooms().add( Start.getBookinghandler().fetchAvailability(startDate, endDate, roomType, 0).get(0));
		
		
		return newbooking;

	}
	//Alt4 1
	private Booking RoomTypeInsufficient(Booking booking, int roomType)
	{
		booking.getRoom().clear();
		if (roomType < 3) {
			roomType++;
		}
		booking.setRoomType(roomType);
		
		return booking;

	}
	
	//CheckOut
	//3
	private Booking IdentifyBooking(int ID)
	{
		return Start.getBookinghandler().fetchBooking(ID);
	}
	//5
	private int ReceivePayAmount(Booking booking)
	{
		return Start.getBookinghandler().CalculatePayment(booking);
	}
	// 7
	private void CheckOut(Booking booking)
	{
		Start.getBookinghandler().checkOut(booking);
	}
	
	
	private void loginEmployee(String employeeID) {
		/*
		 * 
		 * 
		 * 
		 */
		return;
	}
	private void loginGuest(String guestEmail) {
		
		return;
	}
	
	private void Rest() {
		
		
	}

	//Makes a booking for the test case that check if a booking is made.
	private Booking makeBooking(int bookingID, int amntOfRooms, int roomType, String startDate, String endDate){
		Booking booking = BuissnesslayerFactoryImpl.eINSTANCE.createBooking();
		booking.setBookingID(bookingID);
		booking.setStartDate(startDate);
		booking.setEndDate(endDate);
		booking.setBookingID(bookingID);
		booking.setRoomType(roomType);
		
		
		
		EList<Room> rooms = new BasicEList<Room>();
		rooms = Start.getBookinghandler().fetchAvailability(startDate, endDate, roomType, 0);
		booking.getRooms().addAll(rooms); 
		
		return booking;
	}
	
	
	
	
	public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
}
	
}