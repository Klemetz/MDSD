/**
 */
package Classes.Interactionlayer.impl;

import Classes.Interactionlayer.*;

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
public class InteractionlayerFactoryImpl extends EFactoryImpl implements InteractionlayerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionlayerFactory init() {
		try {
			InteractionlayerFactory theInteractionlayerFactory = (InteractionlayerFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionlayerPackage.eNS_URI);
			if (theInteractionlayerFactory != null) {
				return theInteractionlayerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionlayerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionlayerFactoryImpl() {
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
			case InteractionlayerPackage.GUI: return createGUI();
			case InteractionlayerPackage.GUI_CONTROLLER: return createGUIController();
			case InteractionlayerPackage.LOGIN_CONTROLLER: return createLoginController();
			case InteractionlayerPackage.LOGIN_CONTROLLER_DATA_TYPE1: return createLoginController_DataType1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUI createGUI() {
		GUIImpl gui = new GUIImpl();
		return gui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIController createGUIController() {
		GUIControllerImpl guiController = new GUIControllerImpl();
		return guiController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController createLoginController() {
		LoginControllerImpl loginController = new LoginControllerImpl();
		return loginController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController_DataType1 createLoginController_DataType1() {
		LoginController_DataType1Impl loginController_DataType1 = new LoginController_DataType1Impl();
		return loginController_DataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionlayerPackage getInteractionlayerPackage() {
		return (InteractionlayerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionlayerPackage getPackage() {
		return InteractionlayerPackage.eINSTANCE;
	}

} //InteractionlayerFactoryImpl
