/**
 */
package androidUI;

import androidUI.datatype.DimensionType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.View#getId <em>Id</em>}</li>
 *   <li>{@link androidUI.View#getWidth <em>Width</em>}</li>
 *   <li>{@link androidUI.View#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see androidUI.AndroidUIPackage#getView_Id()
	 * @model dataType="androidUI.datatype.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link androidUI.View#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The literals are from the enumeration {@link androidUI.datatype.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see androidUI.datatype.DimensionType
	 * @see #setWidth(DimensionType)
	 * @see androidUI.AndroidUIPackage#getView_Width()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DimensionType getWidth();

	/**
	 * Sets the value of the '{@link androidUI.View#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see androidUI.datatype.DimensionType
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DimensionType value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The literals are from the enumeration {@link androidUI.datatype.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see androidUI.datatype.DimensionType
	 * @see #setHeight(DimensionType)
	 * @see androidUI.AndroidUIPackage#getView_Height()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DimensionType getHeight();

	/**
	 * Sets the value of the '{@link androidUI.View#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see androidUI.datatype.DimensionType
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DimensionType value);

} // View
