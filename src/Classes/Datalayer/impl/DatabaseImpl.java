/**
 */
package Classes.Datalayer.impl;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.Room;
import Classes.Datalayer.Database;
import Classes.Datalayer.DatalayerPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Datalayer.impl.DatabaseImpl#getUserDB <em>User DB</em>}</li>
 *   <li>{@link Classes.Datalayer.impl.DatabaseImpl#getEmployeeDB <em>Employee DB</em>}</li>
 *   <li>{@link Classes.Datalayer.impl.DatabaseImpl#getBookingDB <em>Booking DB</em>}</li>
 *   <li>{@link Classes.Datalayer.impl.DatabaseImpl#getRoomDB <em>Room DB</em>}</li>
 *   <li>{@link Classes.Datalayer.impl.DatabaseImpl#getExtrasDB <em>Extras DB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The cached value of the '{@link #getUserDB() <em>User DB</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDB()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userDB;

	/**
	 * The cached value of the '{@link #getEmployeeDB() <em>Employee DB</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeDB()
	 * @generated
	 * @ordered
	 */
	protected EList<String> employeeDB;
	/**
	 * The cached value of the '{@link #getBookingDB() <em>Booking DB</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDB()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookingDB;
	/**
	 * The cached value of the '{@link #getRoomDB() <em>Room DB</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomDB()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> roomDB;
	/**
	 * The cached value of the '{@link #getExtrasDB() <em>Extras DB</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrasDB()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extrasDB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatalayerPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUserDB() {
		if (userDB == null) {
			userDB = new EDataTypeUniqueEList<String>(String.class, this, DatalayerPackage.DATABASE__USER_DB);
		}
		return userDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmployeeDB() {
		if (employeeDB == null) {
			employeeDB = new EDataTypeUniqueEList<String>(String.class, this, DatalayerPackage.DATABASE__EMPLOYEE_DB);
		}
		return employeeDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookingDB() {
		if (bookingDB == null) {
			bookingDB = new EObjectResolvingEList<Booking>(Booking.class, this, DatalayerPackage.DATABASE__BOOKING_DB);
		}
		return bookingDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoomDB() {
		if (roomDB == null) {
			roomDB = new EObjectResolvingEList<Room>(Room.class, this, DatalayerPackage.DATABASE__ROOM_DB);
		}
		return roomDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtrasDB() {
		if (extrasDB == null) {
			extrasDB = new EDataTypeUniqueEList<String>(String.class, this, DatalayerPackage.DATABASE__EXTRAS_DB);
		}
		return extrasDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatalayerPackage.DATABASE__USER_DB:
				return getUserDB();
			case DatalayerPackage.DATABASE__EMPLOYEE_DB:
				return getEmployeeDB();
			case DatalayerPackage.DATABASE__BOOKING_DB:
				return getBookingDB();
			case DatalayerPackage.DATABASE__ROOM_DB:
				return getRoomDB();
			case DatalayerPackage.DATABASE__EXTRAS_DB:
				return getExtrasDB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatalayerPackage.DATABASE__USER_DB:
				getUserDB().clear();
				getUserDB().addAll((Collection<? extends String>)newValue);
				return;
			case DatalayerPackage.DATABASE__EMPLOYEE_DB:
				getEmployeeDB().clear();
				getEmployeeDB().addAll((Collection<? extends String>)newValue);
				return;
			case DatalayerPackage.DATABASE__BOOKING_DB:
				getBookingDB().clear();
				getBookingDB().addAll((Collection<? extends Booking>)newValue);
				return;
			case DatalayerPackage.DATABASE__ROOM_DB:
				getRoomDB().clear();
				getRoomDB().addAll((Collection<? extends Room>)newValue);
				return;
			case DatalayerPackage.DATABASE__EXTRAS_DB:
				getExtrasDB().clear();
				getExtrasDB().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatalayerPackage.DATABASE__USER_DB:
				getUserDB().clear();
				return;
			case DatalayerPackage.DATABASE__EMPLOYEE_DB:
				getEmployeeDB().clear();
				return;
			case DatalayerPackage.DATABASE__BOOKING_DB:
				getBookingDB().clear();
				return;
			case DatalayerPackage.DATABASE__ROOM_DB:
				getRoomDB().clear();
				return;
			case DatalayerPackage.DATABASE__EXTRAS_DB:
				getExtrasDB().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatalayerPackage.DATABASE__USER_DB:
				return userDB != null && !userDB.isEmpty();
			case DatalayerPackage.DATABASE__EMPLOYEE_DB:
				return employeeDB != null && !employeeDB.isEmpty();
			case DatalayerPackage.DATABASE__BOOKING_DB:
				return bookingDB != null && !bookingDB.isEmpty();
			case DatalayerPackage.DATABASE__ROOM_DB:
				return roomDB != null && !roomDB.isEmpty();
			case DatalayerPackage.DATABASE__EXTRAS_DB:
				return extrasDB != null && !extrasDB.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (userDB: ");
		result.append(userDB);
		result.append(", employeeDB: ");
		result.append(employeeDB);
		result.append(", extrasDB: ");
		result.append(extrasDB);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
