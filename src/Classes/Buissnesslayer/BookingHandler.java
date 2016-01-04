/**
 */
package Classes.Buissnesslayer;

import Classes.Datalayer.Database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getSingletonBooking <em>Singleton Booking</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getUser <em>User</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler()
 * @model
 * @generated
 */
public interface BookingHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference.
	 * @see #setBooking(Booking)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Booking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference.
	 * @see #setBookings(Booking)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Bookings()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBookings();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookings</em>' reference.
	 * @see #getBookings()
	 * @generated
	 */
	void setBookings(Booking value);

	/**
	 * Returns the value of the '<em><b>Singleton Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Booking</em>' reference.
	 * @see #setSingletonBooking(BookingHandler)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_SingletonBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getSingletonBooking();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.BookingHandler#getSingletonBooking <em>Singleton Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Booking</em>' reference.
	 * @see #getSingletonBooking()
	 * @generated
	 */
	void setSingletonBooking(BookingHandler value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated
	 */
	void fetchAvailability(int startDate, int endDate, Room roomType, int nrOfGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void fetchBooking(Booking bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void attemptBookRoom(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void cancelBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void changeBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkIn(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkOut(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendErrorMsg();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSinglettonBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSingletonHandler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fetchAvailableExtras();

} // BookingHandler
