/**
 */
package Classes.Interactionlayer;

import Classes.Buissnesslayer.BookingHandler;

import Classes.Buissnesslayer.Room;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Interactionlayer.GUIController#getDisplay <em>Display</em>}</li>
 *   <li>{@link Classes.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}</li>
 * </ul>
 *
 * @see Classes.Interactionlayer.InteractionlayerPackage#getGUIController()
 * @model
 * @generated
 */
public interface GUIController extends EObject {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' reference.
	 * @see #setDisplay(GUI)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getGUIController_Display()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GUI getDisplay();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.GUIController#getDisplay <em>Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(GUI value);

	/**
	 * Returns the value of the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logincontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logincontroller</em>' reference.
	 * @see #setLogincontroller(LoginController)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getGUIController_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logincontroller</em>' reference.
	 * @see #getLogincontroller()
	 * @generated
	 */
	void setLogincontroller(LoginController value);

	/**
	 * Returns the value of the '<em><b>Bookinghandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookinghandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookinghandler</em>' reference.
	 * @see #setBookinghandler(BookingHandler)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getGUIController_Bookinghandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getBookinghandler();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookinghandler</em>' reference.
	 * @see #getBookinghandler()
	 * @generated
	 */
	void setBookinghandler(BookingHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated
	 */
	void showAvailability(int startDate, int endDate, Room roomType, int nrOfGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayError();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extrasMany="true" extrasOrdered="false"
	 * @generated
	 */
	void displayExtras(EList<String> extras);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parkingsMany="true" parkingsOrdered="false"
	 * @generated
	 */
	void displayParkings(EList<Integer> parkings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeMany="true" roomTypeOrdered="false"
	 * @generated
	 */
	void displayRoomTypes(EList<Integer> roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeMany="true" roomTypeOrdered="false"
	 * @generated
	 */
	void displayRoomsGrid(EList<Integer> roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayPaymentOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void displayRoomsByID(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayBookingsByID(int bookingID)'"
	 * @generated
	 */
	void displayBookingsByIDintbookingID(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayBookingCancelled();

} // GUIController
