/**
 */
package Classes.Buissnesslayer.impl;

import Classes.BuisnessLogicLayer.PaymentInfo;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.Employee;
import Classes.Buissnesslayer.Guest;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;

import Classes.Datalayer.Database;
import Classes.Datalayer.DatalayerPackage;
import Classes.Interactionlayer.InteractionlayerPackage;
import Classes.Interactionlayer.LoginController;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserHandlerImpl#getLogincontroller <em>Logincontroller</em>}</li>
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
	protected static final String USERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected String users = USERS_EDEFAULT;

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
	 * The cached value of the '{@link #getLogincontroller() <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogincontroller()
	 * @generated
	 * @ordered
	 */
	protected LoginController logincontroller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	public String getUsers() {
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsers(String newUsers) {
		String oldUsers = users;
		users = newUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__USERS, oldUsers, users));
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
	public NotificationChain basicSetLogincontroller(LoginController newLogincontroller, NotificationChain msgs) {
		LoginController oldLogincontroller = logincontroller;
		logincontroller = newLogincontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, oldLogincontroller, newLogincontroller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogincontroller(LoginController newLogincontroller) {
		if (newLogincontroller != logincontroller) {
			NotificationChain msgs = null;
			if (logincontroller != null)
				msgs = ((InternalEObject)logincontroller).eInverseRemove(this, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, LoginController.class, msgs);
			if (newLogincontroller != null)
				msgs = ((InternalEObject)newLogincontroller).eInverseAdd(this, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, LoginController.class, msgs);
			msgs = basicSetLogincontroller(newLogincontroller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, newLogincontroller, newLogincontroller));
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
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, DatalayerPackage.DATABASE__USERHANDLER, Database.class, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, DatalayerPackage.DATABASE__USERHANDLER, Database.class, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER_HANDLER__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public User addGuestDB(PaymentInfo paymentInfo, Guest user) {
		//Not sure this should have paymentinfo
		
		for (User existingUsers : getDatabase().getUserDB()) {
			if (user.getEmail() == existingUsers.getEmail()) {
				return existingUsers;
			}
		}
		
		getDatabase().getUserDB().add(user);
		return user;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendEmailVerification(String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEmailValid(String email) {
		// TODO: implement this method
		  String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
          java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
          java.util.regex.Matcher m = p.matcher(email);
          if (m.matches()){
        	   return true; 
          }else if(!m.matches()){
        	  return false;
          }else{
        	  throw new UnsupportedOperationException();
          } 
		// Ensure that you remove @generated or mark it @generated NOT
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Employee identifyUser(int employeeID) {
		for (Employee emp : getDatabase().getEmployeeDB()) {
			if (emp.getID() == employeeID) 
				return emp;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public User AddNewGuest(String email) {
		for (User existingUsers : getDatabase().getUserDB()) {
			if (email == existingUsers.getEmail()) {
				return existingUsers;
			}
		}
		
		
		Guest newGuest = BuissnesslayerFactoryImpl.init().createGuest();
		newGuest.setEmail(email);
		
		getDatabase().getUserDB().add(newGuest);
		return newGuest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Employee CreateEmployee(int ID) {
			Employee newEmp = BuissnesslayerFactoryImpl.eINSTANCE.createEmployee();
			newEmp.setBookinghandler(getLogincontroller().getGuicontroller().getBookinghandler());
			newEmp.setID(ID);
			getDatabase().getEmployeeDB().add(newEmp);
			return newEmp;
		}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Guest identifyUser(String email) {
		for (Guest guest : getDatabase().getUserDB()) {
			if (guest.getEmail() == email) 
				return guest;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				if (database != null)
					msgs = ((InternalEObject)database).eInverseRemove(this, DatalayerPackage.DATABASE__USERHANDLER, Database.class, msgs);
				return basicSetDatabase((Database)otherEnd, msgs);
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				if (logincontroller != null)
					msgs = ((InternalEObject)logincontroller).eInverseRemove(this, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, LoginController.class, msgs);
				return basicSetLogincontroller((LoginController)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				return basicSetDatabase(null, msgs);
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				return basicSetLogincontroller(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				if (resolve) return getLogincontroller();
				return basicGetLogincontroller();
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
				setUsers((String)newValue);
				return;
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				setDatabase((Database)newValue);
				return;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)newValue);
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
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				setDatabase((Database)null);
				return;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)null);
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
				return USERS_EDEFAULT == null ? users != null : !USERS_EDEFAULT.equals(users);
			case BuissnesslayerPackage.USER_HANDLER__DATABASE:
				return database != null;
			case BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER:
				return logincontroller != null;
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
			case BuissnesslayerPackage.USER_HANDLER___SEND_EMAIL_VERIFICATION__STRING:
				sendEmailVerification((String)arguments.get(0));
				return null;
			case BuissnesslayerPackage.USER_HANDLER___IS_EMAIL_VALID__STRING:
				return isEmailValid((String)arguments.get(0));
			case BuissnesslayerPackage.USER_HANDLER___IDENTIFY_USER__INT:
				return identifyUser((Integer)arguments.get(0));
			case BuissnesslayerPackage.USER_HANDLER___ADD_NEW_GUEST__STRING:
				return AddNewGuest((String)arguments.get(0));
			case BuissnesslayerPackage.USER_HANDLER___CREATE_EMPLOYEE__INT:
				return CreateEmployee((Integer)arguments.get(0));
			case BuissnesslayerPackage.USER_HANDLER___IDENTIFY_USER__STRING:
				return identifyUser((String)arguments.get(0));
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
