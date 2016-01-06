/**
 */
package Classes.Datalayer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Classes.Datalayer.DatalayerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data layer'"
 * @generated
 */
public interface DatalayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Datalayer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Datalayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Datalayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatalayerPackage eINSTANCE = Classes.Datalayer.impl.DatalayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Datalayer.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Datalayer.impl.DatabaseImpl
	 * @see Classes.Datalayer.impl.DatalayerPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>User DB</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USER_DB = 0;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USERHANDLER = 1;

	/**
	 * The feature id for the '<em><b>Employee DB</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__EMPLOYEE_DB = 2;

	/**
	 * The feature id for the '<em><b>Booking DB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BOOKING_DB = 3;

	/**
	 * The feature id for the '<em><b>Room DB</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ROOM_DB = 4;

	/**
	 * The feature id for the '<em><b>Extras DB</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__EXTRAS_DB = 5;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Classes.Datalayer.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see Classes.Datalayer.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Datalayer.Database#getUserDB <em>User DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User DB</em>'.
	 * @see Classes.Datalayer.Database#getUserDB()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_UserDB();

	/**
	 * Returns the meta object for the reference '{@link Classes.Datalayer.Database#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userhandler</em>'.
	 * @see Classes.Datalayer.Database#getUserhandler()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Userhandler();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Datalayer.Database#getEmployeeDB <em>Employee DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employee DB</em>'.
	 * @see Classes.Datalayer.Database#getEmployeeDB()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_EmployeeDB();

	/**
	 * Returns the meta object for the reference '{@link Classes.Datalayer.Database#getBookingDB <em>Booking DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking DB</em>'.
	 * @see Classes.Datalayer.Database#getBookingDB()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_BookingDB();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Datalayer.Database#getRoomDB <em>Room DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room DB</em>'.
	 * @see Classes.Datalayer.Database#getRoomDB()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_RoomDB();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Datalayer.Database#getExtrasDB <em>Extras DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extras DB</em>'.
	 * @see Classes.Datalayer.Database#getExtrasDB()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_ExtrasDB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatalayerFactory getDatalayerFactory();

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
		 * The meta object literal for the '{@link Classes.Datalayer.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Datalayer.impl.DatabaseImpl
		 * @see Classes.Datalayer.impl.DatalayerPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();
		/**
		 * The meta object literal for the '<em><b>User DB</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__USER_DB = eINSTANCE.getDatabase_UserDB();
		/**
		 * The meta object literal for the '<em><b>Userhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__USERHANDLER = eINSTANCE.getDatabase_Userhandler();
		/**
		 * The meta object literal for the '<em><b>Employee DB</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__EMPLOYEE_DB = eINSTANCE.getDatabase_EmployeeDB();
		/**
		 * The meta object literal for the '<em><b>Booking DB</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BOOKING_DB = eINSTANCE.getDatabase_BookingDB();
		/**
		 * The meta object literal for the '<em><b>Room DB</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__ROOM_DB = eINSTANCE.getDatabase_RoomDB();
		/**
		 * The meta object literal for the '<em><b>Extras DB</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__EXTRAS_DB = eINSTANCE.getDatabase_ExtrasDB();

	}

} //DatalayerPackage
