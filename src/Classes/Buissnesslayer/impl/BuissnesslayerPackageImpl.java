/**
 */
package Classes.Buissnesslayer.impl;

import Classes.BuisnessLogicLayer.BuisnessLogicLayerPackage;

import Classes.BuisnessLogicLayer.impl.BuisnessLogicLayerPackageImpl;

import Classes.Buissnesslayer.Address;
import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.BookingHandler;
import Classes.Buissnesslayer.BuissnesslayerFactory;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.Employee;
import Classes.Buissnesslayer.Guest;
import Classes.Buissnesslayer.Room;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;
import Classes.Datalayer.DatalayerPackage;

import Classes.Datalayer.impl.DatalayerPackageImpl;

import Classes.Interactionlayer.InteractionlayerPackage;

import Classes.Interactionlayer.impl.InteractionlayerPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class BuissnesslayerPackageImpl extends EPackageImpl implements BuissnesslayerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuissnesslayerPackageImpl() {
		super(eNS_URI, BuissnesslayerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuissnesslayerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuissnesslayerPackage init() {
		if (isInited) return (BuissnesslayerPackage)EPackage.Registry.INSTANCE.getEPackage(BuissnesslayerPackage.eNS_URI);

		// Obtain or create and register package
		BuissnesslayerPackageImpl theBuissnesslayerPackage = (BuissnesslayerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuissnesslayerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuissnesslayerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatalayerPackageImpl theDatalayerPackage = (DatalayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) instanceof DatalayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI) : DatalayerPackage.eINSTANCE);
		InteractionlayerPackageImpl theInteractionlayerPackage = (InteractionlayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) instanceof InteractionlayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI) : InteractionlayerPackage.eINSTANCE);
		BuisnessLogicLayerPackageImpl theBuisnessLogicLayerPackage = (BuisnessLogicLayerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) instanceof BuisnessLogicLayerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuisnessLogicLayerPackage.eNS_URI) : BuisnessLogicLayerPackage.eINSTANCE);

		// Create package meta-data objects
		theBuissnesslayerPackage.createPackageContents();
		theDatalayerPackage.createPackageContents();
		theInteractionlayerPackage.createPackageContents();
		theBuisnessLogicLayerPackage.createPackageContents();

		// Initialize created meta-data
		theBuissnesslayerPackage.initializePackageContents();
		theDatalayerPackage.initializePackageContents();
		theInteractionlayerPackage.initializePackageContents();
		theBuisnessLogicLayerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuissnesslayerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuissnesslayerPackage.eNS_URI, theBuissnesslayerPackage);
		return theBuissnesslayerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_TyperoomType() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Guest() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NrOfGuests() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Extras() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Parkings() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Rooms() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckedIn() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckedOut() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Payment() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PaymentComplete() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Room() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingHandler() {
		return bookingHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Booking() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Bookings() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_SingletonBooking() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_User() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Database() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__FetchAvailability__int_int_Room_int() {
		return bookingHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__FetchBooking__Booking() {
		return bookingHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__AttemptBookRoom__Booking() {
		return bookingHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__CancelBooking__Booking() {
		return bookingHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__ChangeBooking__Booking() {
		return bookingHandlerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__CheckIn__Booking() {
		return bookingHandlerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__CheckOut__Booking() {
		return bookingHandlerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__SendErrorMsg() {
		return bookingHandlerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__GetSinglettonBooking() {
		return bookingHandlerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__CreateSingletonHandler() {
		return bookingHandlerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__FetchAvailableExtras() {
		return bookingHandlerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_BookingHandler() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Logincontroller() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Userhandler() {
		return (EReference)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Address() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__EnterContactDataStringnameEmailemailAddressadress() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__IntbookRoomBookingbooking() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__ChangeBookingBookingoldBookingBookingnewBooking() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__CancelBookingBookingbooking() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AttemptCheckInBookingbooking() {
		return userEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AttemptCheckOutBookingbooking() {
		return userEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserHandler() {
		return userHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserHandler_Users() {
		return (EAttribute)userHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserHandler_SingletonUserHandler() {
		return (EReference)userHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserHandler_Logincontroller() {
		return (EReference)userHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserHandler_Database() {
		return (EReference)userHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserHandler__AddGuestDBPaymentInfopaymentInfoUseruser() {
		return userHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserHandler__SendEmailVerificationStringemail() {
		return userHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserHandler__GetSingletonHandler() {
		return userHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserHandler__CreateSingletonHandler() {
		return userHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Street() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_PostalNumber() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Country() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__IntbookRoomBookingbooking() {
		return guestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__ChangeBookingBookingoldBookingBookingnewBooking() {
		return guestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__CancelBookingBookingbooking() {
		return guestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__AttemptCheckInBookingbooking() {
		return guestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__AttemptCheckOutBookingbooking() {
		return guestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_ID() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Password() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__IntbookRoomBookingbooking() {
		return employeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__ChangeBookingBookingoldBookingBookingnewBooking() {
		return employeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__CancelBookingBookingbooking() {
		return employeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__AttemptCheckInBookingbooking() {
		return employeeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__AttemptCheckOutBookingbooking() {
		return employeeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuissnesslayerFactory getBuissnesslayerFactory() {
		return (BuissnesslayerFactory)getEFactoryInstance();
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
		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__TYPEROOM_TYPE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__GUEST);
		createEAttribute(bookingEClass, BOOKING__NR_OF_GUESTS);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__EXTRAS);
		createEAttribute(bookingEClass, BOOKING__PARKINGS);
		createEAttribute(bookingEClass, BOOKING__ROOMS);
		createEAttribute(bookingEClass, BOOKING__CHECKED_IN);
		createEAttribute(bookingEClass, BOOKING__CHECKED_OUT);
		createEAttribute(bookingEClass, BOOKING__PAYMENT);
		createEAttribute(bookingEClass, BOOKING__PAYMENT_COMPLETE);
		createEReference(bookingEClass, BOOKING__ROOM);

		bookingHandlerEClass = createEClass(BOOKING_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKING);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKINGS);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__SINGLETON_BOOKING);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__USER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__DATABASE);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___FETCH_AVAILABILITY__INT_INT_ROOM_INT);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___FETCH_BOOKING__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___ATTEMPT_BOOK_ROOM__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___CANCEL_BOOKING__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___CHANGE_BOOKING__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___CHECK_IN__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___CHECK_OUT__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___SEND_ERROR_MSG);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___GET_SINGLETTON_BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___CREATE_SINGLETON_HANDLER);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___FETCH_AVAILABLE_EXTRAS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEReference(userEClass, USER__BOOKING_HANDLER);
		createEReference(userEClass, USER__LOGINCONTROLLER);
		createEReference(userEClass, USER__USERHANDLER);
		createEReference(userEClass, USER__ADDRESS);
		createEOperation(userEClass, USER___ENTER_CONTACT_DATA_STRINGNAME_EMAILEMAIL_ADDRESSADRESS);
		createEOperation(userEClass, USER___INTBOOK_ROOM_BOOKINGBOOKING);
		createEOperation(userEClass, USER___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING);
		createEOperation(userEClass, USER___CANCEL_BOOKING_BOOKINGBOOKING);
		createEOperation(userEClass, USER___ATTEMPT_CHECK_IN_BOOKINGBOOKING);
		createEOperation(userEClass, USER___ATTEMPT_CHECK_OUT_BOOKINGBOOKING);

		userHandlerEClass = createEClass(USER_HANDLER);
		createEAttribute(userHandlerEClass, USER_HANDLER__USERS);
		createEReference(userHandlerEClass, USER_HANDLER__SINGLETON_USER_HANDLER);
		createEReference(userHandlerEClass, USER_HANDLER__LOGINCONTROLLER);
		createEReference(userHandlerEClass, USER_HANDLER__DATABASE);
		createEOperation(userHandlerEClass, USER_HANDLER___ADD_GUEST_DB_PAYMENT_INFOPAYMENT_INFO_USERUSER);
		createEOperation(userHandlerEClass, USER_HANDLER___SEND_EMAIL_VERIFICATION_STRINGEMAIL);
		createEOperation(userHandlerEClass, USER_HANDLER___GET_SINGLETON_HANDLER);
		createEOperation(userHandlerEClass, USER_HANDLER___CREATE_SINGLETON_HANDLER);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__STREET);
		createEAttribute(addressEClass, ADDRESS__POSTAL_NUMBER);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);

		guestEClass = createEClass(GUEST);
		createEOperation(guestEClass, GUEST___INTBOOK_ROOM_BOOKINGBOOKING);
		createEOperation(guestEClass, GUEST___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING);
		createEOperation(guestEClass, GUEST___CANCEL_BOOKING_BOOKINGBOOKING);
		createEOperation(guestEClass, GUEST___ATTEMPT_CHECK_IN_BOOKINGBOOKING);
		createEOperation(guestEClass, GUEST___ATTEMPT_CHECK_OUT_BOOKINGBOOKING);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__ID);
		createEAttribute(employeeEClass, EMPLOYEE__PASSWORD);
		createEOperation(employeeEClass, EMPLOYEE___INTBOOK_ROOM_BOOKINGBOOKING);
		createEOperation(employeeEClass, EMPLOYEE___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING);
		createEOperation(employeeEClass, EMPLOYEE___CANCEL_BOOKING_BOOKINGBOOKING);
		createEOperation(employeeEClass, EMPLOYEE___ATTEMPT_CHECK_IN_BOOKINGBOOKING);
		createEOperation(employeeEClass, EMPLOYEE___ATTEMPT_CHECK_OUT_BOOKINGBOOKING);
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
		DatalayerPackage theDatalayerPackage = (DatalayerPackage)EPackage.Registry.INSTANCE.getEPackage(DatalayerPackage.eNS_URI);
		InteractionlayerPackage theInteractionlayerPackage = (InteractionlayerPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionlayerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_TyperoomType(), ecorePackage.getEInt(), "TyperoomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Guest(), ecorePackage.getEInt(), "guest", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NrOfGuests(), ecorePackage.getEInt(), "nrOfGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEInt(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEInt(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Extras(), ecorePackage.getEChar(), "extras", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Parkings(), ecorePackage.getEChar(), "parkings", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Rooms(), ecorePackage.getEChar(), "rooms", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckedIn(), ecorePackage.getEBoolean(), "checkedIn", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckedOut(), ecorePackage.getEBoolean(), "checkedOut", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Payment(), ecorePackage.getEChar(), "payment", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PaymentComplete(), ecorePackage.getEBoolean(), "paymentComplete", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Room(), this.getRoom(), null, "room", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingHandlerEClass, BookingHandler.class, "BookingHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingHandler_Booking(), this.getBooking(), null, "booking", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_Bookings(), this.getBooking(), null, "Bookings", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_SingletonBooking(), this.getBookingHandler(), null, "singletonBooking", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_User(), this.getUser(), null, "User", null, 1, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_Database(), theDatalayerPackage.getDatabase(), null, "database", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getBookingHandler__FetchAvailability__int_int_Room_int(), null, "fetchAvailability", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__FetchBooking__Booking(), null, "fetchBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__AttemptBookRoom__Booking(), null, "attemptBookRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__CancelBooking__Booking(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__ChangeBooking__Booking(), null, "changeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__CheckIn__Booking(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__CheckOut__Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingHandler__SendErrorMsg(), null, "sendErrorMsg", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingHandler__GetSinglettonBooking(), null, "getSinglettonBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingHandler__CreateSingletonHandler(), null, "createSingletonHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingHandler__FetchAvailableExtras(), null, "fetchAvailableExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEChar(), "Name", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEChar(), "Email", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_BookingHandler(), this.getBookingHandler(), null, "bookingHandler", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Logincontroller(), theInteractionlayerPackage.getLoginController(), null, "logincontroller", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Userhandler(), this.getUserHandler(), null, "userhandler", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Address(), this.getAddress(), null, "address", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUser__EnterContactDataStringnameEmailemailAddressadress(), null, "enterContactDataStringnameEmailemailAddressadress", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__IntbookRoomBookingbooking(), null, "intbookRoomBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__ChangeBookingBookingoldBookingBookingnewBooking(), null, "changeBookingBookingoldBookingBookingnewBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__CancelBookingBookingbooking(), null, "cancelBookingBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__AttemptCheckInBookingbooking(), null, "attemptCheckInBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__AttemptCheckOutBookingbooking(), null, "attemptCheckOutBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(userHandlerEClass, UserHandler.class, "UserHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserHandler_Users(), ecorePackage.getEChar(), "Users", null, 1, 1, UserHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserHandler_SingletonUserHandler(), this.getUserHandler(), null, "singletonUserHandler", null, 1, 1, UserHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserHandler_Logincontroller(), theInteractionlayerPackage.getLoginController(), null, "logincontroller", null, 1, 1, UserHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserHandler_Database(), theDatalayerPackage.getDatabase(), null, "database", null, 1, 1, UserHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUserHandler__AddGuestDBPaymentInfopaymentInfoUseruser(), null, "addGuestDBPaymentInfopaymentInfoUseruser", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserHandler__SendEmailVerificationStringemail(), null, "sendEmailVerificationStringemail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserHandler__GetSingletonHandler(), null, "getSingletonHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserHandler__CreateSingletonHandler(), null, "createSingletonHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Street(), ecorePackage.getEChar(), "street", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_PostalNumber(), ecorePackage.getEInt(), "postalNumber", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_City(), ecorePackage.getEChar(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_Country(), ecorePackage.getEChar(), "country", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGuest__IntbookRoomBookingbooking(), null, "intbookRoomBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__ChangeBookingBookingoldBookingBookingnewBooking(), null, "changeBookingBookingoldBookingBookingnewBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__CancelBookingBookingbooking(), null, "cancelBookingBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__AttemptCheckInBookingbooking(), null, "attemptCheckInBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__AttemptCheckOutBookingbooking(), null, "attemptCheckOutBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Password(), ecorePackage.getEChar(), "Password", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmployee__IntbookRoomBookingbooking(), null, "intbookRoomBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__ChangeBookingBookingoldBookingBookingnewBooking(), null, "changeBookingBookingoldBookingBookingnewBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__CancelBookingBookingbooking(), null, "cancelBookingBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__AttemptCheckInBookingbooking(), null, "attemptCheckInBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__AttemptCheckOutBookingbooking(), null, "attemptCheckOutBookingbooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
			 "originalName", "Buissness layer"
		   });	
		addAnnotation
		  (getRoom_TyperoomType(), 
		   source, 
		   new String[] {
			 "originalName", "Type : roomType"
		   });	
		addAnnotation
		  (getUser__EnterContactDataStringnameEmailemailAddressadress(), 
		   source, 
		   new String[] {
			 "originalName", "enterContactData(String name, Email email, Address adress)"
		   });	
		addAnnotation
		  (getUser__IntbookRoomBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "int bookRoom(Booking booking)"
		   });	
		addAnnotation
		  (getUser__ChangeBookingBookingoldBookingBookingnewBooking(), 
		   source, 
		   new String[] {
			 "originalName", "changeBooking(Booking oldBooking, Booking newBooking)"
		   });	
		addAnnotation
		  (getUser__CancelBookingBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "cancelBooking(Booking booking)"
		   });	
		addAnnotation
		  (getUser__AttemptCheckInBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckIn(Booking booking)"
		   });	
		addAnnotation
		  (getUser__AttemptCheckOutBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckOut(Booking booking)"
		   });	
		addAnnotation
		  (getUserHandler__AddGuestDBPaymentInfopaymentInfoUseruser(), 
		   source, 
		   new String[] {
			 "originalName", "addGuestDB(PaymentInfo paymentInfo, User user)"
		   });	
		addAnnotation
		  (getUserHandler__SendEmailVerificationStringemail(), 
		   source, 
		   new String[] {
			 "originalName", "sendEmailVerification(String email)"
		   });	
		addAnnotation
		  (getGuest__IntbookRoomBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "int bookRoom(Booking booking)"
		   });	
		addAnnotation
		  (getGuest__ChangeBookingBookingoldBookingBookingnewBooking(), 
		   source, 
		   new String[] {
			 "originalName", "changeBooking(Booking oldBooking, Booking newBooking)"
		   });	
		addAnnotation
		  (getGuest__CancelBookingBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "cancelBooking(Booking booking)"
		   });	
		addAnnotation
		  (getGuest__AttemptCheckInBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckIn(Booking booking)"
		   });	
		addAnnotation
		  (getGuest__AttemptCheckOutBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckOut(Booking booking)"
		   });	
		addAnnotation
		  (getEmployee__IntbookRoomBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "int bookRoom(Booking booking)"
		   });	
		addAnnotation
		  (getEmployee__ChangeBookingBookingoldBookingBookingnewBooking(), 
		   source, 
		   new String[] {
			 "originalName", "changeBooking(Booking oldBooking, Booking newBooking)"
		   });	
		addAnnotation
		  (getEmployee__CancelBookingBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "cancelBooking(Booking booking)"
		   });	
		addAnnotation
		  (getEmployee__AttemptCheckInBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckIn(Booking booking)"
		   });	
		addAnnotation
		  (getEmployee__AttemptCheckOutBookingbooking(), 
		   source, 
		   new String[] {
			 "originalName", "attemptCheckOut(Booking booking)"
		   });
	}

} //BuissnesslayerPackageImpl
