/**
 */
package RootElement.Interactionlayer.impl;

import RootElement.Buissnesslayer.BookingHandler;

import RootElement.Interactionlayer.GUI;
import RootElement.Interactionlayer.GUIController;
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
 * An implementation of the model object '<em><b>GUI Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Interactionlayer.impl.GUIControllerImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.impl.GUIControllerImpl#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link RootElement.Interactionlayer.impl.GUIControllerImpl#getBookinghandler <em>Bookinghandler</em>}</li>
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
	public void showAvailabilitystartDateendDateroomTypeNrOfGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayErrorstringerrorMsg() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayExtrasListextrasExtras() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayParkingsListparkingsParkings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void displayRoomTypesListroomTypeRoomType() {
		System.out.println("Select room type");
		System.out.println("1 = Economy");
		System.out.println("2 = Business");
		System.out.println("3 = Luxury");
		System.out.println("4 = Suite");
		String input = System.console().readLine();
		//return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayRoomsGridListRoomroomType() {
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
	public void displayRoomsByIDintbookingID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayBookingsByIDintbookingID() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteractionlayerPackage.GUI_CONTROLLER___SHOW_AVAILABILITYSTART_DATEEND_DATEROOM_TYPE_NR_OF_GUESTS:
				showAvailabilitystartDateendDateroomTypeNrOfGuests();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ERRORSTRINGERROR_MSG:
				displayErrorstringerrorMsg();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_EXTRAS_LISTEXTRAS_EXTRAS:
				displayExtrasListextrasExtras();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_PARKINGS_LISTPARKINGS_PARKINGS:
				displayParkingsListparkingsParkings();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOM_TYPES_LISTROOM_TYPE_ROOM_TYPE:
				displayRoomTypesListroomTypeRoomType();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOMS_GRID_LIST_ROOMROOM_TYPE:
				displayRoomsGridListRoomroomType();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION:
				displayPaymentOption();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_ROOMS_BY_IDINTBOOKING_ID:
				displayRoomsByIDintbookingID();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID:
				displayBookingsByIDintbookingID();
				return null;
			case InteractionlayerPackage.GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED:
				displayBookingCancelled();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GUIControllerImpl
