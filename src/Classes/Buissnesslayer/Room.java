/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.Room#getRoomType <em>Room Type</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see #setRoomType(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomType();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Room#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(int value);

} // Room
