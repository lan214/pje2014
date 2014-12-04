/**
 */
package androidUI;

import androidUI.datatype.OrientationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.LinearLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getLinearLayout()
 * @model
 * @generated
 */
public interface LinearLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link androidUI.datatype.OrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see androidUI.datatype.OrientationType
	 * @see #setOrientation(OrientationType)
	 * @see androidUI.AndroidUIPackage#getLinearLayout_Orientation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link androidUI.LinearLayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see androidUI.datatype.OrientationType
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

} // LinearLayout
