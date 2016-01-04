/**
 */
package Classes.Interactionlayer.impl;

import Classes.Interactionlayer.GUI;
import Classes.Interactionlayer.GUIController;
import Classes.Interactionlayer.InteractionlayerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Interactionlayer.impl.GUIImpl#getGuicontroller <em>Guicontroller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIImpl extends MinimalEObjectImpl.Container implements GUI {
	/**
	 * The cached value of the '{@link #getGuicontroller() <em>Guicontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuicontroller()
	 * @generated
	 * @ordered
	 */
	protected GUIController guicontroller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionlayerPackage.Literals.GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIController getGuicontroller() {
		if (guicontroller != null && guicontroller.eIsProxy()) {
			InternalEObject oldGuicontroller = (InternalEObject)guicontroller;
			guicontroller = (GUIController)eResolveProxy(oldGuicontroller);
			if (guicontroller != oldGuicontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionlayerPackage.GUI__GUICONTROLLER, oldGuicontroller, guicontroller));
			}
		}
		return guicontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIController basicGetGuicontroller() {
		return guicontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuicontroller(GUIController newGuicontroller) {
		GUIController oldGuicontroller = guicontroller;
		guicontroller = newGuicontroller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionlayerPackage.GUI__GUICONTROLLER, oldGuicontroller, guicontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionlayerPackage.GUI__GUICONTROLLER:
				if (resolve) return getGuicontroller();
				return basicGetGuicontroller();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionlayerPackage.GUI__GUICONTROLLER:
				setGuicontroller((GUIController)newValue);
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
			case InteractionlayerPackage.GUI__GUICONTROLLER:
				setGuicontroller((GUIController)null);
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
			case InteractionlayerPackage.GUI__GUICONTROLLER:
				return guicontroller != null;
		}
		return super.eIsSet(featureID);
	}

} //GUIImpl
