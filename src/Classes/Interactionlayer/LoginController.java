/**
 */
package Classes.Interactionlayer;

import Classes.BuisnessLogicLayer.PaymentHandler;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.User;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link Classes.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}</li>
 *   <li>{@link Classes.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController()
 * @model
 * @generated
 */
public interface LoginController extends EObject {
	/**
	 * Returns the value of the '<em><b>Current User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current User</em>' reference.
	 * @see #setCurrentUser(User)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController_CurrentUser()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	User getCurrentUser();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User</em>' reference.
	 * @see #getCurrentUser()
	 * @generated
	 */
	void setCurrentUser(User value);

	/**
	 * Returns the value of the '<em><b>Login Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Controller</em>' reference.
	 * @see #setLoginController(LoginController)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController_LoginController()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLoginController();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Controller</em>' reference.
	 * @see #getLoginController()
	 * @generated
	 */
	void setLoginController(LoginController value);

	/**
	 * Returns the value of the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymenthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenthandler</em>' reference.
	 * @see #setPaymenthandler(PaymentHandler)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenthandler</em>' reference.
	 * @see #getPaymenthandler()
	 * @generated
	 */
	void setPaymenthandler(PaymentHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IDRequired="true" IDOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void loginEmployee(int ID, char password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void makeGuestBookingLogin(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void loginGuest(int bookingID, char name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSingletonController();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSingletonHandler();

} // LoginController
