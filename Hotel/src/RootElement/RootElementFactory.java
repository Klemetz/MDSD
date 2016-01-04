/**
 */
package RootElement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public interface RootElementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementFactory eINSTANCE = RootElement.impl.RootElementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interaction1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction1</em>'.
	 * @generated
	 */
	Interaction1 createInteraction1();

	/**
	 * Returns a new object of class '<em>Interaction2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction2</em>'.
	 * @generated
	 */
	Interaction2 createInteraction2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootElementPackage getRootElementPackage();

} //RootElementFactory
