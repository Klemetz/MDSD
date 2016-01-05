/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.Booking;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getExtras <em>Extras</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getParkings <em>Parkings</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#isPaymentComplete <em>Payment Complete</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.BookingImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuest() <em>Guest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected static final int GUEST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected int guest = GUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int nrOfGuests = NR_OF_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final int START_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected int startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final int END_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected int endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtras() <em>Extras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtras() <em>Extras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected String extras = EXTRAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParkings() <em>Parkings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParkings()
	 * @generated
	 * @ordered
	 */
	protected static final String PARKINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParkings() <em>Parkings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParkings()
	 * @generated
	 * @ordered
	 */
	protected String parkings = PARKINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRooms() <em>Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected String rooms = ROOMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedOut = CHECKED_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected String payment = PAYMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaymentComplete() <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAYMENT_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaymentComplete() <em>Payment Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean paymentComplete = PAYMENT_COMPLETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGuest() {
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuest(int newGuest) {
		int oldGuest = guest;
		guest = newGuest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__GUEST, oldGuest, guest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfGuests() {
		return nrOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfGuests(int newNrOfGuests) {
		int oldNrOfGuests = nrOfGuests;
		nrOfGuests = newNrOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__NR_OF_GUESTS, oldNrOfGuests, nrOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(int newStartDate) {
		int oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(int newEndDate) {
		int oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtras() {
		return extras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtras(String newExtras) {
		String oldExtras = extras;
		extras = newExtras;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__EXTRAS, oldExtras, extras));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParkings() {
		return parkings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParkings(String newParkings) {
		String oldParkings = parkings;
		parkings = newParkings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__PARKINGS, oldParkings, parkings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(String newRooms) {
		String oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__ROOMS, oldRooms, rooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(boolean newCheckedIn) {
		boolean oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedOut() {
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedOut(boolean newCheckedOut) {
		boolean oldCheckedOut = checkedOut;
		checkedOut = newCheckedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__CHECKED_OUT, oldCheckedOut, checkedOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(String newPayment) {
		String oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__PAYMENT, oldPayment, payment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaymentComplete() {
		return paymentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentComplete(boolean newPaymentComplete) {
		boolean oldPaymentComplete = paymentComplete;
		paymentComplete = newPaymentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.BOOKING__PAYMENT_COMPLETE, oldPaymentComplete, paymentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, BuissnesslayerPackage.BOOKING__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case BuissnesslayerPackage.BOOKING__GUEST:
				return getGuest();
			case BuissnesslayerPackage.BOOKING__NR_OF_GUESTS:
				return getNrOfGuests();
			case BuissnesslayerPackage.BOOKING__START_DATE:
				return getStartDate();
			case BuissnesslayerPackage.BOOKING__END_DATE:
				return getEndDate();
			case BuissnesslayerPackage.BOOKING__EXTRAS:
				return getExtras();
			case BuissnesslayerPackage.BOOKING__PARKINGS:
				return getParkings();
			case BuissnesslayerPackage.BOOKING__ROOMS:
				return getRooms();
			case BuissnesslayerPackage.BOOKING__CHECKED_IN:
				return isCheckedIn();
			case BuissnesslayerPackage.BOOKING__CHECKED_OUT:
				return isCheckedOut();
			case BuissnesslayerPackage.BOOKING__PAYMENT:
				return getPayment();
			case BuissnesslayerPackage.BOOKING__PAYMENT_COMPLETE:
				return isPaymentComplete();
			case BuissnesslayerPackage.BOOKING__ROOM:
				return getRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuissnesslayerPackage.BOOKING__BOOKING_ID:
				setBookingID((Integer)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__GUEST:
				setGuest((Integer)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests((Integer)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__START_DATE:
				setStartDate((Integer)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__END_DATE:
				setEndDate((Integer)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__EXTRAS:
				setExtras((String)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__PARKINGS:
				setParkings((String)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__ROOMS:
				setRooms((String)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__CHECKED_IN:
				setCheckedIn((Boolean)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__CHECKED_OUT:
				setCheckedOut((Boolean)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__PAYMENT:
				setPayment((String)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__PAYMENT_COMPLETE:
				setPaymentComplete((Boolean)newValue);
				return;
			case BuissnesslayerPackage.BOOKING__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
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
			case BuissnesslayerPackage.BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__GUEST:
				setGuest(GUEST_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests(NR_OF_GUESTS_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__EXTRAS:
				setExtras(EXTRAS_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__PARKINGS:
				setParkings(PARKINGS_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__ROOMS:
				setRooms(ROOMS_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__CHECKED_OUT:
				setCheckedOut(CHECKED_OUT_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__PAYMENT:
				setPayment(PAYMENT_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__PAYMENT_COMPLETE:
				setPaymentComplete(PAYMENT_COMPLETE_EDEFAULT);
				return;
			case BuissnesslayerPackage.BOOKING__ROOM:
				getRoom().clear();
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
			case BuissnesslayerPackage.BOOKING__BOOKING_ID:
				return bookingID != BOOKING_ID_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__GUEST:
				return guest != GUEST_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__NR_OF_GUESTS:
				return nrOfGuests != NR_OF_GUESTS_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__START_DATE:
				return startDate != START_DATE_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__END_DATE:
				return endDate != END_DATE_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__EXTRAS:
				return EXTRAS_EDEFAULT == null ? extras != null : !EXTRAS_EDEFAULT.equals(extras);
			case BuissnesslayerPackage.BOOKING__PARKINGS:
				return PARKINGS_EDEFAULT == null ? parkings != null : !PARKINGS_EDEFAULT.equals(parkings);
			case BuissnesslayerPackage.BOOKING__ROOMS:
				return ROOMS_EDEFAULT == null ? rooms != null : !ROOMS_EDEFAULT.equals(rooms);
			case BuissnesslayerPackage.BOOKING__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__CHECKED_OUT:
				return checkedOut != CHECKED_OUT_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__PAYMENT:
				return PAYMENT_EDEFAULT == null ? payment != null : !PAYMENT_EDEFAULT.equals(payment);
			case BuissnesslayerPackage.BOOKING__PAYMENT_COMPLETE:
				return paymentComplete != PAYMENT_COMPLETE_EDEFAULT;
			case BuissnesslayerPackage.BOOKING__ROOM:
				return room != null && !room.isEmpty();
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
		result.append(" (bookingID: ");
		result.append(bookingID);
		result.append(", guest: ");
		result.append(guest);
		result.append(", nrOfGuests: ");
		result.append(nrOfGuests);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", extras: ");
		result.append(extras);
		result.append(", parkings: ");
		result.append(parkings);
		result.append(", rooms: ");
		result.append(rooms);
		result.append(", checkedIn: ");
		result.append(checkedIn);
		result.append(", checkedOut: ");
		result.append(checkedOut);
		result.append(", payment: ");
		result.append(payment);
		result.append(", paymentComplete: ");
		result.append(paymentComplete);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
