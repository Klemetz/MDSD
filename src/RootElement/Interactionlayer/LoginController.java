/**
 */
package RootElement.Interactionlayer;

import RootElement.BuisnessLogicLayer.PaymentHandler;

import RootElement.Buissnesslayer._AbstractUser;

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
 *   <li>{@link RootElement.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @see RootElement.Interactionlayer.InteractionlayerPackage#getLoginController()
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
	 * @see #setCurrentUser(_AbstractUser)
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getLoginController_CurrentUser()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	_AbstractUser getCurrentUser();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User</em>' reference.
	 * @see #getCurrentUser()
	 * @generated
	 */
	void setCurrentUser(_AbstractUser value);

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
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getLoginController_LoginController()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLoginController();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}' reference.
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
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getLoginController_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Employee loginEmployee(int ID, string password)'"
	 * @generated
	 */
	void EmployeeloginEmployeeintIDstringpassword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest makeGuestBookingLogin(Booking booking)'"
	 * @generated
	 */
	void GuestmakeGuestBookingLoginBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest loginGuest(int bookingID, string name)'"
	 * @generated
	 */
	void GuestloginGuestintbookingIDstringname();

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
