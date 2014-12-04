/**
 */
package androidUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.TextView#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getTextView()
 * @model
 * @generated
 */
public interface TextView extends View {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see androidUI.AndroidUIPackage#getTextView_Text()
	 * @model dataType="androidUI.datatype.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link androidUI.TextView#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextView
