/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.BookingHandler;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.Room;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;
import Classes.Datalayer.Database;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Date.*;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getUser <em>User</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getUserhandler <em>Userhandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingHandler {
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected Booking bookings;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getUserhandler() <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserhandler()
	 * @generated
	 * @ordered
	 */
	protected UserHandler userhandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BookingHandlerImpl() {
		super();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.BOOKING_HANDLER__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING_HANDLER__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookings() {
		if (bookings != null && bookings.eIsProxy()) {
			InternalEObject oldBookings = (InternalEObject)bookings;
			bookings = (Booking)eResolveProxy(oldBookings);
			if (bookings != oldBookings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS, oldBookings, bookings));
			}
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBookings() {
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookings(Booking newBookings) {
		Booking oldBookings = bookings;
		bookings = newBookings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS, oldBookings, bookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectWithInverseResolvingEList<User>(User.class, this, BuissnesslayerPackage.BOOKING_HANDLER__USER, BuissnesslayerPackage.USER__BOOKINGHANDLER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.BOOKING_HANDLER__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING_HANDLER__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler getUserhandler() {
		if (userhandler != null && userhandler.eIsProxy()) {
			InternalEObject oldUserhandler = (InternalEObject)userhandler;
			userhandler = (UserHandler)eResolveProxy(oldUserhandler);
			if (userhandler != oldUserhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER, oldUserhandler, userhandler));
			}
		}
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler basicGetUserhandler() {
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserhandler(UserHandler newUserhandler) {
		UserHandler oldUserhandler = userhandler;
		userhandler = newUserhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER, oldUserhandler, userhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> fetchAvailability(String startDate, String endDate, int roomType, int nrOfGuests) {
		
		EList<Room> NonOccupiedRooms = (EList<Room>) new ArrayList<Room>();
		
		ArrayList<Room> PossibleRooms = new ArrayList<Room>();
		
		for (Room room : getDatabase().getRoomDB()) {
			if (room.getRoomType() == roomType) {
				PossibleRooms.add(room);
			}
		}
		
		for (Room room : PossibleRooms) {
			boolean occupied = false;
			for (Booking booking : getDatabase().getBookingDB()) {
				
				SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");


				try {
				    Date NewStart = myFormat.parse(startDate);
				    Date NewEnd = myFormat.parse(endDate);
				    
				    Date OldStart = myFormat.parse(booking.getStartDate());
				    Date OldNew = myFormat.parse(booking.getEndDate());
				    
				    if (!((NewStart.before(OldStart) && NewEnd.before(OldStart)) || ((NewStart.after(NewStart) && NewEnd.after(NewEnd))))) {
						occupied = true;
					}
				    
				} catch (ParseException e) {
				    e.printStackTrace();
				}
				
			}
			if(!occupied) NonOccupiedRooms.add(room);
			occupied = false;
		}
		
		return NonOccupiedRooms;
		
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking fetchBooking(int bookingID) {
		for (Booking booking : database.getBookingDB()) {
			if(booking.getBookingID()==bookingID){
				return booking;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> fetchAvailability(String startDate, String endDate, int roomType) {
		
		
		ArrayList<Room> Output = new ArrayList<Room>();
		
		EList<Booking> bookings =  getDatabase().getBookingDB();
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		boolean occupiedRoom = false;
		
		try {
				for (Room room : getDatabase().getRoomDB()) {
					if (roomType == room.getRoomType()){
					
					for (Booking booking : bookings) {
					    if (booking.getRoom() == room) {
					    	
					    	
							Date orderedDate = myFormat.parse(startDate);
							
						    Date date1 = myFormat.parse(booking.getStartDate());
						    Date date2 = myFormat.parse(booking.getEndDate());
							if ((orderedDate.before(date1) && orderedDate.before(date2)) || (orderedDate.after(date1) && orderedDate.after(date2))) {
								
							}
							else {
								occupiedRoom = true;
							}
						}

					    
					}
					if (!occupiedRoom) {
						Output.add(room);
					}
					occupiedRoom = false;
				}
			}

		    
		    
		  
		    
		    
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return (EList<Room>) Output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean attemptBookRoom(Booking booking) {
			
		 return database.getBookingDB().add(booking);
			
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(Booking booking) {
		booking.setCheckedIn(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(Booking booking) {
		booking.setCheckedOut(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendErrorMsg() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> fetchAvailableExtras() {
		
		return getDatabase().getExtrasDB();
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> displayPaymentOptions() {
		
		BasicEList<String> list = new BasicEList<String>();
		
		list.add("Bill");
		list.add("Cash");
		list.add("Card");
		
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int CalculatePayment(Booking booking) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Calendar cal1 = new GregorianCalendar();
	     Calendar cal2 = new GregorianCalendar();

	     

	     
	     
	    //cal1.set(2008, 8, 1); 
	     //cal2.set(2008, 9, 31);
	     
		try {
			Date date1 = myFormat.parse(booking.getStartDate());
			Date date2 = myFormat.parse(booking.getEndDate());
			
			cal1.setTime(date1);
			cal2.setTime(date2);
			
			int results = daysBetween(cal1.getTime(),cal2.getTime());
			
			if (results ==0) {
				return 1*100*booking.getRooms().get(0).getRoomType();
			}
			return results*100*booking.getRooms().get(0).getRoomType();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	 public int daysBetween(Date d1, Date d2){
         return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
 }


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUser()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS:
				if (resolve) return getBookings();
				return basicGetBookings();
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return getUser();
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER:
				if (resolve) return getUserhandler();
				return basicGetUserhandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKING:
				setBooking((Booking)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS:
				setBookings((Booking)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				setDatabase((Database)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER:
				setUserhandler((UserHandler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKING:
				setBooking((Booking)null);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS:
				setBookings((Booking)null);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				getUser().clear();
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				setDatabase((Database)null);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER:
				setUserhandler((UserHandler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKING:
				return booking != null;
			case BuissnesslayerPackage.BOOKING_HANDLER__BOOKINGS:
				return bookings != null;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return user != null && !user.isEmpty();
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				return database != null;
			case BuissnesslayerPackage.BOOKING_HANDLER__USERHANDLER:
				return userhandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BuissnesslayerPackage.BOOKING_HANDLER___FETCH_AVAILABILITY__STRING_STRING_INT_INT:
				return fetchAvailability((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case BuissnesslayerPackage.BOOKING_HANDLER___FETCH_BOOKING__INT:
				return fetchBooking((Integer)arguments.get(0));
			case BuissnesslayerPackage.BOOKING_HANDLER___ATTEMPT_BOOK_ROOM__BOOKING:
				return attemptBookRoom((Booking)arguments.get(0));
			case BuissnesslayerPackage.BOOKING_HANDLER___CANCEL_BOOKING__BOOKING:
				cancelBooking((Booking)arguments.get(0));
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHANGE_BOOKING__BOOKING:
				changeBooking((Booking)arguments.get(0));
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHECK_IN__BOOKING:
				checkIn((Booking)arguments.get(0));
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHECK_OUT__BOOKING:
				checkOut((Booking)arguments.get(0));
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___SEND_ERROR_MSG:
				sendErrorMsg();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS:
				return fetchAvailableExtras();
			case BuissnesslayerPackage.BOOKING_HANDLER___DISPLAY_PAYMENT_OPTIONS:
				return displayPaymentOptions();
			case BuissnesslayerPackage.BOOKING_HANDLER___CALCULATE_PAYMENT__BOOKING:
				return CalculatePayment((Booking)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void Main(String[] args){
		System.out.println("Det går att köra");
		
	}
} //BookingHandlerImpl
