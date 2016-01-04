/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.BookingHandler;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.User;
import Classes.Datalayer.Database;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getSingletonBooking <em>Singleton Booking</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getUser <em>User</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingHandlerImpl#getDatabase <em>Database</em>}</li>
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
	 * The cached value of the '{@link #getSingletonBooking() <em>Singleton Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonBooking()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler singletonBooking;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public BookingHandler getSingletonBooking() {
		if (singletonBooking != null && singletonBooking.eIsProxy()) {
			InternalEObject oldSingletonBooking = (InternalEObject)singletonBooking;
			singletonBooking = (BookingHandler)eResolveProxy(oldSingletonBooking);
			if (singletonBooking != oldSingletonBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING, oldSingletonBooking, singletonBooking));
			}
		}
		return singletonBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetSingletonBooking() {
		return singletonBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonBooking(BookingHandler newSingletonBooking) {
		BookingHandler oldSingletonBooking = singletonBooking;
		singletonBooking = newSingletonBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING, oldSingletonBooking, singletonBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectResolvingEList<User>(User.class, this, BuissnesslayerPackage.BOOKING_HANDLER__USER);
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
	public void intfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void BookingfetchBookingintbookingID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attemptBookRoomBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBookingBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBookingBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendErrorMsgString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSingletonBookingBookingHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSingletonHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fetchAvailableExtras() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING:
				if (resolve) return getSingletonBooking();
				return basicGetSingletonBooking();
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return getUser();
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
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
			case BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING:
				setSingletonBooking((BookingHandler)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				setDatabase((Database)newValue);
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
			case BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING:
				setSingletonBooking((BookingHandler)null);
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				getUser().clear();
				return;
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				setDatabase((Database)null);
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
			case BuissnesslayerPackage.BOOKING_HANDLER__SINGLETON_BOOKING:
				return singletonBooking != null;
			case BuissnesslayerPackage.BOOKING_HANDLER__USER:
				return user != null && !user.isEmpty();
			case BuissnesslayerPackage.BOOKING_HANDLER__DATABASE:
				return database != null;
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
			case BuissnesslayerPackage.BOOKING_HANDLER___INTFETCH_AVAILABILITY_START_DATE_END_DATE_ROOM_TYPE_NR_OF_GUESTS:
				intfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___BOOKINGFETCH_BOOKINGINTBOOKING_ID:
				BookingfetchBookingintbookingID();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___ATTEMPT_BOOK_ROOM_BOOKINGBOOKING:
				attemptBookRoomBookingbooking();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CANCEL_BOOKING_BOOKINGBOOKING:
				cancelBookingBookingbooking();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHANGE_BOOKING_BOOKINGBOOKING:
				changeBookingBookingbooking();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHECK_IN_BOOKINGBOOKING:
				checkInBookingbooking();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CHECK_OUT_BOOKINGBOOKING:
				checkOutBookingbooking();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___SEND_ERROR_MSG_STRING:
				sendErrorMsgString();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___GET_SINGLETON_BOOKING_BOOKING_HANDLER:
				getSingletonBookingBookingHandler();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___CREATE_SINGLETON_HANDLER:
				createSingletonHandler();
				return null;
			case BuissnesslayerPackage.BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS:
				fetchAvailableExtras();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingHandlerImpl
