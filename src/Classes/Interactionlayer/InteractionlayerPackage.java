/**
 */
package Classes.Interactionlayer;

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
 * @see Classes.Interactionlayer.InteractionlayerFactory
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
	String eNS_URI = "http:///Classes/Interactionlayer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Interactionlayer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionlayerPackage eINSTANCE = Classes.Interactionlayer.impl.InteractionlayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Interactionlayer.impl.GUIImpl <em>GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Interactionlayer.impl.GUIImpl
	 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getGUI()
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
	 * The meta object id for the '{@link Classes.Interactionlayer.impl.GUIControllerImpl <em>GUI Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Interactionlayer.impl.GUIControllerImpl
	 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getGUIController()
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
	 * The operation id for the '<em>Show Availability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___SHOW_AVAILABILITY__INT_INT_ROOM_INT = 0;

	/**
	 * The operation id for the '<em>Display Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ERROR = 1;

	/**
	 * The operation id for the '<em>Display Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_EXTRAS__ELIST = 2;

	/**
	 * The operation id for the '<em>Display Parkings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_PARKINGS__ELIST = 3;

	/**
	 * The operation id for the '<em>Display Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOM_TYPES__ELIST = 4;

	/**
	 * The operation id for the '<em>Display Rooms Grid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOMS_GRID__ELIST = 5;

	/**
	 * The operation id for the '<em>Display Payment Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION = 6;

	/**
	 * The operation id for the '<em>Display Rooms By ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_ROOMS_BY_ID__INT = 7;

	/**
	 * The operation id for the '<em>Display Bookings By IDintbooking ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID__INT = 8;

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
	 * The meta object id for the '{@link Classes.Interactionlayer.impl.LoginControllerImpl <em>Login Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Interactionlayer.impl.LoginControllerImpl
	 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController()
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
	 * The operation id for the '<em>Login Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT_CHAR = 0;

	/**
	 * The operation id for the '<em>Make Guest Booking Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___MAKE_GUEST_BOOKING_LOGIN__BOOKING = 1;

	/**
	 * The operation id for the '<em>Login Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___LOGIN_GUEST__INT_CHAR = 2;

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
	 * The meta object id for the '{@link Classes.Interactionlayer.impl.LoginController_DataType1Impl <em>Login Controller Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Interactionlayer.impl.LoginController_DataType1Impl
	 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController_DataType1()
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
	 * Returns the meta object for class '{@link Classes.Interactionlayer.GUI <em>GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI</em>'.
	 * @see Classes.Interactionlayer.GUI
	 * @generated
	 */
	EClass getGUI();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.GUI#getGuicontroller <em>Guicontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guicontroller</em>'.
	 * @see Classes.Interactionlayer.GUI#getGuicontroller()
	 * @see #getGUI()
	 * @generated
	 */
	EReference getGUI_Guicontroller();

	/**
	 * Returns the meta object for class '{@link Classes.Interactionlayer.GUIController <em>GUI Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Controller</em>'.
	 * @see Classes.Interactionlayer.GUIController
	 * @generated
	 */
	EClass getGUIController();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.GUIController#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see Classes.Interactionlayer.GUIController#getDisplay()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Display();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.GUIController#getLogincontroller <em>Logincontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logincontroller</em>'.
	 * @see Classes.Interactionlayer.GUIController#getLogincontroller()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Logincontroller();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.GUIController#getBookinghandler <em>Bookinghandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bookinghandler</em>'.
	 * @see Classes.Interactionlayer.GUIController#getBookinghandler()
	 * @see #getGUIController()
	 * @generated
	 */
	EReference getGUIController_Bookinghandler();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#showAvailability(int, int, Classes.Buissnesslayer.Room, int) <em>Show Availability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Availability</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#showAvailability(int, int, Classes.Buissnesslayer.Room, int)
	 * @generated
	 */
	EOperation getGUIController__ShowAvailability__int_int_Room_int();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayError() <em>Display Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Error</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayError()
	 * @generated
	 */
	EOperation getGUIController__DisplayError();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayExtras(org.eclipse.emf.common.util.EList) <em>Display Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Extras</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayExtras(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGUIController__DisplayExtras__EList();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayParkings(org.eclipse.emf.common.util.EList) <em>Display Parkings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Parkings</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayParkings(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGUIController__DisplayParkings__EList();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayRoomTypes(org.eclipse.emf.common.util.EList) <em>Display Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Room Types</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayRoomTypes(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomTypes__EList();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayRoomsGrid(org.eclipse.emf.common.util.EList) <em>Display Rooms Grid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Rooms Grid</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayRoomsGrid(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomsGrid__EList();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayPaymentOption() <em>Display Payment Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Payment Option</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayPaymentOption()
	 * @generated
	 */
	EOperation getGUIController__DisplayPaymentOption();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayRoomsByID(int) <em>Display Rooms By ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Rooms By ID</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayRoomsByID(int)
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomsByID__int();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayBookingsByIDintbookingID(int) <em>Display Bookings By IDintbooking ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Bookings By IDintbooking ID</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayBookingsByIDintbookingID(int)
	 * @generated
	 */
	EOperation getGUIController__DisplayBookingsByIDintbookingID__int();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayBookingCancelled() <em>Display Booking Cancelled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Booking Cancelled</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayBookingCancelled()
	 * @generated
	 */
	EOperation getGUIController__DisplayBookingCancelled();

	/**
	 * Returns the meta object for class '{@link Classes.Interactionlayer.LoginController <em>Login Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Controller</em>'.
	 * @see Classes.Interactionlayer.LoginController
	 * @generated
	 */
	EClass getLoginController();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.LoginController#getCurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current User</em>'.
	 * @see Classes.Interactionlayer.LoginController#getCurrentUser()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_CurrentUser();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.LoginController#getLoginController <em>Login Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Controller</em>'.
	 * @see Classes.Interactionlayer.LoginController#getLoginController()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_LoginController();

	/**
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.LoginController#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see Classes.Interactionlayer.LoginController#getPaymenthandler()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_Paymenthandler();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#loginEmployee(int, java.lang.String) <em>Login Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Employee</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#loginEmployee(int, java.lang.String)
	 * @generated
	 */
	EOperation getLoginController__LoginEmployee__int_char();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#makeGuestBookingLogin(Classes.Buissnesslayer.Booking) <em>Make Guest Booking Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Guest Booking Login</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#makeGuestBookingLogin(Classes.Buissnesslayer.Booking)
	 * @generated
	 */
	EOperation getLoginController__MakeGuestBookingLogin__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#loginGuest(int, java.lang.String) <em>Login Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Guest</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#loginGuest(int, java.lang.String)
	 * @generated
	 */
	EOperation getLoginController__LoginGuest__int_char();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#getSingletonController() <em>Get Singleton Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Singleton Controller</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#getSingletonController()
	 * @generated
	 */
	EOperation getLoginController__GetSingletonController();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#createSingletonHandler() <em>Create Singleton Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Singleton Handler</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#createSingletonHandler()
	 * @generated
	 */
	EOperation getLoginController__CreateSingletonHandler();

	/**
	 * Returns the meta object for class '{@link Classes.Interactionlayer.LoginController_DataType1 <em>Login Controller Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Controller Data Type1</em>'.
	 * @see Classes.Interactionlayer.LoginController_DataType1
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
		 * The meta object literal for the '{@link Classes.Interactionlayer.impl.GUIImpl <em>GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Interactionlayer.impl.GUIImpl
		 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getGUI()
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
		 * The meta object literal for the '{@link Classes.Interactionlayer.impl.GUIControllerImpl <em>GUI Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Interactionlayer.impl.GUIControllerImpl
		 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getGUIController()
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
		 * The meta object literal for the '<em><b>Show Availability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___SHOW_AVAILABILITY__INT_INT_ROOM_INT = eINSTANCE.getGUIController__ShowAvailability__int_int_Room_int();

		/**
		 * The meta object literal for the '<em><b>Display Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ERROR = eINSTANCE.getGUIController__DisplayError();

		/**
		 * The meta object literal for the '<em><b>Display Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_EXTRAS__ELIST = eINSTANCE.getGUIController__DisplayExtras__EList();

		/**
		 * The meta object literal for the '<em><b>Display Parkings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_PARKINGS__ELIST = eINSTANCE.getGUIController__DisplayParkings__EList();

		/**
		 * The meta object literal for the '<em><b>Display Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOM_TYPES__ELIST = eINSTANCE.getGUIController__DisplayRoomTypes__EList();

		/**
		 * The meta object literal for the '<em><b>Display Rooms Grid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOMS_GRID__ELIST = eINSTANCE.getGUIController__DisplayRoomsGrid__EList();

		/**
		 * The meta object literal for the '<em><b>Display Payment Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION = eINSTANCE.getGUIController__DisplayPaymentOption();

		/**
		 * The meta object literal for the '<em><b>Display Rooms By ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_ROOMS_BY_ID__INT = eINSTANCE.getGUIController__DisplayRoomsByID__int();

		/**
		 * The meta object literal for the '<em><b>Display Bookings By IDintbooking ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID__INT = eINSTANCE.getGUIController__DisplayBookingsByIDintbookingID__int();

		/**
		 * The meta object literal for the '<em><b>Display Booking Cancelled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED = eINSTANCE.getGUIController__DisplayBookingCancelled();

		/**
		 * The meta object literal for the '{@link Classes.Interactionlayer.impl.LoginControllerImpl <em>Login Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Interactionlayer.impl.LoginControllerImpl
		 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController()
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
		 * The meta object literal for the '<em><b>Login Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT_CHAR = eINSTANCE.getLoginController__LoginEmployee__int_char();

		/**
		 * The meta object literal for the '<em><b>Make Guest Booking Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___MAKE_GUEST_BOOKING_LOGIN__BOOKING = eINSTANCE.getLoginController__MakeGuestBookingLogin__Booking();

		/**
		 * The meta object literal for the '<em><b>Login Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___LOGIN_GUEST__INT_CHAR = eINSTANCE.getLoginController__LoginGuest__int_char();

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
		 * The meta object literal for the '{@link Classes.Interactionlayer.impl.LoginController_DataType1Impl <em>Login Controller Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Interactionlayer.impl.LoginController_DataType1Impl
		 * @see Classes.Interactionlayer.impl.InteractionlayerPackageImpl#getLoginController_DataType1()
		 * @generated
		 */
		EClass LOGIN_CONTROLLER_DATA_TYPE1 = eINSTANCE.getLoginController_DataType1();

	}

} //InteractionlayerPackage
