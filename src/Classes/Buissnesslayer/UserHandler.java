/**
 */
package Classes.Buissnesslayer;

import Classes.BuisnessLogicLayer.PaymentInfo;
import Classes.Datalayer.Database;

import Classes.Interactionlayer.LoginController;

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
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getUsers <em>Users</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getSingletonUserHandler <em>Singleton User Handler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler()
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Users()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getUsers();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.UserHandler#getUsers <em>Users</em>}' attribute.
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_SingletonUserHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserHandler getSingletonUserHandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.UserHandler#getSingletonUserHandler <em>Singleton User Handler</em>}' reference.
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}' reference.
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}' reference.
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
	 * @model paymentInfoRequired="true" paymentInfoOrdered="false" userRequired="true" userOrdered="false"
	 * @generated
	 */
	void addGuestDB(PaymentInfo paymentInfo, User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void sendEmailVerification(char email);

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
