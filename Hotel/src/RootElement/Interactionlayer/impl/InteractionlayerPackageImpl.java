/**
 */
package RootElement.Interactionlayer.impl;

import RootElement.BuisnessLogicLayer.BuisnessLogicLayerPackage;

import RootElement.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl;

import RootElement.Buissnesslayer.BuissnesslayerPackage;

import RootElement.Buissnesslayer.impl.BuissnesslayerPackageImpl;

import RootElement.Datalayer.DatalayerPackage;

import RootElement.Datalayer.impl.DatalayerPackageImpl;

import RootElement.Interactionlayer.GUIController;
import RootElement.Interactionlayer.InteractionlayerFactory;
import RootElement.Interactionlayer.InteractionlayerPackage;
import RootElement.Interactionlayer.LoginController;
import RootElement.Interactionlayer.LoginController_DataType1;

import RootElement.RootElementPackage;

import RootElement.impl.RootElementPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionlayerPackageImpl extends EPackageImpl implements InteractionlayerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginController_DataType1EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractionlayerPackageImpl() {
		super(eNS_URI, InteractionlayerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InteractionlayerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractionlayerPackage init() {
		if (isInited) return (InteractionlayerPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI);

		// Obtain or create and register package
		InteractionlayerPackageImpl theInteractionlayerPackage = (InteractionlayerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InteractionlayerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InteractionlayerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RootElementPackageImpl theRootElementPackage = (RootElementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI) instanceof RootElementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI) : RootElementPackage.eINSTANCE);
		DatalayerPackageImpl theDatalayerPackage = (DatalayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) instanceof DatalayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) : DatalayerPackage.eINSTANCE);
		BuissnesslayerPackageImpl theBuissnesslayerPackage = (BuissnesslayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) instanceof BuissnesslayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) : BuissnesslayerPackage.eINSTANCE);
		BuisnessLogicLayerPackageImpl theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) instanceof BuisnessLogicLayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) : BuisnessLogicLayerPackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionlayerPackage.createPackageContents();
		theRootElementPackage.createPackageContents();
		theDatalayerPackage.createPackageContents();
		theBuissnesslayerPackage.createPackageContents();
		theBuisnessLogicLayerPackage.createPackageContents();

		// Initialize created meta-data
		theInteractionlayerPackage.initializePackageContents();
		theRootElementPackage.initializePackageContents();
		theDatalayerPackage.initializePackageContents();
		theBuissnesslayerPackage.initializePackageContents();
		theBuisnessLogicLayerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInteractionlayerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractionlayerPackage.eNS_URI, theInteractionlayerPackage);
		return theInteractionlayerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUI() {
		return guiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUI_Guicontroller() {
		return (EReference)guiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIController() {
		return guiControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIController_Display() {
		return (EReference)guiControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIController_Logincontroller() {
		return (EReference)guiControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIController_Bookinghandler() {
		return (EReference)guiControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__ShowAvailabilitystartDateendDateroomTypeNrOfGuests() {
		return guiControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayErrorstringerrorMsg() {
		return guiControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayExtrasListextrasExtras() {
		return guiControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayParkingsListparkingsParkings() {
		return guiControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayRoomTypesListroomTypeRoomType() {
		return guiControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayRoomsGridListRoomroomType() {
		return guiControllerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayPaymentOption() {
		return guiControllerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayRoomsByIDintbookingID() {
		return guiControllerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayBookingsByIDintbookingID() {
		return guiControllerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayBookingCancelled() {
		return guiControllerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginController() {
		return loginControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginController_CurrentUser() {
		return (EReference)loginControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginController_LoginController() {
		return (EReference)loginControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginController_Paymenthandler() {
		return (EReference)loginControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__EmployeeloginEmployeeintIDstringpassword() {
		return loginControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__GuestmakeGuestBookingLoginBookingbooking() {
		return loginControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__GuestloginGuestintbookingIDstringname() {
		return loginControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__GetSingletonController() {
		return loginControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__CreateSingletonHandler() {
		return loginControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginController_DataType1() {
		return loginController_DataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionlayerFactory getInteractionlayerFactory() {
		return (InteractionlayerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		guiEClass = createEClass(GUI);
		createEReference(guiEClass, GUI__GUICONTROLLER);

		guiControllerEClass = createEClass(GUI_CONTROLLER);
		createEReference(guiControllerEClass, GUI_CONTROLLER__DISPLAY);
		createEReference(guiControllerEClass, GUI_CONTROLLER__LOGINCONTROLLER);
		createEReference(guiControllerEClass, GUI_CONTROLLER__BOOKINGHANDLER);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___SHOW_AVAILABILITYSTART_DATEEND_DATEROOM_TYPE_NR_OF_GUESTS);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_ERRORSTRINGERROR_MSG);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_EXTRAS_LISTEXTRAS_EXTRAS);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_PARKINGS_LISTPARKINGS_PARKINGS);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_ROOM_TYPES_LISTROOM_TYPE_ROOM_TYPE);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_ROOMS_GRID_LIST_ROOMROOM_TYPE);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_PAYMENT_OPTION);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_ROOMS_BY_IDINTBOOKING_ID);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_BOOKINGS_BY_IDINTBOOKING_ID);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_BOOKING_CANCELLED);

		loginControllerEClass = createEClass(LOGIN_CONTROLLER);
		createEReference(loginControllerEClass, LOGIN_CONTROLLER__CURRENT_USER);
		createEReference(loginControllerEClass, LOGIN_CONTROLLER__LOGIN_CONTROLLER);
		createEReference(loginControllerEClass, LOGIN_CONTROLLER__PAYMENTHANDLER);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___EMPLOYEELOGIN_EMPLOYEEINT_IDSTRINGPASSWORD);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___GUESTMAKE_GUEST_BOOKING_LOGIN_BOOKINGBOOKING);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___GUESTLOGIN_GUESTINTBOOKING_IDSTRINGNAME);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___GET_SINGLETON_CONTROLLER);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___CREATE_SINGLETON_HANDLER);

		loginController_DataType1EClass = createEClass(LOGIN_CONTROLLER_DATA_TYPE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BuissnesslayerPackage theBuissnesslayerPackage = (BuissnesslayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI);
		BuisnessLogicLayerPackage theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(guiEClass, RootElement.Interactionlayer.GUI.class, "GUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUI_Guicontroller(), this.getGUIController(), null, "guicontroller", null, 1, 1, RootElement.Interactionlayer.GUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guiControllerEClass, GUIController.class, "GUIController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIController_Display(), this.getGUI(), null, "display", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGUIController_Logincontroller(), this.getLoginController(), null, "logincontroller", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGUIController_Bookinghandler(), theBuissnesslayerPackage.getBookingHandler(), null, "bookinghandler", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getGUIController__ShowAvailabilitystartDateendDateroomTypeNrOfGuests(), null, "showAvailabilitystartDateendDateroomTypeNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayErrorstringerrorMsg(), null, "displayErrorstringerrorMsg", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayExtrasListextrasExtras(), null, "displayExtrasListextrasExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayParkingsListparkingsParkings(), null, "displayParkingsListparkingsParkings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomTypesListroomTypeRoomType(), null, "displayRoomTypesListroomTypeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomsGridListRoomroomType(), null, "displayRoomsGridListRoomroomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayPaymentOption(), null, "displayPaymentOption", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomsByIDintbookingID(), null, "displayRoomsByIDintbookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayBookingsByIDintbookingID(), null, "displayBookingsByIDintbookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayBookingCancelled(), null, "displayBookingCancelled", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(loginControllerEClass, LoginController.class, "LoginController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginController_CurrentUser(), theBuissnesslayerPackage.get_AbstractUser(), null, "currentUser", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoginController_LoginController(), this.getLoginController(), null, "LoginController", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoginController_Paymenthandler(), theBuisnessLogicLayerPackage.getPaymentHandler(), null, "paymenthandler", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLoginController__EmployeeloginEmployeeintIDstringpassword(), null, "EmployeeloginEmployeeintIDstringpassword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__GuestmakeGuestBookingLoginBookingbooking(), null, "GuestmakeGuestBookingLoginBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__GuestloginGuestintbookingIDstringname(), null, "GuestloginGuestintbookingIDstringname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__GetSingletonController(), null, "getSingletonController", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__CreateSingletonHandler(), null, "createSingletonHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(loginController_DataType1EClass, LoginController_DataType1.class, "LoginController_DataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Interaction layer"
		   });	
		addAnnotation
		  (getGUIController__ShowAvailabilitystartDateendDateroomTypeNrOfGuests(), 
		   source, 
		   new String[] {
			 "originalName", "showAvailability(startDate, endDate, roomType, NrOfGuests)"
		   });	
		addAnnotation
		  (getGUIController__DisplayErrorstringerrorMsg(), 
		   source, 
		   new String[] {
			 "originalName", "displayError(string errorMsg)"
		   });	
		addAnnotation
		  (getGUIController__DisplayExtrasListextrasExtras(), 
		   source, 
		   new String[] {
			 "originalName", "displayExtras(List<extras>Extras)"
		   });	
		addAnnotation
		  (getGUIController__DisplayParkingsListparkingsParkings(), 
		   source, 
		   new String[] {
			 "originalName", "displayParkings(List<parkings>Parkings)"
		   });	
		addAnnotation
		  (getGUIController__DisplayRoomTypesListroomTypeRoomType(), 
		   source, 
		   new String[] {
			 "originalName", "displayRoomTypes(List<roomType>RoomType)"
		   });	
		addAnnotation
		  (getGUIController__DisplayRoomsGridListRoomroomType(), 
		   source, 
		   new String[] {
			 "originalName", "displayRoomsGrid(List<Room> roomType)"
		   });	
		addAnnotation
		  (getGUIController__DisplayPaymentOption(), 
		   source, 
		   new String[] {
			 "originalName", "displayPaymentOption()"
		   });	
		addAnnotation
		  (getGUIController__DisplayRoomsByIDintbookingID(), 
		   source, 
		   new String[] {
			 "originalName", "displayRoomsByID(int bookingID)"
		   });	
		addAnnotation
		  (getGUIController__DisplayBookingsByIDintbookingID(), 
		   source, 
		   new String[] {
			 "originalName", "displayBookingsByID(int bookingID)"
		   });	
		addAnnotation
		  (getGUIController__DisplayBookingCancelled(), 
		   source, 
		   new String[] {
			 "originalName", "displayBookingCancelled()"
		   });	
		addAnnotation
		  (getLoginController__EmployeeloginEmployeeintIDstringpassword(), 
		   source, 
		   new String[] {
			 "originalName", "Employee loginEmployee(int ID, string password)"
		   });	
		addAnnotation
		  (getLoginController__GuestmakeGuestBookingLoginBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "Guest makeGuestBookingLogin(Booking booking)"
		   });	
		addAnnotation
		  (getLoginController__GuestloginGuestintbookingIDstringname(), 
		   source, 
		   new String[] {
			 "originalName", "Guest loginGuest(int bookingID, string name)"
		   });
	}

} //InteractionlayerPackageImpl
