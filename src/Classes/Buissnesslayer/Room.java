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
 *   <li>{@link Classes.Buissnesslayer.Room#getTyperoomType <em>Typeroom Type</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Typeroom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeroom Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeroom Type</em>' attribute.
	 * @see #setTyperoomType(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getRoom_TyperoomType()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Type : roomType'"
	 * @generated
	 */
	int getTyperoomType();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Room#getTyperoomType <em>Typeroom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeroom Type</em>' attribute.
	 * @see #getTyperoomType()
	 * @generated
	 */
	void setTyperoomType(int value);

} // Room
