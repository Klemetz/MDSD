/**
 */
package RootElement.BuisnessLogicLayer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage
 * @generated
 */
public interface BuisnessLogicLayerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuisnessLogicLayerFactory eINSTANCE = RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Payment Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Info</em>'.
	 * @generated
	 */
	PaymentInfo createPaymentInfo();

	/**
	 * Returns a new object of class '<em>Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Handler</em>'.
	 * @generated
	 */
	PaymentHandler createPaymentHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuisnessLogicLayerPackage getBuisnessLogicLayerPackage();

} //BuisnessLogicLayerFactory
