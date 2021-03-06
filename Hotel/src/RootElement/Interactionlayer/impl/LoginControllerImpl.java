/**
 */
package RootElement.Interactionlayer.impl;

import RootElement.BuisnessLogicLayer.PaymentHandler;

import RootElement.Buissnesslayer._AbstractUser;

import RootElement.Interactionlayer.InteractionlayerPackage;
import RootElement.Interactionlayer.LoginController;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link RootElement.Interactionlayer.impl.LoginControllerImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.impl.LoginControllerImpl#getLoginController <em>Login Controller</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.impl.LoginControllerImpl#getPaymenthandler <em>Paymenthandler</em>}</li>
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
	protected _AbstractUser currentUser;

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
	public _AbstractUser getCurrentUser() {
		if (currentUser != null && currentUser.eIsProxy()) {
			InternalEObject oldCurrentUser = (InternalEObject)currentUser;
			currentUser = (_AbstractUser)eResolveProxy(oldCurrentUser);
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
	public _AbstractUser basicGetCurrentUser() {
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUser(_AbstractUser newCurrentUser) {
		_AbstractUser oldCurrentUser = currentUser;
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
	public void EmployeeloginEmployeeintIDstringpassword() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void GuestmakeGuestBookingLoginBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void GuestloginGuestintbookingIDstringname() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				setCurrentUser((_AbstractUser)newValue);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				setLoginController((LoginController)newValue);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)newValue);
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
				setCurrentUser((_AbstractUser)null);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__LOGIN_CONTROLLER:
				setLoginController((LoginController)null);
				return;
			case InteractionlayerPackage.LOGIN_CONTROLLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)null);
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
			case InteractionlayerPackage.LOGIN_CONTROLLER___EMPLOYEELOGIN_EMPLOYEEINT_IDSTRINGPASSWORD:
				EmployeeloginEmployeeintIDstringpassword();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___GUESTMAKE_GUEST_BOOKING_LOGIN_BOOKINGBOOKING:
				GuestmakeGuestBookingLoginBookingbooking();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___GUESTLOGIN_GUESTINTBOOKING_IDSTRINGNAME:
				GuestloginGuestintbookingIDstringname();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___GET_SINGLETON_CONTROLLER:
				getSingletonController();
				return null;
			case InteractionlayerPackage.LOGIN_CONTROLLER___CREATE_SINGLETON_HANDLER:
				createSingletonHandler();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LoginControllerImpl
