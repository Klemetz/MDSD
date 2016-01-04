/**
 */
package RootElement.BuisnessLogicLayer.impl;

import RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage;
import RootElement.BuisnessLogicLayer.PaymentHandler;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuisnessLogicLayerPackage.Literals.PAYMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking() {
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
			case BuisnessLogicLayerPackage.PAYMENT_HANDLER___PAYMENT_INFOMAKE_PAYMENT_PAYMENT_INFOPAYMENT_INFO_BOOKINGBOOKING:
				PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentHandlerImpl
