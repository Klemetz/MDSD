/**
 */
package Classes.BuisnessLogicLayer.impl;

import Classes.BuisnessLogicLayer.BuisnessLogicLayerPackage;
import Classes.BuisnessLogicLayer.PaymentHandler;
import Classes.BuisnessLogicLayer.PaymentInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.BuisnessLogicLayer.impl.PaymentInfoImpl#isPaymentComplete <em>Payment Complete</em>}</li>
 *   <li>{@link Classes.BuisnessLogicLayer.impl.PaymentInfoImpl#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link Classes.BuisnessLogicLayer.impl.PaymentInfoImpl#getCVV <em>CVV</em>}</li>
 *   <li>{@link Classes.BuisnessLogicLayer.impl.PaymentInfoImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link Classes.BuisnessLogicLayer.impl.PaymentInfoImpl#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentInfoImpl extends MinimalEObjectImpl.Container implements PaymentInfo {
	/**
	 * The default value of the '{@link #isPaymentComplete() <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAYMENT_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaymentComplete() <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean paymentComplete = PAYMENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditCard() <em>Credit Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCard()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_CARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreditCard() <em>Credit Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCard()
	 * @generated
	 * @ordered
	 */
	protected int creditCard = CREDIT_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVV() <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVV()
	 * @generated
	 * @ordered
	 */
	protected static final int CVV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCVV() <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVV()
	 * @generated
	 * @ordered
	 */
	protected int cvv = CVV_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRY_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected int expiryDate = EXPIRY_DATE_EDEFAULT;

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
	protected PaymentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuisnessLogicLayerPackage.Literals.PAYMENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaymentComplete() {
		return paymentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentComplete(boolean newPaymentComplete) {
		boolean oldPaymentComplete = paymentComplete;
		paymentComplete = newPaymentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENT_COMPLETE, oldPaymentComplete, paymentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(int newCreditCard) {
		int oldCreditCard = creditCard;
		creditCard = newCreditCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuisnessLogicLayerPackage.PAYMENT_INFO__CREDIT_CARD, oldCreditCard, creditCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCVV() {
		return cvv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVV(int newCVV) {
		int oldCVV = cvv;
		cvv = newCVV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuisnessLogicLayerPackage.PAYMENT_INFO__CVV, oldCVV, cvv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryDate(int newExpiryDate) {
		int oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuisnessLogicLayerPackage.PAYMENT_INFO__EXPIRY_DATE, oldExpiryDate, expiryDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENT_COMPLETE:
				return isPaymentComplete();
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CREDIT_CARD:
				return getCreditCard();
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CVV:
				return getCVV();
			case BuisnessLogicLayerPackage.PAYMENT_INFO__EXPIRY_DATE:
				return getExpiryDate();
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER:
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
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENT_COMPLETE:
				setPaymentComplete((Boolean)newValue);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CREDIT_CARD:
				setCreditCard((Integer)newValue);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CVV:
				setCVV((Integer)newValue);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__EXPIRY_DATE:
				setExpiryDate((Integer)newValue);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER:
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
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENT_COMPLETE:
				setPaymentComplete(PAYMENT_COMPLETE_EDEFAULT);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CREDIT_CARD:
				setCreditCard(CREDIT_CARD_EDEFAULT);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CVV:
				setCVV(CVV_EDEFAULT);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER:
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
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENT_COMPLETE:
				return paymentComplete != PAYMENT_COMPLETE_EDEFAULT;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CREDIT_CARD:
				return creditCard != CREDIT_CARD_EDEFAULT;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__CVV:
				return cvv != CVV_EDEFAULT;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__EXPIRY_DATE:
				return expiryDate != EXPIRY_DATE_EDEFAULT;
			case BuisnessLogicLayerPackage.PAYMENT_INFO__PAYMENTHANDLER:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PaymentComplete: ");
		result.append(paymentComplete);
		result.append(", CreditCard: ");
		result.append(creditCard);
		result.append(", CVV: ");
		result.append(cvv);
		result.append(", ExpiryDate: ");
		result.append(expiryDate);
		result.append(')');
		return result.toString();
	}

} //PaymentInfoImpl
