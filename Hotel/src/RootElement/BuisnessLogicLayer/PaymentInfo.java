/**
 */
package RootElement.BuisnessLogicLayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.BuisnessLogicLayer.PaymentInfo#isPaymentComplete <em>Payment Complete</em>}</li>
 *   <li>{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCVV <em>CVV</em>}</li>
 *   <li>{@link RootElement.BuisnessLogicLayer.PaymentInfo#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link RootElement.BuisnessLogicLayer.PaymentInfo#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo()
 * @model
 * @generated
 */
public interface PaymentInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Complete</em>' attribute.
	 * @see #setPaymentComplete(boolean)
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo_PaymentComplete()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaymentComplete();

	/**
	 * Sets the value of the '{@link RootElement.BuisnessLogicLayer.PaymentInfo#isPaymentComplete <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Complete</em>' attribute.
	 * @see #isPaymentComplete()
	 * @generated
	 */
	void setPaymentComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Credit Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card</em>' attribute.
	 * @see #setCreditCard(int)
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo_CreditCard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCreditCard();

	/**
	 * Sets the value of the '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCreditCard <em>Credit Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card</em>' attribute.
	 * @see #getCreditCard()
	 * @generated
	 */
	void setCreditCard(int value);

	/**
	 * Returns the value of the '<em><b>CVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CVV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVV</em>' attribute.
	 * @see #setCVV(int)
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo_CVV()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCVV();

	/**
	 * Sets the value of the '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCVV <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CVV</em>' attribute.
	 * @see #getCVV()
	 * @generated
	 */
	void setCVV(int value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(int)
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo_ExpiryDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpiryDate();

	/**
	 * Sets the value of the '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(int value);

	/**
	 * Returns the value of the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymenthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenthandler</em>' reference.
	 * @see #setPaymenthandler(PaymentHandler)
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#getPaymentInfo_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getPaymenthandler <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenthandler</em>' reference.
	 * @see #getPaymenthandler()
	 * @generated
	 */
	void setPaymenthandler(PaymentHandler value);

} // PaymentInfo
