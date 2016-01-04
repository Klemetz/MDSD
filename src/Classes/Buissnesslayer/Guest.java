/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='int bookRoom(Booking booking)'"
	 * @generated
	 */
	void intbookRoomBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='changeBooking(Booking oldBooking, Booking newBooking)'"
	 * @generated
	 */
	void changeBookingBookingoldBookingBookingnewBooking();

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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='attemptCheckIn(Booking booking)'"
	 * @generated
	 */
	void attemptCheckInBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='attemptCheckOut(Booking booking)'"
	 * @generated
	 */
	void attemptCheckOutBookingbooking();

} // Guest
