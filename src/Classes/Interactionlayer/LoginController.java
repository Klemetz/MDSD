/**
 */
package Classes.Interactionlayer;

import Classes.BuisnessLogicLayer.PaymentHandler;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;
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
 *   <li>{@link Classes.Interactionlayer.LoginController#getGuicontroller <em>Guicontroller</em>}</li>
 *   <li>{@link Classes.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link Classes.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}</li>
 *   <li>{@link Classes.Interactionlayer.LoginController#getUserhandler <em>Userhandler</em>}</li>
 * </ul>
 *
 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController()
 * @model
 * @generated
 */
public interface LoginController extends EObject {
	/**
	 * Returns the value of the '<em><b>Guicontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guicontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guicontroller</em>' reference.
	 * @see #setGuicontroller(GUIController)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController_Guicontroller()
	 * @see Classes.Interactionlayer.GUIController#getLogincontroller
	 * @model opposite="logincontroller" required="true" ordered="false"
	 * @generated
	 */
	GUIController getGuicontroller();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.LoginController#getGuicontroller <em>Guicontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guicontroller</em>' reference.
	 * @see #getGuicontroller()
	 * @generated
	 */
	void setGuicontroller(GUIController value);

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
	 * Returns the value of the '<em><b>Userhandler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userhandler</em>' reference.
	 * @see #setUserhandler(UserHandler)
	 * @see Classes.Interactionlayer.InteractionlayerPackage#getLoginController_Userhandler()
	 * @see Classes.Buissnesslayer.UserHandler#getLogincontroller
	 * @model opposite="logincontroller" required="true" ordered="false"
	 * @generated
	 */
	UserHandler getUserhandler();

	/**
	 * Sets the value of the '{@link Classes.Interactionlayer.LoginController#getUserhandler <em>Userhandler</em>}' reference.
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
	 * @model required="true" ordered="false" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	boolean loginEmployee(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean loginGuest(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	User loginCreateGuest(String email);

} // LoginController
