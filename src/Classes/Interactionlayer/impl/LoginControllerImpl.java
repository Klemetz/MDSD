/**
 */
package Classes.Interactionlayer.impl;

import Classes.BuisnessLogicLayer.PaymentHandler;
import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;
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
 * An implementation of the model object '<em><b>Login Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Interactionlayer.impl.LoginControllerImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link Classes.Interactionlayer.impl.LoginControllerImpl#getLoginController <em>Login Controller</em>}</li>
 *   <li>{@link Classes.Interactionlayer.impl.LoginControllerImpl#getPaymenthandler <em>Paymenthandler</em>}</li>
 *   <li>{@link Classes.Interactionlayer.impl.LoginControllerImpl#getUserhandler <em>Userhandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginControllerImpl extends MinimalEObjectImpl.Container implements LoginController {
	/**
	 * The cached value of the '{@link #getCurrentUser() <em>Current User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentUser()
	 * @generated
	 * @ordered
	 */
	protected User currentUser;

	/**
	 * The cached value of the '{@link #getLoginController() <em>Login Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginController()
	 * @generated
	 * @ordered
	 */
	protected LoginController loginController;

	/**
	 * The cached value of the '{@link #getPaymenthandler() <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymenthandler()
	 * @generated
	 * @ordered
	 */
	protected PaymentHandler paymenthandler;

	/**
	 * The cached value of the '{@link #getUserhandler() <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserhandler()
	 * @generated
	 * @ordered
	 */
	protected UserHandler userhandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionlayerPackage.Literals.LOGIN_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCurrentUser() {
		if (currentUser != null && currentUser.eIsProxy()) {
			InternalEObject oldCurrentUser = (InternalEObject)currentUser;
			currentUser = (User)eResolveProxy(oldCurrentUser);
			if (currentUser != oldCurrentUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER, oldCurrentUser, currentUser));
			}
		}
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCurrentUser() {
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUser(User newCurrentUser) {
		User oldCurrentUser = currentUser;
		currentUser = newCurrentUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER, oldCurrentUser, currentUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController getLoginController() {
		if (loginController != null && loginController.eIsProxy()) {
			InternalEObject oldLoginController = (InternalEObject)loginController;
			loginController = (LoginController)eResolveProxy(oldLoginController);
			if (loginController != oldLoginController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER, oldLoginController, loginController));
			}
		}
		return loginController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController basicGetLoginController() {
		return loginController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginController(LoginController newLoginController) {
		LoginController oldLoginController = loginController;
		loginController = newLoginController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER, oldLoginController, loginController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler getPaymenthandler() {
		if (paymenthandler != null && paymenthandler.eIsProxy()) {
			InternalEObject oldPaymenthandler = (InternalEObject)paymenthandler;
			paymenthandler = (PaymentHandler)eResolveProxy(oldPaymenthandler);
			if (paymenthandler != oldPaymenthandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
			}
		}
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler basicGetPaymenthandler() {
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymenthandler(PaymentHandler newPaymenthandler) {
		PaymentHandler oldPaymenthandler = paymenthandler;
		paymenthandler = newPaymenthandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler getUserhandler() {
		if (userhandler != null && userhandler.eIsProxy()) {
			InternalEObject oldUserhandler = (InternalEObject)userhandler;
			userhandler = (UserHandler)eResolveProxy(oldUserhandler);
			if (userhandler != oldUserhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, oldUserhandler, userhandler));
			}
		}
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler basicGetUserhandler() {
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserhandler(UserHandler newUserhandler, NotificationChain msgs) {
		UserHandler oldUserhandler = userhandler;
		userhandler = newUserhandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, oldUserhandler, newUserhandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserhandler(UserHandler newUserhandler) {
		if (newUserhandler != userhandler) {
			NotificationChain msgs = null;
			if (userhandler != null)
				msgs = ((InternalEObject)userhandler).eInverseRemove(this, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, UserHandler.class, msgs);
			if (newUserhandler != null)
				msgs = ((InternalEObject)newUserhandler).eInverseAdd(this, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, UserHandler.class, msgs);
			msgs = basicSetUserhandler(newUserhandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER, newUserhandler, newUserhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean loginEmployee(int ID) {
		
	
		User result = getUserhandler().checkEmployeeID(ID);
		if (result != null) {
			currentUser = result;
			return true;
			
		}
		currentUser = null;
		return false;
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean loginGuest(int bookingID) {
		
		User result = getUserhandler().AddNewGuest()));
		if (result != null) {
			currentUser = result;
			return true;
			
		}
		currentUser = null;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSingletonController() {
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
	 * @generated NOT
	 */
	public User loginCreateGuest(String email, Booking booking) {
		
		//getUserHandler().addGuestDB(new GuestImpl());
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				if (userhandler != null)
					msgs = ((InternalEObject)userhandler).eInverseRemove(this, BuissnesslayerPackage.USER_HANDLER__LOGINCONTROLLER, UserHandler.class, msgs);
				return basicSetUserhandler((UserHandler)otherEnd, msgs);
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
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				return basicSetUserhandler(null, msgs);
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
			case InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER:
				if (resolve) return getCurrentUser();
				return basicGetCurrentUser();
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				if (resolve) return getLoginController();
				return basicGetLoginController();
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				if (resolve) return getPaymenthandler();
				return basicGetPaymenthandler();
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				if (resolve) return getUserhandler();
				return basicGetUserhandler();
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
			case InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER:
				setCurrentUser((User)newValue);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				setLoginController((LoginController)newValue);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)newValue);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				setUserhandler((UserHandler)newValue);
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
			case InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER:
				setCurrentUser((User)null);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				setLoginController((LoginController)null);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)null);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				setUserhandler((UserHandler)null);
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
			case InteractionlayerPackage.LOGIN_CONTROLLER__CURRENT_USER:
				return currentUser != null;
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				return loginController != null;
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				return paymenthandler != null;
			case InteractionlayerPackage.LOGIN_CONTROLLER__USERHANDLER:
				return userhandler != null;
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
			case InteractionlayerPackage.LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT:
				return loginEmployee((Integer)arguments.get(0));
			case InteractionlayerPackage.LOGIN_CONTROLLER___LOGIN_GUEST__INT:
				return loginGuest((Integer)arguments.get(0));
			case InteractionlayerPackage.LOGIN_CONTROLLER___GET_SINGLETON_CONTROLLER:
				getSingletonController();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___CREATE_SINGLETON_HANDLER:
				createSingletonHandler();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___LOGIN_CREATE_GUEST__STRING_BOOKING:
				return loginCreateGuest((String)arguments.get(0), (Booking)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LoginControllerImpl
