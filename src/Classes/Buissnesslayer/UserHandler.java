/**
 */
package Classes.Buissnesslayer;

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
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}</li>
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
	 * @see #setUsers(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Users()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getUsers();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.UserHandler#getUsers <em>Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' attribute.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(String value);

	/**
	 * Returns the value of the '<em><b>Logincontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Interactionlayer.LoginController#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logincontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logincontroller</em>' reference.
	 * @see #setLogincontroller(LoginController)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Logincontroller()
	 * @see Classes.Interactionlayer.LoginController#getUserhandler
	 * @model opposite="userhandler" required="true" ordered="false"
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
	 * It is bidirectional and its opposite is '{@link Classes.Datalayer.Database#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUserHandler_Database()
	 * @see Classes.Datalayer.Database#getUserhandler
	 * @model opposite="userhandler" required="true" ordered="false"
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
	 * @model emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void sendEmailVerification(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	boolean isEmailValid(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" employeeIDRequired="true" employeeIDOrdered="false"
	 * @generated
	 */
	Employee identifyUser(int employeeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	User AddNewGuest(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Employee CreateEmployee(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	Guest identifyUser(String email);

} // UserHandler
