/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.Guest;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intbookRoomBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBookingBookingoldBookingBookingnewBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBookingBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attemptCheckInBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attemptCheckOutBookingbooking() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BuissnesslayerPackage.GUEST___INTBOOK_ROOM_BOOKINGBOOKING:
				intbookRoomBookingbooking();
				return null;
			case BuissnesslayerPackage.GUEST___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING:
				changeBookingBookingoldBookingBookingnewBooking();
				return null;
			case BuissnesslayerPackage.GUEST___CANCEL_BOOKING_BOOKINGBOOKING:
				cancelBookingBookingbooking();
				return null;
			case BuissnesslayerPackage.GUEST___ATTEMPT_CHECK_IN_BOOKINGBOOKING:
				attemptCheckInBookingbooking();
				return null;
			case BuissnesslayerPackage.GUEST___ATTEMPT_CHECK_OUT_BOOKINGBOOKING:
				attemptCheckOutBookingbooking();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuestImpl
