/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getGuest <em>Guest</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getExtras <em>Extras</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getParkings <em>Parkings</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getPayment <em>Payment</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#isPaymentComplete <em>Payment Complete</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Booking#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_BookingID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' attribute.
	 * @see #setGuest(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Guest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getGuest();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getGuest <em>Guest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' attribute.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(int value);

	/**
	 * Returns the value of the '<em><b>Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #setNrOfGuests(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_NrOfGuests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNrOfGuests();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getNrOfGuests <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #getNrOfGuests()
	 * @generated
	 */
	void setNrOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStartDate();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(int value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getEndDate();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(int value);

	/**
	 * Returns the value of the '<em><b>Extras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extras</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extras</em>' attribute.
	 * @see #setExtras(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Extras()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getExtras();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getExtras <em>Extras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extras</em>' attribute.
	 * @see #getExtras()
	 * @generated
	 */
	void setExtras(char value);

	/**
	 * Returns the value of the '<em><b>Parkings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parkings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parkings</em>' attribute.
	 * @see #setParkings(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Parkings()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getParkings();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getParkings <em>Parkings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parkings</em>' attribute.
	 * @see #getParkings()
	 * @generated
	 */
	void setParkings(char value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' attribute.
	 * @see #setRooms(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Rooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getRooms();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getRooms <em>Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rooms</em>' attribute.
	 * @see #getRooms()
	 * @generated
	 */
	void setRooms(char value);

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(boolean)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_CheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#isCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out</em>' attribute.
	 * @see #setCheckedOut(boolean)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_CheckedOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedOut();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#isCheckedOut <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Out</em>' attribute.
	 * @see #isCheckedOut()
	 * @generated
	 */
	void setCheckedOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' attribute.
	 * @see #setPayment(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Payment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getPayment();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#getPayment <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' attribute.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(char value);

	/**
	 * Returns the value of the '<em><b>Payment Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Complete</em>' attribute.
	 * @see #setPaymentComplete(boolean)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_PaymentComplete()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaymentComplete();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Booking#isPaymentComplete <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Complete</em>' attribute.
	 * @see #isPaymentComplete()
	 * @generated
	 */
	void setPaymentComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getBooking_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

} // Booking
