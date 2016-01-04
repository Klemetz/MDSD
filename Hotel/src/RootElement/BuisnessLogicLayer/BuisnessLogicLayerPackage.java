/**
 */
package RootElement.BuisnessLogicLayer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Buisness Logic Layer'"
 * @generated
 */
public interface BuisnessLogicLayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BuisnessLogicLayer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/BuisnessLogicLayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.BuisnessLogicLayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuisnessLogicLayerPackage eINSTANCE = RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.BuisnessLogicLayer.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.BuisnessLogicLayer.impl.PaymentInfoImpl
	 * @see RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl#getPaymentInfo()
	 * @generated
	 */
	int PAYMENT_INFO = 0;

	/**
	 * The feature id for the '<em><b>Payment Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO__PAYMENT_COMPLETE = 0;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO__CREDIT_CARD = 1;

	/**
	 * The feature id for the '<em><b>CVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO__CVV = 2;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO__EXPIRY_DATE = 3;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO__PAYMENTHANDLER = 4;

	/**
	 * The number of structural features of the '<em>Payment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Payment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.BuisnessLogicLayer.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.BuisnessLogicLayer.impl.PaymentHandlerImpl
	 * @see RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl#getPaymentHandler()
	 * @generated
	 */
	int PAYMENT_HANDLER = 1;

	/**
	 * The number of structural features of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Payment Infomake Payment Payment Infopayment Info Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER___PAYMENT_INFOMAKE_PAYMENT_PAYMENT_INFOPAYMENT_INFO_BOOKINGBOOKING = 0;

	/**
	 * The number of operations of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link RootElement.BuisnessLogicLayer.PaymentInfo <em>Payment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Info</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo
	 * @generated
	 */
	EClass getPaymentInfo();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.BuisnessLogicLayer.PaymentInfo#isPaymentComplete <em>Payment Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Complete</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo#isPaymentComplete()
	 * @see #getPaymentInfo()
	 * @generated
	 */
	EAttribute getPaymentInfo_PaymentComplete();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo#getCreditCard()
	 * @see #getPaymentInfo()
	 * @generated
	 */
	EAttribute getPaymentInfo_CreditCard();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getCVV <em>CVV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CVV</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo#getCVV()
	 * @see #getPaymentInfo()
	 * @generated
	 */
	EAttribute getPaymentInfo_CVV();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo#getExpiryDate()
	 * @see #getPaymentInfo()
	 * @generated
	 */
	EAttribute getPaymentInfo_ExpiryDate();

	/**
	 * Returns the meta object for the reference '{@link RootElement.BuisnessLogicLayer.PaymentInfo#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentInfo#getPaymenthandler()
	 * @see #getPaymentInfo()
	 * @generated
	 */
	EReference getPaymentInfo_Paymenthandler();

	/**
	 * Returns the meta object for class '{@link RootElement.BuisnessLogicLayer.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Handler</em>'.
	 * @see RootElement.BuisnessLogicLayer.PaymentHandler
	 * @generated
	 */
	EClass getPaymentHandler();

	/**
	 * Returns the meta object for the '{@link RootElement.BuisnessLogicLayer.PaymentHandler#PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking() <em>Payment Infomake Payment Payment Infopayment Info Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Infomake Payment Payment Infopayment Info Bookingbooking</em>' operation.
	 * @see RootElement.BuisnessLogicLayer.PaymentHandler#PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking()
	 * @generated
	 */
	EOperation getPaymentHandler__PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuisnessLogicLayerFactory getBuisnessLogicLayerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.BuisnessLogicLayer.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.BuisnessLogicLayer.impl.PaymentInfoImpl
		 * @see RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl#getPaymentInfo()
		 * @generated
		 */
		EClass PAYMENT_INFO = eINSTANCE.getPaymentInfo();

		/**
		 * The meta object literal for the '<em><b>Payment Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_INFO__PAYMENT_COMPLETE = eINSTANCE.getPaymentInfo_PaymentComplete();

		/**
		 * The meta object literal for the '<em><b>Credit Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_INFO__CREDIT_CARD = eINSTANCE.getPaymentInfo_CreditCard();

		/**
		 * The meta object literal for the '<em><b>CVV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_INFO__CVV = eINSTANCE.getPaymentInfo_CVV();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_INFO__EXPIRY_DATE = eINSTANCE.getPaymentInfo_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_INFO__PAYMENTHANDLER = eINSTANCE.getPaymentInfo_Paymenthandler();

		/**
		 * The meta object literal for the '{@link RootElement.BuisnessLogicLayer.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.BuisnessLogicLayer.impl.PaymentHandlerImpl
		 * @see RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl#getPaymentHandler()
		 * @generated
		 */
		EClass PAYMENT_HANDLER = eINSTANCE.getPaymentHandler();

		/**
		 * The meta object literal for the '<em><b>Payment Infomake Payment Payment Infopayment Info Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_HANDLER___PAYMENT_INFOMAKE_PAYMENT_PAYMENT_INFOPAYMENT_INFO_BOOKINGBOOKING = eINSTANCE.getPaymentHandler__PaymentInfomakePaymentPaymentInfopaymentInfoBookingbooking();

	}

} //BuisnessLogicLayerPackage
