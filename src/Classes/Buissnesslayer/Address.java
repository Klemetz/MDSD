/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Address#getPostalNumber <em>Postal Number</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Address#getCity <em>City</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Address#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getAddress_Street()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Postal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Number</em>' attribute.
	 * @see #setPostalNumber(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getAddress_PostalNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPostalNumber();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Address#getPostalNumber <em>Postal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Number</em>' attribute.
	 * @see #getPostalNumber()
	 * @generated
	 */
	void setPostalNumber(int value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getAddress_City()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getAddress_Country()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // Address
