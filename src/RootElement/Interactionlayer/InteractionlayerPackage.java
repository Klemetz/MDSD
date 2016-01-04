/**
 */
package RootElement.Interactionlayer;

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
 * @see RootElement.Interactionlayer.InteractionlayerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Interaction layer'"
 * @generated
 */
public interface InteractionlayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Interactionlayer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Interactionlayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Interactionlayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionlayerPackage eINSTANCE = RootElement.Interactionlayer.impl.InteractionlayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Interactionlayer.impl.GUIImpl <em>GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Interactionlayer.impl.GUIImpl
	 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getGUI()
	 * @generated
	 */
	int GUI = 0;

	/**
	 * The feature id for the '<em><b>Guicontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__GUICONTROLLER = 0;

	/**
	 * The number of structural features of the '<em>GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Interactionlayer.impl.GUIControllerImpl <em>GUI Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Interactionlayer.impl.GUIControllerImpl
	 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getGUIController()
	 * @generated
	 */
	int GUI_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER__DISPLAY = 0;

	/**
	 * The feature id for the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER__LOGINCONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Bookinghandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER__BOOKINGHANDLER = 2;

	/**
	 * The number of structural features of the '<em>GUI Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Show Availabilitystart Dateend Dateroom Type Nr Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___SHOW_AVAILABILITYSTART_DATEEND_DATEROOM_TYPE_NR_OF_GUESTS = 0;

	/**
	 * The operation id for the '<em>Display Errorstringerror Msg</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ERRORSTRINGERROR_MSG = 1;

	/**
	 * The operation id for the '<em>Display Extras Listextras Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_EXTRAS_LISTEXTRAS_EXTRAS = 2;

	/**
	 * The operation id for the '<em>Display Parkings Listparkings Parkings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_PARKINGS_LISTPARKINGS_PARKINGS = 3;

	/**
	 * The operation id for the '<em>Display Room Types Listroom Type Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOM_TYPES_LISTROOM_TYPE_ROOM_TYPE = 4;

	/**
	 * The operation id for the '<em>Display Rooms Grid List Roomroom Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOMS_GRID_LIST_ROOMROOM_TYPE = 5;

	/**
	 * The operation id for the '<em>Display Payment Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION = 6;

	/**
	 * The operation id for the '<em>Display Rooms By IDintbooking ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOMS_BY_IDINTBOOKING_ID = 7;

	/**
	 * The operation id for the '<em>Display Bookings By IDintbooking ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID = 8;

	/**
	 * The operation id for the '<em>Display Booking Cancelled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED = 9;

	/**
	 * The number of operations of the '<em>GUI Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link RootElement.Interactionlayer.impl.LoginControllerImpl <em>Login Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Interactionlayer.impl.LoginControllerImpl
	 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController()
	 * @generated
	 */
	int LOGIN_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Current User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__CURRENT_USER = 0;

	/**
	 * The feature id for the '<em><b>Login Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__LOGIN_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__PAYMENTHANDLER = 2;

	/**
	 * The number of structural features of the '<em>Login Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Employeelogin Employeeint IDstringpassword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___EMPLOYEELOGIN_EMPLOYEEINT_IDSTRINGPASSWORD = 0;

	/**
	 * The operation id for the '<em>Guestmake Guest Booking Login Bookingbooking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___GUESTMAKE_GUEST_BOOKING_LOGIN_BOOKINGBOOKING = 1;

	/**
	 * The operation id for the '<em>Guestlogin Guestintbooking IDstringname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___GUESTLOGIN_GUESTINTBOOKING_IDSTRINGNAME = 2;

	/**
	 * The operation id for the '<em>Get Singleton Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___GET_SINGLETON_CONTROLLER = 3;

	/**
	 * The operation id for the '<em>Create Singleton Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___CREATE_SINGLETON_HANDLER = 4;

	/**
	 * The number of operations of the '<em>Login Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.Interactionlayer.impl.LoginController_DataType1Impl <em>Login Controller Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Interactionlayer.impl.LoginController_DataType1Impl
	 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController_DataType1()
	 * @generated
	 */
	int LOGIN_CONTROLLER_DATA_TYPE1 = 3;

	/**
	 * The number of structural features of the '<em>Login Controller Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_DATA_TYPE1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Login Controller Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_DATA_TYPE1_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Interactionlayer.GUI <em>GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI</em>'.
	 * @see RootElement.Interactionlayer.GUI
	 * @generated
	 */
	EClass getGUI();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.GUI#getGuicontroller <em>Guicontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guicontroller</em>'.
	 * @see RootElement.Interactionlayer.GUI#getGuicontroller()
	 * @see #getGUI()
	 * @generated
	 */
	EReference getGUI_Guicontroller();

	/**
	 * Returns the meta object for class '{@link RootElement.Interactionlayer.GUIController <em>GUI Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Controller</em>'.
	 * @see RootElement.Interactionlayer.GUIController
	 * @generated
	 */
	EClass getGUIController();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.GUIController#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see RootElement.Interactionlayer.GUIController#getDisplay()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Display();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see RootElement.Interactionlayer.GUIController#getLogincontroller()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bookinghandler</em>'.
	 * @see RootElement.Interactionlayer.GUIController#getBookinghandler()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Bookinghandler();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#showAvailabilitystartDateendDateroomTypeNrOfGuests() <em>Show Availabilitystart Dateend Dateroom Type Nr Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Availabilitystart Dateend Dateroom Type Nr Of Guests</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#showAvailabilitystartDateendDateroomTypeNrOfGuests()
	 * @generated
	 */
	EOperation getGUIController__ShowAvailabilitystartDateendDateroomTypeNrOfGuests();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayErrorstringerrorMsg() <em>Display Errorstringerror Msg</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Errorstringerror Msg</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayErrorstringerrorMsg()
	 * @generated
	 */
	EOperation getGUIController__DisplayErrorstringerrorMsg();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayExtrasListextrasExtras() <em>Display Extras Listextras Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Extras Listextras Extras</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayExtrasListextrasExtras()
	 * @generated
	 */
	EOperation getGUIController__DisplayExtrasListextrasExtras();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayParkingsListparkingsParkings() <em>Display Parkings Listparkings Parkings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Parkings Listparkings Parkings</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayParkingsListparkingsParkings()
	 * @generated
	 */
	EOperation getGUIController__DisplayParkingsListparkingsParkings();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayRoomTypesListroomTypeRoomType() <em>Display Room Types Listroom Type Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Room Types Listroom Type Room Type</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayRoomTypesListroomTypeRoomType()
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomTypesListroomTypeRoomType();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayRoomsGridListRoomroomType() <em>Display Rooms Grid List Roomroom Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Rooms Grid List Roomroom Type</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayRoomsGridListRoomroomType()
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomsGridListRoomroomType();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayPaymentOption() <em>Display Payment Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Payment Option</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayPaymentOption()
	 * @generated
	 */
	EOperation getGUIController__DisplayPaymentOption();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayRoomsByIDintbookingID() <em>Display Rooms By IDintbooking ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Rooms By IDintbooking ID</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayRoomsByIDintbookingID()
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomsByIDintbookingID();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayBookingsByIDintbookingID() <em>Display Bookings By IDintbooking ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Bookings By IDintbooking ID</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayBookingsByIDintbookingID()
	 * @generated
	 */
	EOperation getGUIController__DisplayBookingsByIDintbookingID();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.GUIController#displayBookingCancelled() <em>Display Booking Cancelled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Booking Cancelled</em>' operation.
	 * @see RootElement.Interactionlayer.GUIController#displayBookingCancelled()
	 * @generated
	 */
	EOperation getGUIController__DisplayBookingCancelled();

	/**
	 * Returns the meta object for class '{@link RootElement.Interactionlayer.LoginController <em>Login Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Controller</em>'.
	 * @see RootElement.Interactionlayer.LoginController
	 * @generated
	 */
	EClass getLoginController();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current User</em>'.
	 * @see RootElement.Interactionlayer.LoginController#getCurrentUser()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_CurrentUser();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Controller</em>'.
	 * @see RootElement.Interactionlayer.LoginController#getLoginController()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_LoginController();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see RootElement.Interactionlayer.LoginController#getPaymenthandler()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_Paymenthandler();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.LoginController#EmployeeloginEmployeeintIDstringpassword() <em>Employeelogin Employeeint IDstringpassword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employeelogin Employeeint IDstringpassword</em>' operation.
	 * @see RootElement.Interactionlayer.LoginController#EmployeeloginEmployeeintIDstringpassword()
	 * @generated
	 */
	EOperation getLoginController__EmployeeloginEmployeeintIDstringpassword();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.LoginController#GuestmakeGuestBookingLoginBookingbooking() <em>Guestmake Guest Booking Login Bookingbooking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guestmake Guest Booking Login Bookingbooking</em>' operation.
	 * @see RootElement.Interactionlayer.LoginController#GuestmakeGuestBookingLoginBookingbooking()
	 * @generated
	 */
	EOperation getLoginController__GuestmakeGuestBookingLoginBookingbooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.LoginController#GuestloginGuestintbookingIDstringname() <em>Guestlogin Guestintbooking IDstringname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guestlogin Guestintbooking IDstringname</em>' operation.
	 * @see RootElement.Interactionlayer.LoginController#GuestloginGuestintbookingIDstringname()
	 * @generated
	 */
	EOperation getLoginController__GuestloginGuestintbookingIDstringname();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.LoginController#getSingletonController() <em>Get Singleton Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Singleton Controller</em>' operation.
	 * @see RootElement.Interactionlayer.LoginController#getSingletonController()
	 * @generated
	 */
	EOperation getLoginController__GetSingletonController();

	/**
	 * Returns the meta object for the '{@link RootElement.Interactionlayer.LoginController#createSingletonHandler() <em>Create Singleton Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Singleton Handler</em>' operation.
	 * @see RootElement.Interactionlayer.LoginController#createSingletonHandler()
	 * @generated
	 */
	EOperation getLoginController__CreateSingletonHandler();

	/**
	 * Returns the meta object for class '{@link RootElement.Interactionlayer.LoginController_DataType1 <em>Login Controller Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Controller Data Type1</em>'.
	 * @see RootElement.Interactionlayer.LoginController_DataType1
	 * @generated
	 */
	EClass getLoginController_DataType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionlayerFactory getInteractionlayerFactory();

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
		 * The meta object literal for the '{@link RootElement.Interactionlayer.impl.GUIImpl <em>GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Interactionlayer.impl.GUIImpl
		 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getGUI()
		 * @generated
		 */
		EClass GUI = eINSTANCE.getGUI();

		/**
		 * The meta object literal for the '<em><b>Guicontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI__GUICONTROLLER = eINSTANCE.getGUI_Guicontroller();

		/**
		 * The meta object literal for the '{@link RootElement.Interactionlayer.impl.GUIControllerImpl <em>GUI Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Interactionlayer.impl.GUIControllerImpl
		 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getGUIController()
		 * @generated
		 */
		EClass GUI_CONTROLLER = eINSTANCE.getGUIController();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_CONTROLLER__DISPLAY = eINSTANCE.getGUIController_Display();

		/**
		 * The meta object literal for the '<em><b>Logincontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_CONTROLLER__LOGINCONTROLLER = eINSTANCE.getGUIController_Logincontroller();

		/**
		 * The meta object literal for the '<em><b>Bookinghandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_CONTROLLER__BOOKINGHANDLER = eINSTANCE.getGUIController_Bookinghandler();

		/**
		 * The meta object literal for the '<em><b>Show Availabilitystart Dateend Dateroom Type Nr Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___SHOW_AVAILABILITYSTART_DATEEND_DATEROOM_TYPE_NR_OF_GUESTS = eINSTANCE.getGUIController__ShowAvailabilitystartDateendDateroomTypeNrOfGuests();

		/**
		 * The meta object literal for the '<em><b>Display Errorstringerror Msg</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ERRORSTRINGERROR_MSG = eINSTANCE.getGUIController__DisplayErrorstringerrorMsg();

		/**
		 * The meta object literal for the '<em><b>Display Extras Listextras Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_EXTRAS_LISTEXTRAS_EXTRAS = eINSTANCE.getGUIController__DisplayExtrasListextrasExtras();

		/**
		 * The meta object literal for the '<em><b>Display Parkings Listparkings Parkings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_PARKINGS_LISTPARKINGS_PARKINGS = eINSTANCE.getGUIController__DisplayParkingsListparkingsParkings();

		/**
		 * The meta object literal for the '<em><b>Display Room Types Listroom Type Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOM_TYPES_LISTROOM_TYPE_ROOM_TYPE = eINSTANCE.getGUIController__DisplayRoomTypesListroomTypeRoomType();

		/**
		 * The meta object literal for the '<em><b>Display Rooms Grid List Roomroom Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOMS_GRID_LIST_ROOMROOM_TYPE = eINSTANCE.getGUIController__DisplayRoomsGridListRoomroomType();

		/**
		 * The meta object literal for the '<em><b>Display Payment Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION = eINSTANCE.getGUIController__DisplayPaymentOption();

		/**
		 * The meta object literal for the '<em><b>Display Rooms By IDintbooking ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOMS_BY_IDINTBOOKING_ID = eINSTANCE.getGUIController__DisplayRoomsByIDintbookingID();

		/**
		 * The meta object literal for the '<em><b>Display Bookings By IDintbooking ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID = eINSTANCE.getGUIController__DisplayBookingsByIDintbookingID();

		/**
		 * The meta object literal for the '<em><b>Display Booking Cancelled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED = eINSTANCE.getGUIController__DisplayBookingCancelled();

		/**
		 * The meta object literal for the '{@link RootElement.Interactionlayer.impl.LoginControllerImpl <em>Login Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Interactionlayer.impl.LoginControllerImpl
		 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController()
		 * @generated
		 */
		EClass LOGIN_CONTROLLER = eINSTANCE.getLoginController();

		/**
		 * The meta object literal for the '<em><b>Current User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__CURRENT_USER = eINSTANCE.getLoginController_CurrentUser();

		/**
		 * The meta object literal for the '<em><b>Login Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__LOGIN_CONTROLLER = eINSTANCE.getLoginController_LoginController();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__PAYMENTHANDLER = eINSTANCE.getLoginController_Paymenthandler();

		/**
		 * The meta object literal for the '<em><b>Employeelogin Employeeint IDstringpassword</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___EMPLOYEELOGIN_EMPLOYEEINT_IDSTRINGPASSWORD = eINSTANCE.getLoginController__EmployeeloginEmployeeintIDstringpassword();

		/**
		 * The meta object literal for the '<em><b>Guestmake Guest Booking Login Bookingbooking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___GUESTMAKE_GUEST_BOOKING_LOGIN_BOOKINGBOOKING = eINSTANCE.getLoginController__GuestmakeGuestBookingLoginBookingbooking();

		/**
		 * The meta object literal for the '<em><b>Guestlogin Guestintbooking IDstringname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___GUESTLOGIN_GUESTINTBOOKING_IDSTRINGNAME = eINSTANCE.getLoginController__GuestloginGuestintbookingIDstringname();

		/**
		 * The meta object literal for the '<em><b>Get Singleton Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___GET_SINGLETON_CONTROLLER = eINSTANCE.getLoginController__GetSingletonController();

		/**
		 * The meta object literal for the '<em><b>Create Singleton Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___CREATE_SINGLETON_HANDLER = eINSTANCE.getLoginController__CreateSingletonHandler();

		/**
		 * The meta object literal for the '{@link RootElement.Interactionlayer.impl.LoginController_DataType1Impl <em>Login Controller Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Interactionlayer.impl.LoginController_DataType1Impl
		 * @see RootElement.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController_DataType1()
		 * @generated
		 */
		EClass LOGIN_CONTROLLER_DATA_TYPE1 = eINSTANCE.getLoginController_DataType1();

	}

} //InteractionlayerPackage
