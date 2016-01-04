/**
 */
package Classes.BuisnessLogicLayer;

import Classes.Buissnesslayer.Booking;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentHandler()
 * @model
 * @generated
 */
public interface PaymentHandler extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paymentInfoRequired="true" paymentInfoOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void makePayment(PaymentInfo paymentInfo, Booking booking);

} // PaymentHandler
