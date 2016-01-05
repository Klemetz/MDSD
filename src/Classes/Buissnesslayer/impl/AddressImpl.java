/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.Address;
import Classes.Buissnesslayer.BuissnesslayerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.AddressImpl#getPostalNumber <em>Postal Number</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.AddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalNumber() <em>Postal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int POSTAL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostalNumber() <em>Postal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalNumber()
	 * @generated
	 * @ordered
	 */
	protected int postalNumber = POSTAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostalNumber() {
		return postalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalNumber(int newPostalNumber) {
		int oldPostalNumber = postalNumber;
		postalNumber = newPostalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER, oldPostalNumber, postalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuissnesslayerPackage.ADDRESS__STREET:
				return getStreet();
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				return getPostalNumber();
			case BuissnesslayerPackage.ADDRESS__CITY:
				return getCity();
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				return getCountry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuissnesslayerPackage.ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				setPostalNumber((Integer)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				setCountry((String)newValue);
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
			case BuissnesslayerPackage.ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				setPostalNumber(POSTAL_NUMBER_EDEFAULT);
				return;
			case BuissnesslayerPackage.ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case BuissnesslayerPackage.ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				return postalNumber != POSTAL_NUMBER_EDEFAULT;
			case BuissnesslayerPackage.ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (street: ");
		result.append(street);
		result.append(", postalNumber: ");
		result.append(postalNumber);
		result.append(", city: ");
		result.append(city);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
