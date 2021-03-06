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
	 * The operation id for the '<em>Show Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___SHOW_AVAILABLE_ROOMS__STRING_STRING_ROOM_INT = 0;

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
	int GUI_CONTROLLER___DISPLAY_ROOM_TYPES = 4;

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
	 * The operation id for the '<em>Display Date Options</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER___DISPLAY_DATE_OPTIONS = 10;

	/**
	 * The number of operations of the '<em>GUI Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTROLLER_OPERATION_COUNT = 11;

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
	 * The feature id for the '<em><b>Guicontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__GUICONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Current User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__CURRENT_USER = 1;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__PAYMENTHANDLER = 2;

	/**
	 * The feature id for the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER__USERHANDLER = 3;

	/**
	 * The number of structural features of the '<em>Login Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Login Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT = 0;

	/**
	 * The operation id for the '<em>Login Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___LOGIN_GUEST__INT = 1;

	/**
	 * The operation id for the '<em>Login Create Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER___LOGIN_CREATE_GUEST__STRING = 2;

	/**
	 * The number of operations of the '<em>Login Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONTROLLER_OPERATION_COUNT = 3;

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
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#showAvailableRooms(java.lang.String, java.lang.String, Classes.Buissnesslayer.Room, int) <em>Show Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Available Rooms</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#showAvailableRooms(java.lang.String, java.lang.String, Classes.Buissnesslayer.Room, int)
	 * @generated
	 */
	EOperation getGUIController__ShowAvailableRooms__String_String_Room_int();

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
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayRoomTypes() <em>Display Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Room Types</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayRoomTypes()
	 * @generated
	 */
	EOperation getGUIController__DisplayRoomTypes();

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
	 * Returns the meta object for the '{@link Classes.Interactionlayer.GUIController#displayDateOptions() <em>Display Date Options</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Date Options</em>' operation.
	 * @see Classes.Interactionlayer.GUIController#displayDateOptions()
	 * @generated
	 */
	EOperation getGUIController__DisplayDateOptions();

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
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.LoginController#getGuicontroller <em>Guicontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guicontroller</em>'.
	 * @see Classes.Interactionlayer.LoginController#getGuicontroller()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_Guicontroller();

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
	 * Returns the meta object for the reference '{@link Classes.Interactionlayer.LoginController#getUserhandler <em>Userhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userhandler</em>'.
	 * @see Classes.Interactionlayer.LoginController#getUserhandler()
	 * @see #getLoginController()
	 * @generated
	 */
	EReference getLoginController_Userhandler();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#loginEmployee(int) <em>Login Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Employee</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#loginEmployee(int)
	 * @generated
	 */
	EOperation getLoginController__LoginEmployee__int();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#loginGuest(int) <em>Login Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Guest</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#loginGuest(int)
	 * @generated
	 */
	EOperation getLoginController__LoginGuest__int();

	/**
	 * Returns the meta object for the '{@link Classes.Interactionlayer.LoginController#loginCreateGuest(java.lang.String) <em>Login Create Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Create Guest</em>' operation.
	 * @see Classes.Interactionlayer.LoginController#loginCreateGuest(java.lang.String)
	 * @generated
	 */
	EOperation getLoginController__LoginCreateGuest__String();

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
		 * The meta object literal for the '<em><b>Show Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___SHOW_AVAILABLE_ROOMS__STRING_STRING_ROOM_INT = eINSTANCE.getGUIController__ShowAvailableRooms__String_String_Room_int();

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
		EOperation GUI_CONTROLLER___DISPLAY_ROOM_TYPES = eINSTANCE.getGUIController__DisplayRoomTypes();

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
		 * The meta object literal for the '<em><b>Display Date Options</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CONTROLLER___DISPLAY_DATE_OPTIONS = eINSTANCE.getGUIController__DisplayDateOptions();

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
		 * The meta object literal for the '<em><b>Guicontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__GUICONTROLLER = eINSTANCE.getLoginController_Guicontroller();

		/**
		 * The meta object literal for the '<em><b>Current User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__CURRENT_USER = eINSTANCE.getLoginController_CurrentUser();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__PAYMENTHANDLER = eINSTANCE.getLoginController_Paymenthandler();

		/**
		 * The meta object literal for the '<em><b>Userhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONTROLLER__USERHANDLER = eINSTANCE.getLoginController_Userhandler();

		/**
		 * The meta object literal for the '<em><b>Login Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT = eINSTANCE.getLoginController__LoginEmployee__int();

		/**
		 * The meta object literal for the '<em><b>Login Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___LOGIN_GUEST__INT = eINSTANCE.getLoginController__LoginGuest__int();

		/**
		 * The meta object literal for the '<em><b>Login Create Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_CONTROLLER___LOGIN_CREATE_GUEST__STRING = eINSTANCE.getLoginController__LoginCreateGuest__String();

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
