/**
 */
package RootElement.Interactionlayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Interactionlayer.GUI#getGuicontroller <em>Guicontroller</em>}</li>
 * </ul>
 *
 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUI()
 * @model
 * @generated
 */
public interface GUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Guicontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guicontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guicontroller</em>' reference.
	 * @see #setGuicontroller(GUIController)
	 * @see RootElement.Interactionlayer.InteractionlayerPackage#getGUI_Guicontroller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GUIController getGuicontroller();

	/**
	 * Sets the value of the '{@link RootElement.Interactionlayer.GUI#getGuicontroller <em>Guicontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guicontroller</em>' reference.
	 * @see #getGuicontroller()
	 * @generated
	 */
	void setGuicontroller(GUIController value);

} // GUI
