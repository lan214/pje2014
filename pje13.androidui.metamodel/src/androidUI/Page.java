/**
 */
package androidUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.Page#getName <em>Name</em>}</li>
 *   <li>{@link androidUI.Page#getRoot_element <em>Root element</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Root element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root element</em>' containment reference.
	 * @see #setRoot_element(View)
	 * @see androidUI.AndroidUIPackage#getPage_Root_element()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	View getRoot_element();

	/**
	 * Sets the value of the '{@link androidUI.Page#getRoot_element <em>Root element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root element</em>' containment reference.
	 * @see #getRoot_element()
	 * @generated
	 */
	void setRoot_element(View value);

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
	 * @see androidUI.AndroidUIPackage#getPage_Name()
	 * @model dataType="androidUI.datatype.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link androidUI.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
