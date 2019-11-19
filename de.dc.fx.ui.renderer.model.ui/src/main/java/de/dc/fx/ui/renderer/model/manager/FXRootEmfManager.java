package de.dc.fx.ui.renderer.model.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.fx.ui.renderer.model.*;
import de.dc.fx.ui.renderer.model.provider.*;
import de.dc.fx.ui.renderer.model.file.*;
import de.dc.fx.emf.support.AbstractEmfManager;
import de.dc.fx.emf.support.file.IEmfFile;

public class FXRootEmfManager extends AbstractEmfManager<FXRoot>{

	@Override
	public EPackage getModelPackage() {
		return UIPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return UIFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<FXRoot> initFile() {
		return new FXRootFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new UIItemProviderAdapterFactory();
	}

	@Override
	protected FXRoot initModel() {
		return UIFactory.eINSTANCE.createFXRoot();
	}

}
