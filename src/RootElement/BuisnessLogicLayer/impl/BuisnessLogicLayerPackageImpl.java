/**
 */
package RootElement.BuisnessLogicLayer.impl;

import RootElement.BuisnessLogicLayer.BuisnessLogicLayerFactory;
import RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage;
import RootElement.BuisnessLogicLayer.PaymentHandler;
import RootElement.BuisnessLogicLayer.PaymentInfo;

import RootElement.Buissnesslayer.BuissnesslayerPackage;

import RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl;

import RootElement.Datalayer.DatalayerPackage;

import RootElement.Datalayer.impl.DatalayerPackageImpl;

import RootElement.Interactionlayer.InteractionlayerPackage;

import RootElement.Interactionlayer.impl.InteractionlayerPackageImpl;

import RootElement.RootElementPackage;

import RootElement.impl.RootElementPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuisnessLogicLayerPackageImpl extends EPackageImpl implements BuisnessLogicLayerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentHandlerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuisnessLogicLayerPackageImpl() {
		super(eNS_URI, BuisnessLogicLayerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BuisnessLogicLayerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuisnessLogicLayerPackage init() {
		if (isInited) return (BuisnessLogicLayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI);

		// Obtain or create and register package
		BuisnessLogicLayerPackageImpl theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuisnessLogicLayerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuisnessLogicLayerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RootElementPackageImpl theRootElementPackage = (RootElementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI) instanceof RootElementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI) : RootElementPackage.eINSTANCE);
		DatalayerPackageImpl theDatalayerPackage = (DatalayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) instanceof DatalayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) : DatalayerPackage.eINSTANCE);
		BuissnesslayerPackageImpl theBuissnesslayerPackage = (BuissnesslayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) instanceof BuissnesslayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) : BuissnesslayerPackage.eINSTANCE);
		InteractionlayerPackageImpl theInteractionlayerPackage = (InteractionlayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) instanceof InteractionlayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) : InteractionlayerPackage.eINSTANCE);

		// Create package meta-data objects
		theBuisnessLogicLayerPackage.createPackageContents();
		theRootElementPackage.createPackageContents();
		theDatalayerPackage.createPackageContents();
		theBuissnesslayerPackage.createPackageContents();
		theInteractionlayerPackage.createPackageContents();

		// Initialize created meta-data
		theBuisnessLogicLayerPackage.initializePackageContents();
		theRootElementPackage.initializePackageContents();
		theDatalayerPackage.initializePackageContents();
		theBuissnesslayerPackage.initializePackageContents();
		theInteractionlayerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuisnessLogicLayerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuisnessLogicLayerPackage.eNS_URI, theBuisnessLogicLayerPackage);
		return theBuisnessLogicLayerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentInfo() {
		return paymentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentInfo_PaymentComplete() {
		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentInfo_CreditCard() {
		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentInfo_CVV() {
		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentInfo_ExpiryDate() {
		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentInfo_Paymenthandler() {
		return (EReference)paymentInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentHandler() {
		return paymentHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentHandler__MakePayment__PaymentInfo_Booking() {
		return paymentHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuisnessLogicLayerFactory getBuisnessLogicLayerFactory() {
		return (BuisnessLogicLayerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		paymentInfoEClass = createEClass(PAYMENT_INFO);
		createEAttribute(paymentInfoEClass, PAYMENT_INFO__PAYMENT_COMPLETE);
		createEAttribute(paymentInfoEClass, PAYMENT_INFO__CREDIT_CARD);
		createEAttribute(paymentInfoEClass, PAYMENT_INFO__CVV);
		createEAttribute(paymentInfoEClass, PAYMENT_INFO__EXPIRY_DATE);
		createEReference(paymentInfoEClass, PAYMENT_INFO__PAYMENTHANDLER);

		paymentHandlerEClass = createEClass(PAYMENT_HANDLER);
		createEOperation(paymentHandlerEClass, PAYMENT_HANDLER___MAKE_PAYMENT__PAYMENTINFO_BOOKING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BuissnesslayerPackage theBuissnesslayerPackage = (BuissnesslayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(paymentInfoEClass, PaymentInfo.class, "PaymentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentInfo_PaymentComplete(), ecorePackage.getEBoolean(), "PaymentComplete", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentInfo_CreditCard(), ecorePackage.getEInt(), "CreditCard", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentInfo_CVV(), ecorePackage.getEInt(), "CVV", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentInfo_ExpiryDate(), ecorePackage.getEInt(), "ExpiryDate", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPaymentInfo_Paymenthandler(), this.getPaymentHandler(), null, "paymenthandler", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentHandlerEClass, PaymentHandler.class, "PaymentHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPaymentHandler__MakePayment__PaymentInfo_Booking(), null, "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPaymentInfo(), "paymentInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBuissnesslayerPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Buisness Logic Layer"
		   });
	}

} //BuisnessLogicLayerPackageImpl
