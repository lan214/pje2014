/**
 */
package androidUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidUI.ViewGroup#getContentView <em>Content View</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidUI.AndroidUIPackage#getViewGroup()
 * @model abstract="true"
 * @generated
 */
public interface ViewGroup extends View {
	/**
	 * Returns the value of the '<em><b>Content View</b></em>' containment reference list.
	 * The list contents are of type {@link androidUI.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content View</em>' containment reference list.
	 * @see androidUI.AndroidUIPackage#getViewGroup_ContentView()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getContentView();

} // ViewGroup
