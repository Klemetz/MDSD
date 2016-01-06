/**
 */
package Classes.Datalayer;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.Employee;
import Classes.Buissnesslayer.Guest;
import Classes.Buissnesslayer.Room;
import Classes.Buissnesslayer.UserHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Datalayer.Database#getUserDB <em>User DB</em>}</li>
 *   <li>{@link Classes.Datalayer.Database#getUserhandler <em>Userhandler</em>}</li>
 *   <li>{@link Classes.Datalayer.Database#getEmployeeDB <em>Employee DB</em>}</li>
 *   <li>{@link Classes.Datalayer.Database#getBookingDB <em>Booking DB</em>}</li>
 *   <li>{@link Classes.Datalayer.Database#getRoomDB <em>Room DB</em>}</li>
 *   <li>{@link Classes.Datalayer.Database#getExtrasDB <em>Extras DB</em>}</li>
 * </ul>
 *
 * @see Classes.Datalayer.DatalayerPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {

	/**
	 * Returns the value of the '<em><b>User DB</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User DB</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User DB</em>' reference list.
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_UserDB()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Guest> getUserDB();

	/**
	 * Returns the value of the '<em><b>Userhandler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userhandler</em>' reference.
	 * @see #setUserhandler(UserHandler)
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_Userhandler()
	 * @see Classes.Buissnesslayer.UserHandler#getDatabase
	 * @model opposite="database" required="true" ordered="false"
	 * @generated
	 */
	UserHandler getUserhandler();

	/**
	 * Sets the value of the '{@link Classes.Datalayer.Database#getUserhandler <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userhandler</em>' reference.
	 * @see #getUserhandler()
	 * @generated
	 */
	void setUserhandler(UserHandler value);

	/**
	 * Returns the value of the '<em><b>Employee DB</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee DB</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee DB</em>' reference list.
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_EmployeeDB()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Employee> getEmployeeDB();

	/**
	 * Returns the value of the '<em><b>Booking DB</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking DB</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking DB</em>' reference list.
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_BookingDB()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBookingDB();

	/**
	 * Returns the value of the '<em><b>Room DB</b></em>' reference list.
	 * The list contents are of type {@link Classes.Buissnesslayer.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room DB</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room DB</em>' reference list.
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_RoomDB()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoomDB();

	/**
	 * Returns the value of the '<em><b>Extras DB</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extras DB</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extras DB</em>' attribute list.
	 * @see Classes.Datalayer.DatalayerPackage#getDatabase_ExtrasDB()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getExtrasDB();
} // Database
