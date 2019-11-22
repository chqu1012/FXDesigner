/**
 */
package de.dc.fx.ui.renderer.model.util;

import de.dc.fx.ui.renderer.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.renderer.model.UIPackage
 * @generated
 */
public class UIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UIPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISwitch<Adapter> modelSwitch = new UISwitch<Adapter>() {
		@Override
		public Adapter caseFXRoot(FXRoot object) {
			return createFXRootAdapter();
		}

		@Override
		public Adapter caseFXEvent(FXEvent object) {
			return createFXEventAdapter();
		}

		@Override
		public Adapter caseFXNode(FXNode object) {
			return createFXNodeAdapter();
		}

		@Override
		public Adapter caseFXMargin(FXMargin object) {
			return createFXMarginAdapter();
		}

		@Override
		public Adapter caseFXPadding(FXPadding object) {
			return createFXPaddingAdapter();
		}

		@Override
		public Adapter caseFXLayout(FXLayout object) {
			return createFXLayoutAdapter();
		}

		@Override
		public Adapter caseFXAccordion(FXAccordion object) {
			return createFXAccordionAdapter();
		}

		@Override
		public Adapter caseFXTabPane(FXTabPane object) {
			return createFXTabPaneAdapter();
		}

		@Override
		public Adapter caseFXHBox(FXHBox object) {
			return createFXHBoxAdapter();
		}

		@Override
		public Adapter caseFXVBox(FXVBox object) {
			return createFXVBoxAdapter();
		}

		@Override
		public Adapter caseFXBorderPane(FXBorderPane object) {
			return createFXBorderPaneAdapter();
		}

		@Override
		public Adapter caseFXTab(FXTab object) {
			return createFXTabAdapter();
		}

		@Override
		public Adapter caseFXButton(FXButton object) {
			return createFXButtonAdapter();
		}

		@Override
		public Adapter caseFXLabel(FXLabel object) {
			return createFXLabelAdapter();
		}

		@Override
		public Adapter caseFXCheckButton(FXCheckButton object) {
			return createFXCheckButtonAdapter();
		}

		@Override
		public Adapter caseFXRadioButton(FXRadioButton object) {
			return createFXRadioButtonAdapter();
		}

		@Override
		public Adapter caseFXListView(FXListView object) {
			return createFXListViewAdapter();
		}

		@Override
		public Adapter caseFXTableView(FXTableView object) {
			return createFXTableViewAdapter();
		}

		@Override
		public Adapter caseFXFilteredTableView(FXFilteredTableView object) {
			return createFXFilteredTableViewAdapter();
		}

		@Override
		public Adapter caseFXSortFilteredTableView(FXSortFilteredTableView object) {
			return createFXSortFilteredTableViewAdapter();
		}

		@Override
		public Adapter caseFXTableColumn(FXTableColumn object) {
			return createFXTableColumnAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXRoot <em>FX Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXRoot
	 * @generated
	 */
	public Adapter createFXRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXEvent <em>FX Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXEvent
	 * @generated
	 */
	public Adapter createFXEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXNode <em>FX Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXNode
	 * @generated
	 */
	public Adapter createFXNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXMargin <em>FX Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXMargin
	 * @generated
	 */
	public Adapter createFXMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXPadding <em>FX Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXPadding
	 * @generated
	 */
	public Adapter createFXPaddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXLayout <em>FX Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXLayout
	 * @generated
	 */
	public Adapter createFXLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXAccordion <em>FX Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXAccordion
	 * @generated
	 */
	public Adapter createFXAccordionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXTabPane <em>FX Tab Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXTabPane
	 * @generated
	 */
	public Adapter createFXTabPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXHBox <em>FXH Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXHBox
	 * @generated
	 */
	public Adapter createFXHBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXVBox <em>FXV Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXVBox
	 * @generated
	 */
	public Adapter createFXVBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXBorderPane <em>FX Border Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane
	 * @generated
	 */
	public Adapter createFXBorderPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXTab <em>FX Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXTab
	 * @generated
	 */
	public Adapter createFXTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXButton <em>FX Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXButton
	 * @generated
	 */
	public Adapter createFXButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXLabel <em>FX Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXLabel
	 * @generated
	 */
	public Adapter createFXLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXCheckButton <em>FX Check Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXCheckButton
	 * @generated
	 */
	public Adapter createFXCheckButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXRadioButton <em>FX Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXRadioButton
	 * @generated
	 */
	public Adapter createFXRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXListView <em>FX List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXListView
	 * @generated
	 */
	public Adapter createFXListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXTableView <em>FX Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXTableView
	 * @generated
	 */
	public Adapter createFXTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXFilteredTableView <em>FX Filtered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXFilteredTableView
	 * @generated
	 */
	public Adapter createFXFilteredTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXSortFilteredTableView <em>FX Sort Filtered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXSortFilteredTableView
	 * @generated
	 */
	public Adapter createFXSortFilteredTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.renderer.model.FXTableColumn <em>FX Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn
	 * @generated
	 */
	public Adapter createFXTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UIAdapterFactory
