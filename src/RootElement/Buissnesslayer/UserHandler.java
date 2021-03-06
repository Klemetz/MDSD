/**
 */
package RootElement.Buissnesslayer;

import RootElement.Datalayer.Database;

import RootElement.Interactionlayer.LoginController;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Buissnesslayer.UserHandler#getUsers <em>Users</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.UserHandler#getSingletonUserHandler <em>Singleton User Handler</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getUserHandler()
 * @model
 * @generated
 */
public interface UserHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' attribute.
	 * @see #setUsers(char)
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Users()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getUsers();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.UserHandler#getUsers <em>Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' attribute.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(char value);

	/**
	 * Returns the value of the '<em><b>Singleton User Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton User Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton User Handler</em>' reference.
	 * @see #setSingletonUserHandler(UserHandler)
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getUserHandler_SingletonUserHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserHandler getSingletonUserHandler();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.UserHandler#getSingletonUserHandler <em>Singleton User Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton User Handler</em>' reference.
	 * @see #getSingletonUserHandler()
	 * @generated
	 */
	void setSingletonUserHandler(UserHandler value);

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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logincontroller</em>' reference.
	 * @see #getLogincontroller()
	 * @generated
	 */
	void setLogincontroller(LoginController value);

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
	 * @see RootElement.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link RootElement.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='addGuestDB(PaymentInfo paymentInfo, User user)'"
	 * @generated
	 */
	void addGuestDBPaymentInfopaymentInfoUseruser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='sendEmailVerification(String email)'"
	 * @generated
	 */
	void sendEmailVerificationStringemail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSingletonHandler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSingletonHandler();

} // UserHandler
