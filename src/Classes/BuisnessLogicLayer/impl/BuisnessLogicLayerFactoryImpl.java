/**
 */
package Classes.BuisnessLogicLayer.impl;

import Classes.BuisnessLogicLayer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuisnessLogicLayerFactoryImpl extends EFactoryImpl implements BuisnessLogicLayerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuisnessLogicLayerFactory init() {
		try {
			BuisnessLogicLayerFactory theBuisnessLogicLayerFactory = (BuisnessLogicLayerFactory)EPackage.Registry.INSTANCE.getEFactory(BuisnessLogicLayerPackage.eNS_URI);
			if (theBuisnessLogicLayerFactory != null) {
				return theBuisnessLogicLayerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuisnessLogicLayerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuisnessLogicLayerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BuisnessLogicLayerPackage.PAYMENT_INFO: return createPaymentInfo();
			case BuisnessLogicLayerPackage.PAYMENT_HANDLER: return createPaymentHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentInfo createPaymentInfo() {
		PaymentInfoImpl paymentInfo = new PaymentInfoImpl();
		return paymentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler createPaymentHandler() {
		PaymentHandlerImpl paymentHandler = new PaymentHandlerImpl();
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuisnessLogicLayerPackage getBuisnessLogicLayerPackage() {
		return (BuisnessLogicLayerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuisnessLogicLayerPackage getPackage() {
		return BuisnessLogicLayerPackage.eINSTANCE;
	}

} //BuisnessLogicLayerFactoryImpl
