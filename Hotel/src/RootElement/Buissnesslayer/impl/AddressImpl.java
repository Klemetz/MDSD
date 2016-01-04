/**
 */
package RootElement.Buissnesslayer.impl;

import RootElement.Buissnesslayer.Address;
import RootElement.Buissnesslayer.BuissnesslayerPackage;

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
 *   <li>{@link RootElement.Buissnesslayer.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.impl.AddressImpl#getPostalNumber <em>Postal Number</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link RootElement.Buissnesslayer.impl.AddressImpl#getCountry <em>Country</em>}</li>
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
	protected static final char STREET_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected char street = STREET_EDEFAULT;

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
	protected static final char CITY_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected char city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final char COUNTRY_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected char country = COUNTRY_EDEFAULT;

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
	public char getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(char newStreet) {
		char oldStreet = street;
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
	public char getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(char newCity) {
		char oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(char newCountry) {
		char oldCountry = country;
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
				setStreet((Character)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				setPostalNumber((Integer)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__CITY:
				setCity((Character)newValue);
				return;
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				setCountry((Character)newValue);
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
				return street != STREET_EDEFAULT;
			case BuissnesslayerPackage.ADDRESS__POSTAL_NUMBER:
				return postalNumber != POSTAL_NUMBER_EDEFAULT;
			case BuissnesslayerPackage.ADDRESS__CITY:
				return city != CITY_EDEFAULT;
			case BuissnesslayerPackage.ADDRESS__COUNTRY:
				return country != COUNTRY_EDEFAULT;
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
