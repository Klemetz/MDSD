/**
 */
package Classes.Interactionlayer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Interactionlayer.InteractionlayerPackage
 * @generated
 */
public interface InteractionlayerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionlayerFactory eINSTANCE = Classes.Interactionlayer.impl.InteractionlayerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI</em>'.
	 * @generated
	 */
	GUI createGUI();

	/**
	 * Returns a new object of class '<em>GUI Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Controller</em>'.
	 * @generated
	 */
	GUIController createGUIController();

	/**
	 * Returns a new object of class '<em>Login Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Controller</em>'.
	 * @generated
	 */
	LoginController createLoginController();

	/**
	 * Returns a new object of class '<em>Login Controller Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Controller Data Type1</em>'.
	 * @generated
	 */
	LoginController_DataType1 createLoginController_DataType1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionlayerPackage getInteractionlayerPackage();

} //InteractionlayerFactory
