/**
 */
package Classes.Interactionlayer.impl;

import Classes.Buissnesslayer.BookingHandler;

import Classes.Buissnesslayer.Room;
import Classes.Interactionlayer.GUI;
import Classes.Interactionlayer.GUIController;
import Classes.Interactionlayer.InteractionlayerPackage;
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
 * An implementation of the model object '<em><b>GUI Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Interactionlayer.impl.GUIControllerImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link Classes.Interactionlayer.impl.GUIControllerImpl#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Interactionlayer.impl.GUIControllerImpl#getBookinghandler <em>Bookinghandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIControllerImpl extends MinimalEObjectImpl.Container implements GUIController {
	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected GUI display;

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
	 * The cached value of the '{@link #getBookinghandler() <em>Bookinghandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookinghandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookinghandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionlayerPackage.Literals.GUI_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUI getDisplay() {
		if (display != null && display.eIsProxy()) {
			InternalEObject oldDisplay = (InternalEObject)display;
			display = (GUI)eResolveProxy(oldDisplay);
			if (display != oldDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.GUI_CONTROLLER__DISPLAY, oldDisplay, display));
			}
		}
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUI basicGetDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(GUI newDisplay) {
		GUI oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.GUI_CONTROLLER__DISPLAY, oldDisplay, display));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler getBookinghandler() {
		if (bookinghandler != null && bookinghandler.eIsProxy()) {
			InternalEObject oldBookinghandler = (InternalEObject)bookinghandler;
			bookinghandler = (BookingHandler)eResolveProxy(oldBookinghandler);
			if (bookinghandler != oldBookinghandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER, oldBookinghandler, bookinghandler));
			}
		}
		return bookinghandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookinghandler() {
		return bookinghandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookinghandler(BookingHandler newBookinghandler) {
		BookingHandler oldBookinghandler = bookinghandler;
		bookinghandler = newBookinghandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER, oldBookinghandler, bookinghandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void showAvailability(int startDate, int endDate, Room roomType, int nrOfGuests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayError() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayExtras(EList<Character> extras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayParkings(EList<Integer> parkings) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayRoomTypes(EList<Integer> roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayRoomsGrid(EList<Integer> roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayPaymentOption() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayRoomsByID(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayBookingsByIDintbookingID(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayBookingCancelled() {
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
			case InteractionlayerPackage.GUI_CONTROLLER__DISPLAY:
				if (resolve) return getDisplay();
				return basicGetDisplay();
			case InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER:
				if (resolve) return getLogincontroller();
				return basicGetLogincontroller();
			case InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER:
				if (resolve) return getBookinghandler();
				return basicGetBookinghandler();
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
			case InteractionlayerPackage.GUI_CONTROLLER__DISPLAY:
				setDisplay((GUI)newValue);
				return;
			case InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)newValue);
				return;
			case InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER:
				setBookinghandler((BookingHandler)newValue);
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
			case InteractionlayerPackage.GUI_CONTROLLER__DISPLAY:
				setDisplay((GUI)null);
				return;
			case InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER:
				setLogincontroller((LoginController)null);
				return;
			case InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER:
				setBookinghandler((BookingHandler)null);
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
			case InteractionlayerPackage.GUI_CONTROLLER__DISPLAY:
				return display != null;
			case InteractionlayerPackage.GUI_CONTROLLER__LOGINCONTROLLER:
				return logincontroller != null;
			case InteractionlayerPackage.GUI_CONTROLLER__BOOKINGHANDLER:
				return bookinghandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteractionlayerPackage.GUI_CONTROLLER___SHOW_AVAILABILITY__INT_INT_ROOM_INT:
				showAvailability((Integer)arguments.get(0), (Integer)arguments.get(1), (Room)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ERROR:
				displayError();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_EXTRAS__ELIST:
				displayExtras((EList<Character>)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_PARKINGS__ELIST:
				displayParkings((EList<Integer>)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOM_TYPES__ELIST:
				displayRoomTypes((EList<Integer>)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOMS_GRID__ELIST:
				displayRoomsGrid((EList<Integer>)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION:
				displayPaymentOption();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOMS_BY_ID__INT:
				displayRoomsByID((Integer)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID__INT:
				displayBookingsByIDintbookingID((Integer)arguments.get(0));
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED:
				displayBookingCancelled();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GUIControllerImpl
