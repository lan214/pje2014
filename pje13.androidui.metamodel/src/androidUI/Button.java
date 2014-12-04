/**
 */
package androidUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.Button#getOnClick <em>On Click</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends TextView {

	/**
	 * Returns the value of the '<em><b>On Click</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Click</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Click</em>' reference.
	 * @see #setOnClick(Method)
	 * @see androidUI.AndroidUIPackage#getButton_OnClick()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Method getOnClick();

	/**
	 * Sets the value of the '{@link androidUI.Button#getOnClick <em>On Click</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Click</em>' reference.
	 * @see #getOnClick()
	 * @generated
	 */
	void setOnClick(Method value);
} // Button
