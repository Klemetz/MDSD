/**
 */
package RootElement.Interactionlayer;

import RootElement.Buissnesslayer.BookingHandler;

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
 *   <li>{@link RootElement.Interactionlayer.GUIController#getDisplay <em>Display</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}</li>
 * </ul>
 *
 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUIController()
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
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUIController_Display()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GUI getDisplay();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.GUIController#getDisplay <em>Display</em>}' reference.
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
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUIController_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}' reference.
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
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUIController_Bookinghandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getBookinghandler();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='showAvailability(startDate, endDate, roomType, NrOfGuests)'"
	 * @generated
	 */
	void showAvailabilitystartDateendDateroomTypeNrOfGuests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayError(string errorMsg)'"
	 * @generated
	 */
	void displayErrorstringerrorMsg();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayExtras(List<extras>Extras)'"
	 * @generated
	 */
	void displayExtrasListextrasExtras();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayParkings(List<parkings>Parkings)'"
	 * @generated
	 */
	void displayParkingsListparkingsParkings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayRoomTypes(List<roomType>RoomType)'"
	 * @generated
	 */
	void displayRoomTypesListroomTypeRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayRoomsGrid(List<Room> roomType)'"
	 * @generated
	 */
	void displayRoomsGridListRoomroomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayPaymentOption()'"
	 * @generated
	 */
	void displayPaymentOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayRoomsByID(int bookingID)'"
	 * @generated
	 */
	void displayRoomsByIDintbookingID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayBookingsByID(int bookingID)'"
	 * @generated
	 */
	void displayBookingsByIDintbookingID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='displayBookingCancelled()'"
	 * @generated
	 */
	void displayBookingCancelled();

} // GUIController
