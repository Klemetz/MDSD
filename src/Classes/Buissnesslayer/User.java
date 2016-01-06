/**
 */
package Classes.Buissnesslayer;

import Classes.Interactionlayer.LoginController;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.User#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.User#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.User#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.User#getUserhandler <em>Userhandler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.User#getAddress <em>Address</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.User#getBookinghandler <em>Bookinghandler</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Logincontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logincontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logincontroller</em>' reference.
	 * @see #setLogincontroller(LoginController)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getLogincontroller <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logincontroller</em>' reference.
	 * @see #getLogincontroller()
	 * @generated
	 */
	void setLogincontroller(LoginController value);

	/**
	 * Returns the value of the '<em><b>Userhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userhandler</em>' reference.
	 * @see #setUserhandler(UserHandler)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Userhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserHandler getUserhandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getUserhandler <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userhandler</em>' reference.
	 * @see #getUserhandler()
	 * @generated
	 */
	void setUserhandler(UserHandler value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Bookinghandler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Buissnesslayer.BookingHandler#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookinghandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookinghandler</em>' reference.
	 * @see #setBookinghandler(BookingHandler)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getUser_Bookinghandler()
	 * @see Classes.Buissnesslayer.BookingHandler#getUser
	 * @model opposite="User" required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getBookinghandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.User#getBookinghandler <em>Bookinghandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookinghandler</em>' reference.
	 * @see #getBookinghandler()
	 * @generated
	 */
	void setBookinghandler(BookingHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldBookingRequired="true" oldBookingOrdered="false" newBookingRequired="true" newBookingOrdered="false"
	 * @generated
	 */
	void changeBooking(Booking oldBooking, Booking newBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void cancelBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void attemptCheckIn(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void attemptCheckOut(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean bookRoom(Booking booking);

} // User
