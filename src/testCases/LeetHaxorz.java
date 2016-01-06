package testCases;

import org.junit.Test;
import Classes.Buissnesslayer.*;
import Classes.Buissnesslayer.impl.*;
import Classes.Interactionlayer.*;
import Classes.Interactionlayer.impl.InteractionlayerFactoryImpl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.*;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Ignore;

import Classes.*;

public class LeetHaxorz {

	public GUIController Start = Classes.Interactionlayer.impl.InteractionlayerFactoryImpl.init().createGUIController();
	
	
	@Test
	public void bookingIsMade() {
		
		
		setupMakeBooking();
		//Kommenterade ut det här. Kändes inte uppdaterat.
		//UserHandler.getSingletonHandler().AddGuestDB(new PaymentInfo(), new Guest());
		
		

		
		Booking succesful1 = makeBooking(1, 2, 3, "09 06 2016", "12 06 2016");
		Booking succesful2 = makeBooking(2, 3, 2, "07 08 2018", "14 08 2018");
		
		
		//Should fail since there are no entreis.
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom((makeBooking(0, 0, 0, "09 06 2016", "12 06 2016"))));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(succesful1));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(succesful2));
		//Should fail since no "Room Type" is selected.
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(3, 4, 0, "20 12 2015", "02 01 2016")));
		//Shold fail since illegal entery, there is no "-1" room type.
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(4, 2, -1, "20 12 2015", "02 01 2016")));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(5, 1, -40,"20 12 2015", "02 01 2016")));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(1000, 6000, 3000, "20 12 2015", "02 01 2016")));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(7, 52, -51,"20 12 2015", "02 01 2016")));
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(1, 1, 4, "45 15 2569", "02 10 1567")));
		//Should fail, since zero rooms has been entered.
		assertTrue(Start.getLogincontroller().getCurrentUser().bookRoom(makeBooking(9, 0, 2, "09 06 2016", "12 06 2016")));
		
		
		//Start.getLogincontroller().currentUser.bookingHandler.fetchBooking;
		
		
		//Make sure that the two that were assertTrue have been successfully entered into the database
		assertSame(Start.getLogincontroller().getCurrentUser().getBookinghandler().fetchBooking(1), succesful1);
		assertSame(Start.getLogincontroller().getCurrentUser().getBookinghandler().fetchBooking(2), succesful2);
	}
	
	@Test
	public void checkInTest(){
		
		setupCheckInAndOut();
		
		//check if booking id is valid. Låt oss använda en ful-lösning innan
		//setup funktionerna är färdiga.
		
		//Booking successfulCheckIn1 = makeBooking(1,1,3, "09 06 2016", "12 06 2016");
		//assertSame(Start.getLogincontroller().currentUser.bookingHandler.fetchBooking(1), succesfulCheckIn1);
		
		
		//Check if guest is assigned room(s).
		
		//assertNotNull(check Booking ID with corresponding email)
		//Maybe that should be done seperatly
		
		
		//Check if guest is checked in.
		//Don't think this will suffice
		//assertTrue(isCheckedIn);
		
		//Check if guest can be checked in twice (should fail)
		
		//Enter the same values but however with some slight difference
		//Then assertSame with the old entry with the new since it should not be changed
		
	}
	
	@Test
	public void checkOutTest(){
		
		setupCheckInAndOut();
		
		//Check if price (debt) is put to zero
		
		//Check if guest is checked out
		
		//Fail if the booking isn't checked in before check out
		
		//Success if check in is true
		
		//assertTrue(isCheckedOut);
		
		//Check so that the system returns fail if 
		//Another attempt at checking out is made.
		
	}
	
	// Sets up the system so that it may be tested.
	public void setupCheckInAndOut(){
		//TODO Skapa bokningar som ska kunna slås upp
		return;
	}
	
	// Sets up the system so that it may be tested.
	private void setupMakeBooking() {
		Start.getLogincontroller().loginCreateGuest("Solitaire@Email.com");
		
		
		return;
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
	

	//Makes a booking for the test case that check if a booking is made.
	private Booking makeBooking(int bookingID, int amntOfRooms, int roomType, String startDate, String endDate){
		Booking booking = BuissnesslayerFactoryImpl.eINSTANCE.createBooking();
		booking.setBookingID(bookingID);
		booking.setStartDate(startDate);
		booking.setEndDate(endDate);
		booking.setBookingID(bookingID);
		
		EList<Room> rooms = new BasicEList<Room>();
		for (int i = 0; i < amntOfRooms; i++) {
			rooms.add(BuissnesslayerFactoryImpl.eINSTANCE.createRoom());
		}

		booking.getRooms().addAll(rooms); 

		return booking;
	}
	
	
	private Booking checkInBooking(int bookingID){
		Booking booking = BuissnesslayerFactoryImpl.eINSTANCE.createBooking();
		booking.setBookingID(bookingID);
		//leta efter en booking
		if(booking.isCheckedIn() == false){
			booking.setCheckedIn(true);
		}
		else{
			System.out.println("Already checked in");
		}
		return booking;
			
	}
	
}