import org.junit.Test;
import Classes.Buissnesslayer.Booking;
import org.junit.Test;
import java.util.*;
import org.junit.Ignore;

public class LeetHaxorz {

	public LoginController bookingSystem;
	public checkedIn isCheckedIn;
	public checkedOut isCheckedOut;
	
	@Test
	public void bookingIsMade() {
		
		
		setupMakeBooking();
		//Kommenterade ut det här. Kändes inte uppdaterat.
		//UserHandler.getSingletonHandler().AddGuestDB(new PaymentInfo(), new Guest());
		
		

		
		booking succesful1 = makeBooking(1, 2, 3, "09 06 2016", "12 06 2016");
		booking succesful2 = makeBooking(2, 3, 2, "07 08 2018", "14 08 2018");
		
		//Should fail since there are no entreis.
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(0, 0, 0, 0, 0)));
		assertTrue(bookingSystem.currentUser.BookRoom(succesful1));
		assertTrue(bookingSystem.currentUser.BookRoom(succesful2));
		//Should fail since no "Room Type" is selected.
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(3, 4, 0, "20 12 2015", "02 01 2016")));
		//Shold fail since illegal entery, there is no "-1" room type.
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(4, 2, -1, "20 12 2015", "02 01 2016")));
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(5, 1, -40,"20 12 2015", "02 01 2016")));
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(1000, 6000, 3000, "20 12 2015", "02 01 2016")));
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(7, 52, -51,"20 12 2015", "02 01 2016")));
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(1, 1, 4, "45 15 2569", "02 10 1567")));
		//Should fail, since zero rooms has been entered.
		assertFalse(bookingSystem.currentUser.BookRoom(makeBooking(9, 0, 2, "09 06 2016", "12 06 2016")));
		
		
		//bookingSystem.currentUser.bookingHandler.fetchBooking;
		
		
		//Make sure that the two that were assertTrue have been successfully entered into the database
		assertSame(bookingSystem.currentUser.bookingHandler.fetchBooking(1), succesful1);
		assertSame(bookingSystem.currentUser.bookingHandler.fetchBooking(2), succesful2);
		
	}
	
	@Test
	public void checkInTest(){
		
		setupCheckInAndOut();
		
		//check if booking id is valid. Låt oss använda en ful-lösning innan
		//setup funktionerna är färdiga.
		
		booking successfulCheckIn1 = makeBooking(1,1,3, "09 06 2016", "12 06 2016");
		assertSame(bookingSystem.currentUser.bookingHandler.fetchBooking(1), succesfulCheckIn1);
		
		
		//Check if guest is assigned room(s).
		
		//assertNotNull(check Booking ID with corresponding email)
		//Maybe that should be done seperatly
		
		
		//Check if guest is checked in.
		//Don't think this will suffice
		assertTrue(isCheckedIn);
		
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
		
		assertTrue(isCheckedOut);
		
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
		Booking booking = new Booking();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
		booking.Bookingid = bookingID;
		
		
		List<Rooms> rooms = new ArrayList<Rooms>();
		for (int i = 0; i < amntOfRooms; i++) {
			rooms.add(new Room());
		}
		booking.Rooms = rooms;
		

		return booking;
	}
	
	
	private Booking checkInBooking(int bookingID){
		//Booking booking = new Booking();
		//booking.Bookingid = bookingID;
		//leta efter en booking
		if(booking.checkedIn == false){
			booking.setCheckedIn(true);
		}
		else{
			System.out.println("Already checked in");
		}
		return booking;
			
	}
	
}