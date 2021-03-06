/**
 */
package Classes.Buissnesslayer;

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
 * @see Classes.Buissnesslayer.BuissnesslayerFactory
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
	String eNS_URI = "http:///Classes/Buissnesslayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Buissnesslayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuissnesslayerPackage eINSTANCE = Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.RoomImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 0;

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
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.BookingImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 1;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.BookingHandlerImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBookingHandler()
	 * @generated
	 */
	int BOOKING_HANDLER = 2;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.UserImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.UserHandlerImpl <em>User Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.UserHandlerImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUserHandler()
	 * @generated
	 */
	int USER_HANDLER = 4;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.AddressImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 6;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.GuestImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 7;

	/**
	 * The meta object id for the '{@link Classes.Buissnesslayer.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Buissnesslayer.impl.EmployeeImpl
	 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 5;

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
	 * The feature id for the '<em><b>Extras</b></em>' attribute list.
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
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_IN = 7;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_OUT = 8;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT = 9;

	/**
	 * The feature id for the '<em><b>Payment Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_COMPLETE = 10;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM = 11;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOMS = 12;

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
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__USER = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__USERHANDLER = 4;

	/**
	 * The number of structural features of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Fetch Availability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___FETCH_AVAILABILITY__STRING_STRING_INT_INT = 0;

	/**
	 * The operation id for the '<em>Fetch Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___FETCH_BOOKING__INT = 1;

	/**
	 * The operation id for the '<em>Attempt Book Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ATTEMPT_BOOK_ROOM__BOOKING = 2;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CANCEL_BOOKING__BOOKING = 3;

	/**
	 * The operation id for the '<em>Change Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHANGE_BOOKING__BOOKING = 4;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_IN__BOOKING = 5;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_OUT__BOOKING = 6;

	/**
	 * The operation id for the '<em>Send Error Msg</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___SEND_ERROR_MSG = 7;

	/**
	 * The operation id for the '<em>Fetch Available Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS = 8;

	/**
	 * The operation id for the '<em>Display Payment Options</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___DISPLAY_PAYMENT_OPTIONS = 9;

	/**
	 * The operation id for the '<em>Calculate Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CALCULATE_PAYMENT__BOOKING = 10;

	/**
	 * The number of operations of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_OPERATION_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGINCONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERHANDLER = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Bookinghandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BOOKINGHANDLER = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Change Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CHANGE_BOOKING__BOOKING_BOOKING = 0;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CANCEL_BOOKING__BOOKING = 1;

	/**
	 * The operation id for the '<em>Attempt Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ATTEMPT_CHECK_IN__BOOKING = 2;

	/**
	 * The operation id for the '<em>Attempt Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ATTEMPT_CHECK_OUT__BOOKING = 3;

	/**
	 * The operation id for the '<em>Book Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___BOOK_ROOM__BOOKING = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__USERS = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER__LOGINCONTROLLER = 2;

	/**
	 * The number of structural features of the '<em>User Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Send Email Verification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___SEND_EMAIL_VERIFICATION__STRING = 0;

	/**
	 * The operation id for the '<em>Is Email Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___IS_EMAIL_VALID__STRING = 1;

	/**
	 * The operation id for the '<em>Identify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___IDENTIFY_USER__INT = 2;

	/**
	 * The operation id for the '<em>Add New Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___ADD_NEW_GUEST__STRING = 3;

	/**
	 * The operation id for the '<em>Create Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___CREATE_EMPLOYEE__INT = 4;

	/**
	 * The operation id for the '<em>Identify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER___IDENTIFY_USER__STRING = 5;

	/**
	 * The number of operations of the '<em>User Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HANDLER_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LOGINCONTROLLER = USER__LOGINCONTROLLER;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__USERHANDLER = USER__USERHANDLER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Bookinghandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BOOKINGHANDLER = USER__BOOKINGHANDLER;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PASSWORD = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CHANGE_BOOKING__BOOKING_BOOKING = USER___CHANGE_BOOKING__BOOKING_BOOKING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CANCEL_BOOKING__BOOKING = USER___CANCEL_BOOKING__BOOKING;

	/**
	 * The operation id for the '<em>Attempt Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ATTEMPT_CHECK_IN__BOOKING = USER___ATTEMPT_CHECK_IN__BOOKING;

	/**
	 * The operation id for the '<em>Attempt Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ATTEMPT_CHECK_OUT__BOOKING = USER___ATTEMPT_CHECK_OUT__BOOKING;

	/**
	 * The operation id for the '<em>Book Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___BOOK_ROOM__BOOKING = USER___BOOK_ROOM__BOOKING;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__LOGINCONTROLLER = USER__LOGINCONTROLLER;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__USERHANDLER = USER__USERHANDLER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Bookinghandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKINGHANDLER = USER__BOOKINGHANDLER;

	/**
	 * The feature id for the '<em><b>Wrok Around</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__WROK_AROUND = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CHANGE_BOOKING__BOOKING_BOOKING = USER___CHANGE_BOOKING__BOOKING_BOOKING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CANCEL_BOOKING__BOOKING = USER___CANCEL_BOOKING__BOOKING;

	/**
	 * The operation id for the '<em>Attempt Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ATTEMPT_CHECK_IN__BOOKING = USER___ATTEMPT_CHECK_IN__BOOKING;

	/**
	 * The operation id for the '<em>Attempt Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ATTEMPT_CHECK_OUT__BOOKING = USER___ATTEMPT_CHECK_OUT__BOOKING;

	/**
	 * The operation id for the '<em>Book Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___BOOK_ROOM__BOOKING = USER___BOOK_ROOM__BOOKING;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = USER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Classes.Buissnesslayer.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see Classes.Buissnesslayer.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomType();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Classes.Buissnesslayer.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see Classes.Buissnesslayer.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest</em>'.
	 * @see Classes.Buissnesslayer.Booking#getGuest()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Guest();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getNrOfGuests <em>Nr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Guests</em>'.
	 * @see Classes.Buissnesslayer.Booking#getNrOfGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NrOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Classes.Buissnesslayer.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Classes.Buissnesslayer.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Buissnesslayer.Booking#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extras</em>'.
	 * @see Classes.Buissnesslayer.Booking#getExtras()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Extras();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getParkings <em>Parkings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parkings</em>'.
	 * @see Classes.Buissnesslayer.Booking#getParkings()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Parkings();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Buissnesslayer.Booking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see Classes.Buissnesslayer.Booking#getRooms()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see Classes.Buissnesslayer.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#isCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see Classes.Buissnesslayer.Booking#isCheckedOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment</em>'.
	 * @see Classes.Buissnesslayer.Booking#getPayment()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Payment();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Booking#isPaymentComplete <em>Payment Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Complete</em>'.
	 * @see Classes.Buissnesslayer.Booking#isPaymentComplete()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PaymentComplete();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Buissnesslayer.Booking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see Classes.Buissnesslayer.Booking#getRoom()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Room();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Handler</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler
	 * @generated
	 */
	EClass getBookingHandler();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.BookingHandler#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler#getBooking()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Booking();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.BookingHandler#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bookings</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler#getBookings()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Bookings();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Buissnesslayer.BookingHandler#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler#getUser()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_User();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.BookingHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler#getDatabase()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Database();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.BookingHandler#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userhandler</em>'.
	 * @see Classes.Buissnesslayer.BookingHandler#getUserhandler()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Userhandler();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#fetchAvailability(java.lang.String, java.lang.String, int, int) <em>Fetch Availability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Availability</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#fetchAvailability(java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getBookingHandler__FetchAvailability__String_String_int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#fetchBooking(int) <em>Fetch Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Booking</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#fetchBooking(int)
	 * @generated
	 */
	EOperation getBookingHandler__FetchBooking__int();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#attemptBookRoom(Classes.Buissnesslayer.Booking) <em>Attempt Book Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Book Room</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#attemptBookRoom(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__AttemptBookRoom__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#cancelBooking(Classes.Buissnesslayer.Booking) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#cancelBooking(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__CancelBooking__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#changeBooking(Classes.Buissnesslayer.Booking) <em>Change Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#changeBooking(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__ChangeBooking__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#checkIn(Classes.Buissnesslayer.Booking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#checkIn(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__CheckIn__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#checkOut(Classes.Buissnesslayer.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#checkOut(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__CheckOut__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#sendErrorMsg() <em>Send Error Msg</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Error Msg</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#sendErrorMsg()
	 * @generated
	 */
	EOperation getBookingHandler__SendErrorMsg();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#fetchAvailableExtras() <em>Fetch Available Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Available Extras</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#fetchAvailableExtras()
	 * @generated
	 */
	EOperation getBookingHandler__FetchAvailableExtras();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#displayPaymentOptions() <em>Display Payment Options</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Payment Options</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#displayPaymentOptions()
	 * @generated
	 */
	EOperation getBookingHandler__DisplayPaymentOptions();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.BookingHandler#CalculatePayment(Classes.Buissnesslayer.Booking) <em>Calculate Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Payment</em>' operation.
	 * @see Classes.Buissnesslayer.BookingHandler#CalculatePayment(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__CalculatePayment__Booking();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see Classes.Buissnesslayer.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Buissnesslayer.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.Buissnesslayer.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.User#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see Classes.Buissnesslayer.User#getLogincontroller()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.User#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userhandler</em>'.
	 * @see Classes.Buissnesslayer.User#getUserhandler()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Userhandler();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see Classes.Buissnesslayer.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Address();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.User#getBookinghandler <em>Bookinghandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bookinghandler</em>'.
	 * @see Classes.Buissnesslayer.User#getBookinghandler()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Bookinghandler();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.User#changeBooking(Classes.Buissnesslayer.Booking, Classes.Buissnesslayer.Booking) <em>Change Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking</em>' operation.
	 * @see Classes.Buissnesslayer.User#changeBooking(Classes.Buissnesslayer.Booking, Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getUser__ChangeBooking__Booking_Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.User#cancelBooking(Classes.Buissnesslayer.Booking) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.Buissnesslayer.User#cancelBooking(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getUser__CancelBooking__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.User#attemptCheckIn(Classes.Buissnesslayer.Booking) <em>Attempt Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check In</em>' operation.
	 * @see Classes.Buissnesslayer.User#attemptCheckIn(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getUser__AttemptCheckIn__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.User#attemptCheckOut(Classes.Buissnesslayer.Booking) <em>Attempt Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempt Check Out</em>' operation.
	 * @see Classes.Buissnesslayer.User#attemptCheckOut(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getUser__AttemptCheckOut__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.User#bookRoom(Classes.Buissnesslayer.Booking) <em>Book Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book Room</em>' operation.
	 * @see Classes.Buissnesslayer.User#bookRoom(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getUser__BookRoom__Booking();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.UserHandler <em>User Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Handler</em>'.
	 * @see Classes.Buissnesslayer.UserHandler
	 * @generated
	 */
	EClass getUserHandler();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.UserHandler#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users</em>'.
	 * @see Classes.Buissnesslayer.UserHandler#getUsers()
	 * @see #getUserHandler()
	 * @generated
	 */
	EAttribute getUserHandler_Users();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.UserHandler#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see Classes.Buissnesslayer.UserHandler#getLogincontroller()
	 * @see #getUserHandler()
	 * @generated
	 */
	EReference getUserHandler_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link Classes.Buissnesslayer.UserHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see Classes.Buissnesslayer.UserHandler#getDatabase()
	 * @see #getUserHandler()
	 * @generated
	 */
	EReference getUserHandler_Database();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#sendEmailVerification(java.lang.String) <em>Send Email Verification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Email Verification</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#sendEmailVerification(java.lang.String)
	 * @generated
	 */
	EOperation getUserHandler__SendEmailVerification__String();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#isEmailValid(java.lang.String) <em>Is Email Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Email Valid</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#isEmailValid(java.lang.String)
	 * @generated
	 */
	EOperation getUserHandler__IsEmailValid__String();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#identifyUser(int) <em>Identify User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identify User</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#identifyUser(int)
	 * @generated
	 */
	EOperation getUserHandler__IdentifyUser__int();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#AddNewGuest(java.lang.String) <em>Add New Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Guest</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#AddNewGuest(java.lang.String)
	 * @generated
	 */
	EOperation getUserHandler__AddNewGuest__String();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#CreateEmployee(int) <em>Create Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Employee</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#CreateEmployee(int)
	 * @generated
	 */
	EOperation getUserHandler__CreateEmployee__int();

	/**
	 * Returns the meta object for the '{@link Classes.Buissnesslayer.UserHandler#identifyUser(java.lang.String) <em>Identify User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identify User</em>' operation.
	 * @see Classes.Buissnesslayer.UserHandler#identifyUser(java.lang.String)
	 * @generated
	 */
	EOperation getUserHandler__IdentifyUser__String();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see Classes.Buissnesslayer.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see Classes.Buissnesslayer.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Address#getPostalNumber <em>Postal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Number</em>'.
	 * @see Classes.Buissnesslayer.Address#getPostalNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostalNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Classes.Buissnesslayer.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see Classes.Buissnesslayer.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see Classes.Buissnesslayer.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Buissnesslayer.Guest#getWrokAround <em>Wrok Around</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Wrok Around</em>'.
	 * @see Classes.Buissnesslayer.Guest#getWrokAround()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_WrokAround();

	/**
	 * Returns the meta object for class '{@link Classes.Buissnesslayer.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see Classes.Buissnesslayer.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Employee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Classes.Buissnesslayer.Employee#getID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ID();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Buissnesslayer.Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.Buissnesslayer.Employee#getPassword()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Password();

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
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.RoomImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.BookingImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBooking()
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
		 * The meta object literal for the '<em><b>Extras</b></em>' attribute list feature.
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
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOMS = eINSTANCE.getBooking_Rooms();

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
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.BookingHandlerImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getBookingHandler()
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
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__USER = eINSTANCE.getBookingHandler_User();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__DATABASE = eINSTANCE.getBookingHandler_Database();

		/**
		 * The meta object literal for the '<em><b>Userhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__USERHANDLER = eINSTANCE.getBookingHandler_Userhandler();

		/**
		 * The meta object literal for the '<em><b>Fetch Availability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___FETCH_AVAILABILITY__STRING_STRING_INT_INT = eINSTANCE.getBookingHandler__FetchAvailability__String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Fetch Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___FETCH_BOOKING__INT = eINSTANCE.getBookingHandler__FetchBooking__int();

		/**
		 * The meta object literal for the '<em><b>Attempt Book Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___ATTEMPT_BOOK_ROOM__BOOKING = eINSTANCE.getBookingHandler__AttemptBookRoom__Booking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CANCEL_BOOKING__BOOKING = eINSTANCE.getBookingHandler__CancelBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Change Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHANGE_BOOKING__BOOKING = eINSTANCE.getBookingHandler__ChangeBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHECK_IN__BOOKING = eINSTANCE.getBookingHandler__CheckIn__Booking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CHECK_OUT__BOOKING = eINSTANCE.getBookingHandler__CheckOut__Booking();

		/**
		 * The meta object literal for the '<em><b>Send Error Msg</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___SEND_ERROR_MSG = eINSTANCE.getBookingHandler__SendErrorMsg();

		/**
		 * The meta object literal for the '<em><b>Fetch Available Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS = eINSTANCE.getBookingHandler__FetchAvailableExtras();

		/**
		 * The meta object literal for the '<em><b>Display Payment Options</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___DISPLAY_PAYMENT_OPTIONS = eINSTANCE.getBookingHandler__DisplayPaymentOptions();

		/**
		 * The meta object literal for the '<em><b>Calculate Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___CALCULATE_PAYMENT__BOOKING = eINSTANCE.getBookingHandler__CalculatePayment__Booking();

		/**
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.UserImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Logincontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__LOGINCONTROLLER = eINSTANCE.getUser_Logincontroller();

		/**
		 * The meta object literal for the '<em><b>Userhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERHANDLER = eINSTANCE.getUser_Userhandler();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '<em><b>Bookinghandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BOOKINGHANDLER = eINSTANCE.getUser_Bookinghandler();

		/**
		 * The meta object literal for the '<em><b>Change Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CHANGE_BOOKING__BOOKING_BOOKING = eINSTANCE.getUser__ChangeBooking__Booking_Booking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CANCEL_BOOKING__BOOKING = eINSTANCE.getUser__CancelBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ATTEMPT_CHECK_IN__BOOKING = eINSTANCE.getUser__AttemptCheckIn__Booking();

		/**
		 * The meta object literal for the '<em><b>Attempt Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ATTEMPT_CHECK_OUT__BOOKING = eINSTANCE.getUser__AttemptCheckOut__Booking();

		/**
		 * The meta object literal for the '<em><b>Book Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___BOOK_ROOM__BOOKING = eINSTANCE.getUser__BookRoom__Booking();

		/**
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.UserHandlerImpl <em>User Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.UserHandlerImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getUserHandler()
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
		 * The meta object literal for the '<em><b>Send Email Verification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___SEND_EMAIL_VERIFICATION__STRING = eINSTANCE.getUserHandler__SendEmailVerification__String();

		/**
		 * The meta object literal for the '<em><b>Is Email Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___IS_EMAIL_VALID__STRING = eINSTANCE.getUserHandler__IsEmailValid__String();

		/**
		 * The meta object literal for the '<em><b>Identify User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___IDENTIFY_USER__INT = eINSTANCE.getUserHandler__IdentifyUser__int();

		/**
		 * The meta object literal for the '<em><b>Add New Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___ADD_NEW_GUEST__STRING = eINSTANCE.getUserHandler__AddNewGuest__String();

		/**
		 * The meta object literal for the '<em><b>Create Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___CREATE_EMPLOYEE__INT = eINSTANCE.getUserHandler__CreateEmployee__int();

		/**
		 * The meta object literal for the '<em><b>Identify User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_HANDLER___IDENTIFY_USER__STRING = eINSTANCE.getUserHandler__IdentifyUser__String();

		/**
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.AddressImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getAddress()
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
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.GuestImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Wrok Around</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__WROK_AROUND = eINSTANCE.getGuest_WrokAround();

		/**
		 * The meta object literal for the '{@link Classes.Buissnesslayer.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Buissnesslayer.impl.EmployeeImpl
		 * @see Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl#getEmployee()
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

	}

} //BuissnesslayerPackage
