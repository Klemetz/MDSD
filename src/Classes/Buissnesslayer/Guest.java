/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.Guest#getWrokAround <em>Wrok Around</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends User {

	/**
	 * Returns the value of the '<em><b>Wrok Around</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrok Around</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrok Around</em>' attribute list.
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getGuest_WrokAround()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Integer> getWrokAround();

} // Guest
