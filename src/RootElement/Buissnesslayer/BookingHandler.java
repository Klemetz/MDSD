/**
 */
package RootElement.Buissnesslayer;

import RootElement.Datalayer.Database;

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
 *   <li>{@link RootElement.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.BookingHandler#getSingletonBooking <em>Singleton Booking</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.BookingHandler#get_abstractuser <em>abstractuser</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler()
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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Booking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}' reference.
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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Bookings()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBookings();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}' reference.
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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_SingletonBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getSingletonBooking();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.BookingHandler#getSingletonBooking <em>Singleton Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Booking</em>' reference.
	 * @see #getSingletonBooking()
	 * @generated
	 */
	void setSingletonBooking(BookingHandler value);

	/**
	 * Returns the value of the '<em><b>abstractuser</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Buissnesslayer._AbstractUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>abstractuser</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>abstractuser</em>' reference list.
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler__abstractuser()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='<<abstract>>user'"
	 * @generated
	 */
	EList<_AbstractUser> get_abstractuser();

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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getBookingHandler_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='int fetchAvailability(StartDate, EndDate, RoomType, NrOfGuests)'"
	 * @generated
	 */
	void intfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Booking fetchBooking(int bookingID)'"
	 * @generated
	 */
	void BookingfetchBookingintbookingID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='attemptBookRoom(Booking booking)'"
	 * @generated
	 */
	void attemptBookRoomBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cancelBooking(Booking booking)'"
	 * @generated
	 */
	void cancelBookingBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='changeBooking(Booking booking)'"
	 * @generated
	 */
	void changeBookingBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='checkIn(Booking booking)'"
	 * @generated
	 */
	void checkInBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='checkOut(Booking booking)'"
	 * @generated
	 */
	void checkOutBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='sendErrorMsg() : String'"
	 * @generated
	 */
	void sendErrorMsgString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getSingletonBooking : BookingHandler'"
	 * @generated
	 */
	void getSingletonBookingBookingHandler();

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
