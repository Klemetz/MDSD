/**
 */
package Classes.Interactionlayer.util;

import Classes.Interactionlayer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Interactionlayer.InteractionlayerPackage
 * @generated
 */
public class InteractionlayerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractionlayerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionlayerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InteractionlayerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionlayerSwitch<Adapter> modelSwitch =
		new InteractionlayerSwitch<Adapter>() {
			@Override
			public Adapter caseGUI(GUI object) {
				return createGUIAdapter();
			}
			@Override
			public Adapter caseGUIController(GUIController object) {
				return createGUIControllerAdapter();
			}
			@Override
			public Adapter caseLoginController(LoginController object) {
				return createLoginControllerAdapter();
			}
			@Override
			public Adapter caseLoginController_DataType1(LoginController_DataType1 object) {
				return createLoginController_DataType1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.Interactionlayer.GUI <em>GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Interactionlayer.GUI
	 * @generated
	 */
	public Adapter createGUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Interactionlayer.GUIController <em>GUI Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Interactionlayer.GUIController
	 * @generated
	 */
	public Adapter createGUIControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Interactionlayer.LoginController <em>Login Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Interactionlayer.LoginController
	 * @generated
	 */
	public Adapter createLoginControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Interactionlayer.LoginController_DataType1 <em>Login Controller Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Interactionlayer.LoginController_DataType1
	 * @generated
	 */
	public Adapter createLoginController_DataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InteractionlayerAdapterFactory
