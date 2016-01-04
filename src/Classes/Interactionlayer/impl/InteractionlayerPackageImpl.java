/**
 */
package Classes.Interactionlayer.impl;

import Classes.BuisnessLogicLayer.BuisnessLogicLayerPackage;

import Classes.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl;

import Classes.Buissnesslayer.BuissnesslayerPackage;

import Classes.Buissnesslayer.impl.BuissnesslayerPackageImpl;

import Classes.Datalayer.DatalayerPackage;

import Classes.Datalayer.impl.DatalayerPackageImpl;

import Classes.Interactionlayer.GUIController;
import Classes.Interactionlayer.InteractionlayerFactory;
import Classes.Interactionlayer.InteractionlayerPackage;
import Classes.Interactionlayer.LoginController;
import Classes.Interactionlayer.LoginController_DataType1;

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
	 * @see Classes.Interactionlayer.InteractionlayerPackage#eNS_URI
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
		DatalayerPackageImpl theDatalayerPackage = (DatalayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) instanceof DatalayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) : DatalayerPackage.eINSTANCE);
		BuissnesslayerPackageImpl theBuissnesslayerPackage = (BuissnesslayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) instanceof BuissnesslayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI) : BuissnesslayerPackage.eINSTANCE);
		BuisnessLogicLayerPackageImpl theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) instanceof BuisnessLogicLayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) : BuisnessLogicLayerPackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionlayerPackage.createPackageContents();
		theDatalayerPackage.createPackageContents();
		theBuissnesslayerPackage.createPackageContents();
		theBuisnessLogicLayerPackage.createPackageContents();

		// Initialize created meta-data
		theInteractionlayerPackage.initializePackageContents();
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
	public EOperation getGUIController__ShowAvailability__int_int_Room_int() {
		return guiControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayError() {
		return guiControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGUIController__DisplayExtras__EList() {
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
	public EOperation getLoginController__LoginEmployee__int_char() {
		return loginControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__MakeGuestBookingLogin__Booking() {
		return loginControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoginController__LoginGuest__int_char() {
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
		createEOperation(guiControllerEClass, GUI_CONTROLLER___SHOW_AVAILABILITY__INT_INT_ROOM_INT);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_ERROR);
		createEOperation(guiControllerEClass, GUI_CONTROLLER___DISPLAY_EXTRAS__ELIST);
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
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___LOGIN_EMPLOYEE__INT_CHAR);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___MAKE_GUEST_BOOKING_LOGIN__BOOKING);
		createEOperation(loginControllerEClass, LOGIN_CONTROLLER___LOGIN_GUEST__INT_CHAR);
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
		initEClass(guiEClass, Classes.Interactionlayer.GUI.class, "GUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUI_Guicontroller(), this.getGUIController(), null, "guicontroller", null, 1, 1, Classes.Interactionlayer.GUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guiControllerEClass, GUIController.class, "GUIController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIController_Display(), this.getGUI(), null, "display", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGUIController_Logincontroller(), this.getLoginController(), null, "logincontroller", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGUIController_Bookinghandler(), theBuissnesslayerPackage.getBookingHandler(), null, "bookinghandler", null, 1, 1, GUIController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getGUIController__ShowAvailability__int_int_Room_int(), null, "showAvailability", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBuissnesslayerPackage.getRoom(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayError(), null, "displayError", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGUIController__DisplayExtras__EList(), null, "displayExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayParkingsListparkingsParkings(), null, "displayParkingsListparkingsParkings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomTypesListroomTypeRoomType(), null, "displayRoomTypesListroomTypeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomsGridListRoomroomType(), null, "displayRoomsGridListRoomroomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayPaymentOption(), null, "displayPaymentOption", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayRoomsByIDintbookingID(), null, "displayRoomsByIDintbookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayBookingsByIDintbookingID(), null, "displayBookingsByIDintbookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGUIController__DisplayBookingCancelled(), null, "displayBookingCancelled", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(loginControllerEClass, LoginController.class, "LoginController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginController_CurrentUser(), theBuissnesslayerPackage.getUser(), null, "currentUser", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoginController_LoginController(), this.getLoginController(), null, "LoginController", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoginController_Paymenthandler(), theBuisnessLogicLayerPackage.getPaymentHandler(), null, "paymenthandler", null, 1, 1, LoginController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLoginController__LoginEmployee__int_char(), null, "loginEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLoginController__MakeGuestBookingLogin__Booking(), null, "makeGuestBookingLogin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBuissnesslayerPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLoginController__LoginGuest__int_char(), null, "loginGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__GetSingletonController(), null, "getSingletonController", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLoginController__CreateSingletonHandler(), null, "createSingletonHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(loginController_DataType1EClass, LoginController_DataType1.class, "LoginController_DataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

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
	}

} //InteractionlayerPackageImpl
