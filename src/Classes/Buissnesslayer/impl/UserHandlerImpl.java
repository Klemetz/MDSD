/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.UserHandler;

import Classes.Datalayer.Database;

import Classes.Interactionlayer.LoginController;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getSingletonUserHandler <em>Singleton User Handler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserHandlerImpl extends MinimalEObjectImpl.Container implements UserHandler {
	/**
	 * The default value of the '{@link #getUsers() <em>Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected static final char USERS_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected char users = USERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSingletonUserHandler() <em>Singleton User Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonUserHandler()
	 * @generated
	 * @ordered
	 */
	protected UserHandler singletonUserHandler;

	/**
	 * The cached value of the '{@link #getLogincontroller() <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogincontroller()
	 * @generated
	 * @ordered
	 */
	protected LoginController logincontroller;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.USER_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getUsers() {
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsers(char newUsers) {
		char oldUsers = users;
		users = newUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__USERS, oldUsers, users));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler getSingletonUserHandler() {
		if (singletonUserHandler != null && singletonUserHandler.eIsProxy()) {
			InternalEObject oldSingletonUserHandler = (InternalEObject)singletonUserHandler;
			singletonUserHandler = (UserHandler)eResolveProxy(oldSingletonUserHandler);
			if (singletonUserHandler != oldSingletonUserHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER, oldSingletonUserHandler, singletonUserHandler));
			}
		}
		return singletonUserHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler basicGetSingletonUserHandler() {
		return singletonUserHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonUserHandler(UserHandler newSingletonUserHandler) {
		UserHandler oldSingletonUserHandler = singletonUserHandler;
		singletonUserHandler = newSingletonUserHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER, oldSingletonUserHandler, singletonUserHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController getLogincontroller() {
		if (logincontroller != null && logincontroller.eIsProxy()) {
			InternalEObject oldLogincontroller = (InternalEObject)logincontroller;
			logincontroller = (LoginController)eResolveProxy(oldLogincontroller);
			if (logincontroller != oldLogincontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
			}
		}
		return logincontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController basicGetLogincontroller() {
		return logincontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogincontroller(LoginController newLogincontroller) {
		LoginController oldLogincontroller = logincontroller;
		logincontroller = newLogincontroller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER_HANDLER__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuestDBPaymentInfopaymentInfoUseruser() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendEmailVerificationStringemail() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSingletonHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSingletonHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__USERS:
				return getUsers();
			case BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER:
				if (resolve) return getSingletonUserHandler();
				return basicGetSingletonUserHandler();
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				if (resolve) return getLogincontroller();
				return basicGetLogincontroller();
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__USERS:
				setUsers((Character)newValue);
				return;
			case BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER:
				setSingletonUserHandler((UserHandler)newValue);
				return;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)newValue);
				return;
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				setDatabase((Database)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__USERS:
				setUsers(USERS_EDEFAULT);
				return;
			case BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER:
				setSingletonUserHandler((UserHandler)null);
				return;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)null);
				return;
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				setDatabase((Database)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__USERS:
				return users != USERS_EDEFAULT;
			case BuissnesslayerPackage.USER_HANDLER__SINGLETON_USER_HANDLER:
				return singletonUserHandler != null;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				return logincontroller != null;
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BuissnesslayerPackage.USER_HANDLER___ADD_GUEST_DB_PAYMENT_INFOPAYMENT_INFO_USERUSER:
				addGuestDBPaymentInfopaymentInfoUseruser();
				return null;
			case BuissnesslayerPackage.USER_HANDLER___SEND_EMAIL_VERIFICATION_STRINGEMAIL:
				sendEmailVerificationStringemail();
				return null;
			case BuissnesslayerPackage.USER_HANDLER___GET_SINGLETON_HANDLER:
				getSingletonHandler();
				return null;
			case BuissnesslayerPackage.USER_HANDLER___CREATE_SINGLETON_HANDLER:
				createSingletonHandler();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Users: ");
		result.append(users);
		result.append(')');
		return result.toString();
	}

} //UserHandlerImpl
