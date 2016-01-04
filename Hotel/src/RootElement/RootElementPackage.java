/**
 */
package RootElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see RootElement.RootElementFactory
 * @model kind="package"
 * @generated
 */
public interface RootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementPackage eINSTANCE = RootElement.impl.RootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.impl.Interaction1Impl <em>Interaction1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.Interaction1Impl
	 * @see RootElement.impl.RootElementPackageImpl#getInteraction1()
	 * @generated
	 */
	int INTERACTION1 = 0;

	/**
	 * The number of structural features of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.Interaction2Impl <em>Interaction2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.Interaction2Impl
	 * @see RootElement.impl.RootElementPackageImpl#getInteraction2()
	 * @generated
	 */
	int INTERACTION2 = 1;

	/**
	 * The number of structural features of the '<em>Interaction2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Interaction1 <em>Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction1</em>'.
	 * @see RootElement.Interaction1
	 * @generated
	 */
	EClass getInteraction1();

	/**
	 * Returns the meta object for class '{@link RootElement.Interaction2 <em>Interaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction2</em>'.
	 * @see RootElement.Interaction2
	 * @generated
	 */
	EClass getInteraction2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootElementFactory getRootElementFactory();

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
		 * The meta object literal for the '{@link RootElement.impl.Interaction1Impl <em>Interaction1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.Interaction1Impl
		 * @see RootElement.impl.RootElementPackageImpl#getInteraction1()
		 * @generated
		 */
		EClass INTERACTION1 = eINSTANCE.getInteraction1();

		/**
		 * The meta object literal for the '{@link RootElement.impl.Interaction2Impl <em>Interaction2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.Interaction2Impl
		 * @see RootElement.impl.RootElementPackageImpl#getInteraction2()
		 * @generated
		 */
		EClass INTERACTION2 = eINSTANCE.getInteraction2();

	}

} //RootElementPackage
