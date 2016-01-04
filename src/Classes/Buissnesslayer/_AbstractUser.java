/**
 */
package Classes.Buissnesslayer;

import Classes.Interactionlayer.LoginController;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getBookingHandler <em>Booking Handler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getUserhandler <em>Userhandler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer._AbstractUser#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='<<Abstract>>User'"
 * @generated
 */
public interface _AbstractUser extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getName();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(char value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getEmail();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(char value);

	/**
	 * Returns the value of the '<em><b>Booking Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Handler</em>' reference.
	 * @see #setBookingHandler(BookingHandler)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_BookingHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getBookingHandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getBookingHandler <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Handler</em>' reference.
	 * @see #getBookingHandler()
	 * @generated
	 */
	void setBookingHandler(BookingHandler value);

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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_Logincontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoginController getLogincontroller();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getLogincontroller <em>Logincontroller</em>}' reference.
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_Userhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserHandler getUserhandler();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getUserhandler <em>Userhandler</em>}' reference.
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
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#get_AbstractUser_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer._AbstractUser#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='enterContactData(String name, Email email, Address adress)'"
	 * @generated
	 */
	void enterContactDataStringnameEmailemailAddressadress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='int bookRoom(Booking booking)'"
	 * @generated
	 */
	void intbookRoomBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='changeBooking(Booking oldBooking, Booking newBooking)'"
	 * @generated
	 */
	void changeBookingBookingoldBookingBookingnewBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cancelBooking(Booking booking)'"
	 * @generated
	 */
	void cancelBookingBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='attemptCheckIn(Booking booking)'"
	 * @generated
	 */
	void attemptCheckInBookingbooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='attemptCheckOut(Booking booking)'"
	 * @generated
	 */
	void attemptCheckOutBookingbooking();

} // _AbstractUser
