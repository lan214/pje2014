/**
 */
package androidUI.impl;

import androidUI.AndroidUIPackage;
import androidUI.Button;

import androidUI.Method;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link androidUI.impl.ButtonImpl#getOnClick <em>On Click</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends TextViewImpl implements Button {
	/**
	 * The cached value of the '{@link #getOnClick() <em>On Click</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClick()
	 * @generated
	 * @ordered
	 */
	protected Method onClick;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidUIPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getOnClick() {
		if (onClick != null && onClick.eIsProxy()) {
			InternalEObject oldOnClick = (InternalEObject)onClick;
			onClick = (Method)eResolveProxy(oldOnClick);
			if (onClick != oldOnClick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidUIPackage.BUTTON__ON_CLICK, oldOnClick, onClick));
			}
		}
		return onClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetOnClick() {
		return onClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClick(Method newOnClick) {
		Method oldOnClick = onClick;
		onClick = newOnClick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidUIPackage.BUTTON__ON_CLICK, oldOnClick, onClick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidUIPackage.BUTTON__ON_CLICK:
				if (resolve) return getOnClick();
				return basicGetOnClick();
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
			case AndroidUIPackage.BUTTON__ON_CLICK:
				setOnClick((Method)newValue);
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
			case AndroidUIPackage.BUTTON__ON_CLICK:
				setOnClick((Method)null);
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
			case AndroidUIPackage.BUTTON__ON_CLICK:
				return onClick != null;
		}
		return super.eIsSet(featureID);
	}
	
	

} //ButtonImpl
