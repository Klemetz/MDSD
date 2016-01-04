/**
 */
package RootElement.Buissnesslayer.impl;

import RootElement.Buissnesslayer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuissnesslayerFactoryImpl extends EFactoryImpl implements BuissnesslayerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuissnesslayerFactory init() {
		try {
			BuissnesslayerFactory theBuissnesslayerFactory = (BuissnesslayerFactory)EPackage.Registry.INSTANCE.getEFactory(BuissnesslayerPackage.eNS_URI);
			if (theBuissnesslayerFactory != null) {
				return theBuissnesslayerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuissnesslayerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuissnesslayerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BuissnesslayerPackage.ROOM: return createRoom();
			case BuissnesslayerPackage.BOOKING: return createBooking();
			case BuissnesslayerPackage.BOOKING_HANDLER: return createBookingHandler();
			case BuissnesslayerPackage._ABSTRACT_USER: return create_AbstractUser();
			case BuissnesslayerPackage.USER_HANDLER: return createUserHandler();
			case BuissnesslayerPackage.ADDRESS: return createAddress();
			case BuissnesslayerPackage.GUEST: return createGuest();
			case BuissnesslayerPackage.EMPLOYEE: return createEmployee();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler createBookingHandler() {
		BookingHandlerImpl bookingHandler = new BookingHandlerImpl();
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _AbstractUser create_AbstractUser() {
		_AbstractUserImpl _AbstractUser = new _AbstractUserImpl();
		return _AbstractUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler createUserHandler() {
		UserHandlerImpl userHandler = new UserHandlerImpl();
		return userHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuissnesslayerPackage getBuissnesslayerPackage() {
		return (BuissnesslayerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuissnesslayerPackage getPackage() {
		return BuissnesslayerPackage.eINSTANCE;
	}

} //BuissnesslayerFactoryImpl
