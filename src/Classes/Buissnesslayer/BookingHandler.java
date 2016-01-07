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
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getUser <em>User</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.BookingHandler#getUserhandler <em>Userhandler</em>}</li>
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
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.User}.
	 * It is bidirectional and its opposite is '{@link Classes.Buissnesslayer.User#getBookinghandler <em>Bookinghandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_User()
	 * @see Classes.Buissnesslayer.User#getBookinghandler
	 * @model opposite="bookinghandler" required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userhandler</em>' reference.
	 * @see #setUserhandler(UserHandler)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Userhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserHandler getUserhandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.BookingHandler#getUserhandler <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userhandler</em>' reference.
	 * @see #getUserhandler()
	 * @generated
	 */
	void setUserhandler(UserHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated
	 */
	EList<Room> fetchAvailability(String startDate, String endDate, int roomType, int nrOfGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Booking fetchBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated NOT 
	 */
	boolean attemptBookRoom(Booking booking);

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
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> fetchAvailableExtras();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> displayPaymentOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	int CalculatePayment(Booking booking);

} // BookingHandler
