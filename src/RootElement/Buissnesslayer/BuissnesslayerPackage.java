/**
 */
package RootElement.Buissnesslayer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see RootElement.Buissnesslayer.BuissnesslayerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Buissness layer'"
 * @generated
 */
public interface BuissnesslayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Buissnesslayer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Buissnesslayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Buissnesslayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuissnesslayerPackage eINSTANCE = RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.RoomImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Typeroom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPEROOM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.BookingImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 1;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__GUEST = 1;

	/**
	 * The feature id for the '<em><b>Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NR_OF_GUESTS = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 4;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__EXTRAS = 5;

	/**
	 * The feature id for the '<em><b>Parkings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PARKINGS = 6;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOMS = 7;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_IN = 8;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_OUT = 9;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT = 10;

	/**
	 * The feature id for the '<em><b>Payment Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_COMPLETE = 11;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM = 12;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.BookingHandlerImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBookingHandler()
	 * @generated
	 */
	int BOOKING_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__BOOKING = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__BOOKINGS = 1;

	/**
	 * The feature id for the '<em><b>Singleton Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__SINGLETON_BOOKING = 2;

	/**
	 * The feature id for the '<em><b>abstractuser</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__ABSTRACTUSER = 3;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__DATABASE = 4;

	/**
	 * The number of structural features of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Intfetch Availability Start Date End Date Room Type Nr Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___INTFETCH_AVAILABILITY_START_DATE_END_DATE_ROOM_TYPE_NR_OF_GUESTS = 0;

	/**
	 * The operation id for the '<em>Bookingfetch Bookingintbooking ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___BOOKINGFETCH_BOOKINGINTBOOKING_ID = 1;

	/**
	 * The operation id for the '<em>Attempt Book Room Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ATTEMPT_BOOK_ROOM_BOOKINGBOOKING = 2;

	/**
	 * The operation id for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CANCEL_BOOKING_BOOKINGBOOKING = 3;

	/**
	 * The operation id for the '<em>Change Booking Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHANGE_BOOKING_BOOKINGBOOKING = 4;

	/**
	 * The operation id for the '<em>Check In Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_IN_BOOKINGBOOKING = 5;

	/**
	 * The operation id for the '<em>Check Out Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_OUT_BOOKINGBOOKING = 6;

	/**
	 * The operation id for the '<em>Send Error Msg String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___SEND_ERROR_MSG_STRING = 7;

	/**
	 * The operation id for the '<em>Get Singleton Booking Booking Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___GET_SINGLETON_BOOKING_BOOKING_HANDLER = 8;

	/**
	 * The operation id for the '<em>Create Singleton Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CREATE_SINGLETON_HANDLER = 9;

	/**
	 * The operation id for the '<em>Fetch Available Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS = 10;

	/**
	 * The number of operations of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl._AbstractUserImpl <em>Abstract User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl._AbstractUserImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#get_AbstractUser()
	 * @generated
	 */
	int _ABSTRACT_USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Booking Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__BOOKING_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__LOGINCONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__USERHANDLER = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER__ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Abstract User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Enter Contact Data Stringname Emailemail Addressadress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___ENTER_CONTACT_DATA_STRINGNAME_EMAILEMAIL_ADDRESSADRESS = 0;

	/**
	 * The operation id for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___INTBOOK_ROOM_BOOKINGBOOKING = 1;

	/**
	 * The operation id for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = 2;

	/**
	 * The operation id for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___CANCEL_BOOKING_BOOKINGBOOKING = 3;

	/**
	 * The operation id for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___ATTEMPT_CHECK_IN_BOOKINGBOOKING = 4;

	/**
	 * The operation id for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = 5;

	/**
	 * The number of operations of the '<em>Abstract User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _ABSTRACT_USER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.UserHandlerImpl <em>User Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.UserHandlerImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUserHandler()
	 * @generated
	 */
	int USER_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__USERS = 0;

	/**
	 * The feature id for the '<em><b>Singleton User Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__SINGLETON_USER_HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__LOGINCONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__DATABASE = 3;

	/**
	 * The number of structural features of the '<em>User Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Guest DB Payment Infopayment Info Useruser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___ADD_GUEST_DB_PAYMENT_INFOPAYMENT_INFO_USERUSER = 0;

	/**
	 * The operation id for the '<em>Send Email Verification Stringemail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___SEND_EMAIL_VERIFICATION_STRINGEMAIL = 1;

	/**
	 * The operation id for the '<em>Get Singleton Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___GET_SINGLETON_HANDLER = 2;

	/**
	 * The operation id for the '<em>Create Singleton Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___CREATE_SINGLETON_HANDLER = 3;

	/**
	 * The number of operations of the '<em>User Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.AddressImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>Postal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.GuestImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 6;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___INTBOOK_ROOM_BOOKINGBOOKING = 0;

	/**
	 * The operation id for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = 1;

	/**
	 * The operation id for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CANCEL_BOOKING_BOOKINGBOOKING = 2;

	/**
	 * The operation id for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ATTEMPT_CHECK_IN_BOOKINGBOOKING = 3;

	/**
	 * The operation id for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = 4;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.Buissnesslayer.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Buissnesslayer.impl.EmployeeImpl
	 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___INTBOOK_ROOM_BOOKINGBOOKING = 0;

	/**
	 * The operation id for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = 1;

	/**
	 * The operation id for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CANCEL_BOOKING_BOOKINGBOOKING = 2;

	/**
	 * The operation id for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ATTEMPT_CHECK_IN_BOOKINGBOOKING = 3;

	/**
	 * The operation id for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = 4;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see RootElement.Buissnesslayer.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Room#getTyperoomType <em>Typeroom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeroom Type</em>'.
	 * @see RootElement.Buissnesslayer.Room#getTyperoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_TyperoomType();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see RootElement.Buissnesslayer.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getGuest()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Guest();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getNrOfGuests <em>Nr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Guests</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getNrOfGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NrOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extras</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getExtras()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Extras();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getParkings <em>Parkings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parkings</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getParkings()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Parkings();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rooms</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getRooms()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see RootElement.Buissnesslayer.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#isCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see RootElement.Buissnesslayer.Booking#isCheckedOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getPayment()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Payment();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Booking#isPaymentComplete <em>Payment Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Complete</em>'.
	 * @see RootElement.Buissnesslayer.Booking#isPaymentComplete()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PaymentComplete();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Buissnesslayer.Booking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see RootElement.Buissnesslayer.Booking#getRoom()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Room();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Handler</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler
	 * @generated
	 */
	EClass getBookingHandler();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler#getBooking()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Booking();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bookings</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler#getBookings()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Bookings();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.BookingHandler#getSingletonBooking <em>Singleton Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Singleton Booking</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler#getSingletonBooking()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_SingletonBooking();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Buissnesslayer.BookingHandler#get_abstractuser <em>abstractuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>abstractuser</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler#get_abstractuser()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler__abstractuser();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see RootElement.Buissnesslayer.BookingHandler#getDatabase()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Database();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#intfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests() <em>Intfetch Availability Start Date End Date Room Type Nr Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intfetch Availability Start Date End Date Room Type Nr Of Guests</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#intfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests()
	 * @generated
	 */
	EOperation getBookingHandler__IntfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#BookingfetchBookingintbookingID() <em>Bookingfetch Bookingintbooking ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bookingfetch Bookingintbooking ID</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#BookingfetchBookingintbookingID()
	 * @generated
	 */
	EOperation getBookingHandler__BookingfetchBookingintbookingID();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#attemptBookRoomBookingbooking() <em>Attempt Book Room Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Book Room Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#attemptBookRoomBookingbooking()
	 * @generated
	 */
	EOperation getBookingHandler__AttemptBookRoomBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#cancelBookingBookingbooking() <em>Cancel Booking Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#cancelBookingBookingbooking()
	 * @generated
	 */
	EOperation getBookingHandler__CancelBookingBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#changeBookingBookingbooking() <em>Change Booking Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#changeBookingBookingbooking()
	 * @generated
	 */
	EOperation getBookingHandler__ChangeBookingBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#checkInBookingbooking() <em>Check In Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#checkInBookingbooking()
	 * @generated
	 */
	EOperation getBookingHandler__CheckInBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#checkOutBookingbooking() <em>Check Out Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#checkOutBookingbooking()
	 * @generated
	 */
	EOperation getBookingHandler__CheckOutBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#sendErrorMsgString() <em>Send Error Msg String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Error Msg String</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#sendErrorMsgString()
	 * @generated
	 */
	EOperation getBookingHandler__SendErrorMsgString();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#getSingletonBookingBookingHandler() <em>Get Singleton Booking Booking Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Singleton Booking Booking Handler</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#getSingletonBookingBookingHandler()
	 * @generated
	 */
	EOperation getBookingHandler__GetSingletonBookingBookingHandler();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#createSingletonHandler() <em>Create Singleton Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Singleton Handler</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#createSingletonHandler()
	 * @generated
	 */
	EOperation getBookingHandler__CreateSingletonHandler();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.BookingHandler#fetchAvailableExtras() <em>Fetch Available Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Available Extras</em>' operation.
	 * @see RootElement.Buissnesslayer.BookingHandler#fetchAvailableExtras()
	 * @generated
	 */
	EOperation getBookingHandler__FetchAvailableExtras();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer._AbstractUser <em>Abstract User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract User</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser
	 * @generated
	 */
	EClass get_AbstractUser();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer._AbstractUser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getName()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EAttribute get_AbstractUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer._AbstractUser#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getEmail()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EAttribute get_AbstractUser_Email();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer._AbstractUser#getBookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Handler</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getBookingHandler()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EReference get_AbstractUser_BookingHandler();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer._AbstractUser#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getLogincontroller()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EReference get_AbstractUser_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer._AbstractUser#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userhandler</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getUserhandler()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EReference get_AbstractUser_Userhandler();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer._AbstractUser#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see RootElement.Buissnesslayer._AbstractUser#getAddress()
	 * @see #get_AbstractUser()
	 * @generated
	 */
	EReference get_AbstractUser_Address();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#enterContactDataStringnameEmailemailAddressadress() <em>Enter Contact Data Stringname Emailemail Addressadress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Contact Data Stringname Emailemail Addressadress</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#enterContactDataStringnameEmailemailAddressadress()
	 * @generated
	 */
	EOperation get_AbstractUser__EnterContactDataStringnameEmailemailAddressadress();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#intbookRoomBookingbooking() <em>Intbook Room Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#intbookRoomBookingbooking()
	 * @generated
	 */
	EOperation get_AbstractUser__IntbookRoomBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#changeBookingBookingoldBookingBookingnewBooking() <em>Change Booking Bookingold Booking Bookingnew Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#changeBookingBookingoldBookingBookingnewBooking()
	 * @generated
	 */
	EOperation get_AbstractUser__ChangeBookingBookingoldBookingBookingnewBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#cancelBookingBookingbooking() <em>Cancel Booking Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#cancelBookingBookingbooking()
	 * @generated
	 */
	EOperation get_AbstractUser__CancelBookingBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#attemptCheckInBookingbooking() <em>Attempt Check In Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#attemptCheckInBookingbooking()
	 * @generated
	 */
	EOperation get_AbstractUser__AttemptCheckInBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer._AbstractUser#attemptCheckOutBookingbooking() <em>Attempt Check Out Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer._AbstractUser#attemptCheckOutBookingbooking()
	 * @generated
	 */
	EOperation get_AbstractUser__AttemptCheckOutBookingbooking();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.UserHandler <em>User Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Handler</em>'.
	 * @see RootElement.Buissnesslayer.UserHandler
	 * @generated
	 */
	EClass getUserHandler();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.UserHandler#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users</em>'.
	 * @see RootElement.Buissnesslayer.UserHandler#getUsers()
	 * @see #getUserHandler()
	 * @generated
	 */
	EAttribute getUserHandler_Users();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.UserHandler#getSingletonUserHandler <em>Singleton User Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Singleton User Handler</em>'.
	 * @see RootElement.Buissnesslayer.UserHandler#getSingletonUserHandler()
	 * @see #getUserHandler()
	 * @generated
	 */
	EReference getUserHandler_SingletonUserHandler();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see RootElement.Buissnesslayer.UserHandler#getLogincontroller()
	 * @see #getUserHandler()
	 * @generated
	 */
	EReference getUserHandler_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see RootElement.Buissnesslayer.UserHandler#getDatabase()
	 * @see #getUserHandler()
	 * @generated
	 */
	EReference getUserHandler_Database();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.UserHandler#addGuestDBPaymentInfopaymentInfoUseruser() <em>Add Guest DB Payment Infopayment Info Useruser</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest DB Payment Infopayment Info Useruser</em>' operation.
	 * @see RootElement.Buissnesslayer.UserHandler#addGuestDBPaymentInfopaymentInfoUseruser()
	 * @generated
	 */
	EOperation getUserHandler__AddGuestDBPaymentInfopaymentInfoUseruser();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.UserHandler#sendEmailVerificationStringemail() <em>Send Email Verification Stringemail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Email Verification Stringemail</em>' operation.
	 * @see RootElement.Buissnesslayer.UserHandler#sendEmailVerificationStringemail()
	 * @generated
	 */
	EOperation getUserHandler__SendEmailVerificationStringemail();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.UserHandler#getSingletonHandler() <em>Get Singleton Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Singleton Handler</em>' operation.
	 * @see RootElement.Buissnesslayer.UserHandler#getSingletonHandler()
	 * @generated
	 */
	EOperation getUserHandler__GetSingletonHandler();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.UserHandler#createSingletonHandler() <em>Create Singleton Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Singleton Handler</em>' operation.
	 * @see RootElement.Buissnesslayer.UserHandler#createSingletonHandler()
	 * @generated
	 */
	EOperation getUserHandler__CreateSingletonHandler();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see RootElement.Buissnesslayer.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see RootElement.Buissnesslayer.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Address#getPostalNumber <em>Postal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Number</em>'.
	 * @see RootElement.Buissnesslayer.Address#getPostalNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostalNumber();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see RootElement.Buissnesslayer.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see RootElement.Buissnesslayer.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see RootElement.Buissnesslayer.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Guest#intbookRoomBookingbooking() <em>Intbook Room Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Guest#intbookRoomBookingbooking()
	 * @generated
	 */
	EOperation getGuest__IntbookRoomBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Guest#changeBookingBookingoldBookingBookingnewBooking() <em>Change Booking Bookingold Booking Bookingnew Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * @see RootElement.Buissnesslayer.Guest#changeBookingBookingoldBookingBookingnewBooking()
	 * @generated
	 */
	EOperation getGuest__ChangeBookingBookingoldBookingBookingnewBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Guest#cancelBookingBookingbooking() <em>Cancel Booking Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Guest#cancelBookingBookingbooking()
	 * @generated
	 */
	EOperation getGuest__CancelBookingBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Guest#attemptCheckInBookingbooking() <em>Attempt Check In Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Guest#attemptCheckInBookingbooking()
	 * @generated
	 */
	EOperation getGuest__AttemptCheckInBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Guest#attemptCheckOutBookingbooking() <em>Attempt Check Out Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Guest#attemptCheckOutBookingbooking()
	 * @generated
	 */
	EOperation getGuest__AttemptCheckOutBookingbooking();

	/**
	 * Returns the meta object for class '{@link RootElement.Buissnesslayer.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see RootElement.Buissnesslayer.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Employee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see RootElement.Buissnesslayer.Employee#getID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Buissnesslayer.Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see RootElement.Buissnesslayer.Employee#getPassword()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Password();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Employee#intbookRoomBookingbooking() <em>Intbook Room Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intbook Room Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Employee#intbookRoomBookingbooking()
	 * @generated
	 */
	EOperation getEmployee__IntbookRoomBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Employee#changeBookingBookingoldBookingBookingnewBooking() <em>Change Booking Bookingold Booking Bookingnew Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking Bookingold Booking Bookingnew Booking</em>' operation.
	 * @see RootElement.Buissnesslayer.Employee#changeBookingBookingoldBookingBookingnewBooking()
	 * @generated
	 */
	EOperation getEmployee__ChangeBookingBookingoldBookingBookingnewBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Employee#cancelBookingBookingbooking() <em>Cancel Booking Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Employee#cancelBookingBookingbooking()
	 * @generated
	 */
	EOperation getEmployee__CancelBookingBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Employee#attemptCheckInBookingbooking() <em>Attempt Check In Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check In Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Employee#attemptCheckInBookingbooking()
	 * @generated
	 */
	EOperation getEmployee__AttemptCheckInBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Buissnesslayer.Employee#attemptCheckOutBookingbooking() <em>Attempt Check Out Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check Out Bookingbooking</em>' operation.
	 * @see RootElement.Buissnesslayer.Employee#attemptCheckOutBookingbooking()
	 * @generated
	 */
	EOperation getEmployee__AttemptCheckOutBookingbooking();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuissnesslayerFactory getBuissnesslayerFactory();

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
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.RoomImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Typeroom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TYPEROOM_TYPE = eINSTANCE.getRoom_TyperoomType();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.BookingImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__GUEST = eINSTANCE.getBooking_Guest();

		/**
		 * The meta object literal for the '<em><b>Nr Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NR_OF_GUESTS = eINSTANCE.getBooking_NrOfGuests();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Extras</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__EXTRAS = eINSTANCE.getBooking_Extras();

		/**
		 * The meta object literal for the '<em><b>Parkings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PARKINGS = eINSTANCE.getBooking_Parkings();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ROOMS = eINSTANCE.getBooking_Rooms();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_IN = eINSTANCE.getBooking_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_OUT = eINSTANCE.getBooking_CheckedOut();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT = eINSTANCE.getBooking_Payment();

		/**
		 * The meta object literal for the '<em><b>Payment Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT_COMPLETE = eINSTANCE.getBooking_PaymentComplete();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM = eINSTANCE.getBooking_Room();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.BookingHandlerImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBookingHandler()
		 * @generated
		 */
		EClass BOOKING_HANDLER = eINSTANCE.getBookingHandler();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__BOOKING = eINSTANCE.getBookingHandler_Booking();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__BOOKINGS = eINSTANCE.getBookingHandler_Bookings();

		/**
		 * The meta object literal for the '<em><b>Singleton Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__SINGLETON_BOOKING = eINSTANCE.getBookingHandler_SingletonBooking();

		/**
		 * The meta object literal for the '<em><b>abstractuser</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__ABSTRACTUSER = eINSTANCE.getBookingHandler__abstractuser();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__DATABASE = eINSTANCE.getBookingHandler_Database();

		/**
		 * The meta object literal for the '<em><b>Intfetch Availability Start Date End Date Room Type Nr Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___INTFETCH_AVAILABILITY_START_DATE_END_DATE_ROOM_TYPE_NR_OF_GUESTS = eINSTANCE.getBookingHandler__IntfetchAvailabilityStartDateEndDateRoomTypeNrOfGuests();

		/**
		 * The meta object literal for the '<em><b>Bookingfetch Bookingintbooking ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___BOOKINGFETCH_BOOKINGINTBOOKING_ID = eINSTANCE.getBookingHandler__BookingfetchBookingintbookingID();

		/**
		 * The meta object literal for the '<em><b>Attempt Book Room Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___ATTEMPT_BOOK_ROOM_BOOKINGBOOKING = eINSTANCE.getBookingHandler__AttemptBookRoomBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CANCEL_BOOKING_BOOKINGBOOKING = eINSTANCE.getBookingHandler__CancelBookingBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Change Booking Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHANGE_BOOKING_BOOKINGBOOKING = eINSTANCE.getBookingHandler__ChangeBookingBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Check In Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHECK_IN_BOOKINGBOOKING = eINSTANCE.getBookingHandler__CheckInBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Check Out Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHECK_OUT_BOOKINGBOOKING = eINSTANCE.getBookingHandler__CheckOutBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Send Error Msg String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___SEND_ERROR_MSG_STRING = eINSTANCE.getBookingHandler__SendErrorMsgString();

		/**
		 * The meta object literal for the '<em><b>Get Singleton Booking Booking Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___GET_SINGLETON_BOOKING_BOOKING_HANDLER = eINSTANCE.getBookingHandler__GetSingletonBookingBookingHandler();

		/**
		 * The meta object literal for the '<em><b>Create Singleton Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CREATE_SINGLETON_HANDLER = eINSTANCE.getBookingHandler__CreateSingletonHandler();

		/**
		 * The meta object literal for the '<em><b>Fetch Available Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS = eINSTANCE.getBookingHandler__FetchAvailableExtras();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl._AbstractUserImpl <em>Abstract User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl._AbstractUserImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#get_AbstractUser()
		 * @generated
		 */
		EClass _ABSTRACT_USER = eINSTANCE.get_AbstractUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _ABSTRACT_USER__NAME = eINSTANCE.get_AbstractUser_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _ABSTRACT_USER__EMAIL = eINSTANCE.get_AbstractUser_Email();

		/**
		 * The meta object literal for the '<em><b>Booking Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _ABSTRACT_USER__BOOKING_HANDLER = eINSTANCE.get_AbstractUser_BookingHandler();

		/**
		 * The meta object literal for the '<em><b>Logincontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _ABSTRACT_USER__LOGINCONTROLLER = eINSTANCE.get_AbstractUser_Logincontroller();

		/**
		 * The meta object literal for the '<em><b>Userhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _ABSTRACT_USER__USERHANDLER = eINSTANCE.get_AbstractUser_Userhandler();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _ABSTRACT_USER__ADDRESS = eINSTANCE.get_AbstractUser_Address();

		/**
		 * The meta object literal for the '<em><b>Enter Contact Data Stringname Emailemail Addressadress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___ENTER_CONTACT_DATA_STRINGNAME_EMAILEMAIL_ADDRESSADRESS = eINSTANCE.get_AbstractUser__EnterContactDataStringnameEmailemailAddressadress();

		/**
		 * The meta object literal for the '<em><b>Intbook Room Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___INTBOOK_ROOM_BOOKINGBOOKING = eINSTANCE.get_AbstractUser__IntbookRoomBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Change Booking Bookingold Booking Bookingnew Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = eINSTANCE.get_AbstractUser__ChangeBookingBookingoldBookingBookingnewBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___CANCEL_BOOKING_BOOKINGBOOKING = eINSTANCE.get_AbstractUser__CancelBookingBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check In Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___ATTEMPT_CHECK_IN_BOOKINGBOOKING = eINSTANCE.get_AbstractUser__AttemptCheckInBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check Out Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _ABSTRACT_USER___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = eINSTANCE.get_AbstractUser__AttemptCheckOutBookingbooking();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.UserHandlerImpl <em>User Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.UserHandlerImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUserHandler()
		 * @generated
		 */
		EClass USER_HANDLER = eINSTANCE.getUserHandler();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_HANDLER__USERS = eINSTANCE.getUserHandler_Users();

		/**
		 * The meta object literal for the '<em><b>Singleton User Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HANDLER__SINGLETON_USER_HANDLER = eINSTANCE.getUserHandler_SingletonUserHandler();

		/**
		 * The meta object literal for the '<em><b>Logincontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HANDLER__LOGINCONTROLLER = eINSTANCE.getUserHandler_Logincontroller();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HANDLER__DATABASE = eINSTANCE.getUserHandler_Database();

		/**
		 * The meta object literal for the '<em><b>Add Guest DB Payment Infopayment Info Useruser</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___ADD_GUEST_DB_PAYMENT_INFOPAYMENT_INFO_USERUSER = eINSTANCE.getUserHandler__AddGuestDBPaymentInfopaymentInfoUseruser();

		/**
		 * The meta object literal for the '<em><b>Send Email Verification Stringemail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___SEND_EMAIL_VERIFICATION_STRINGEMAIL = eINSTANCE.getUserHandler__SendEmailVerificationStringemail();

		/**
		 * The meta object literal for the '<em><b>Get Singleton Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___GET_SINGLETON_HANDLER = eINSTANCE.getUserHandler__GetSingletonHandler();

		/**
		 * The meta object literal for the '<em><b>Create Singleton Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___CREATE_SINGLETON_HANDLER = eINSTANCE.getUserHandler__CreateSingletonHandler();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.AddressImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Postal Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POSTAL_NUMBER = eINSTANCE.getAddress_PostalNumber();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.GuestImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Intbook Room Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___INTBOOK_ROOM_BOOKINGBOOKING = eINSTANCE.getGuest__IntbookRoomBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Change Booking Bookingold Booking Bookingnew Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = eINSTANCE.getGuest__ChangeBookingBookingoldBookingBookingnewBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___CANCEL_BOOKING_BOOKINGBOOKING = eINSTANCE.getGuest__CancelBookingBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check In Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___ATTEMPT_CHECK_IN_BOOKINGBOOKING = eINSTANCE.getGuest__AttemptCheckInBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check Out Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = eINSTANCE.getGuest__AttemptCheckOutBookingbooking();

		/**
		 * The meta object literal for the '{@link RootElement.Buissnesslayer.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Buissnesslayer.impl.EmployeeImpl
		 * @see RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_ID();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__PASSWORD = eINSTANCE.getEmployee_Password();

		/**
		 * The meta object literal for the '<em><b>Intbook Room Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___INTBOOK_ROOM_BOOKINGBOOKING = eINSTANCE.getEmployee__IntbookRoomBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Change Booking Bookingold Booking Bookingnew Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING = eINSTANCE.getEmployee__ChangeBookingBookingoldBookingBookingnewBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___CANCEL_BOOKING_BOOKINGBOOKING = eINSTANCE.getEmployee__CancelBookingBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check In Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___ATTEMPT_CHECK_IN_BOOKINGBOOKING = eINSTANCE.getEmployee__AttemptCheckInBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check Out Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___ATTEMPT_CHECK_OUT_BOOKINGBOOKING = eINSTANCE.getEmployee__AttemptCheckOutBookingbooking();

	}

} //BuissnesslayerPackage
