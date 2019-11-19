package de.dc.fx.ui.renderer.model.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.fx.ui.renderer.model.file.*;
import de.dc.fx.ui.renderer.model.*;
import de.dc.fx.emf.support.file.EmfFile;

public class FXRootFile extends EmfFile<FXRoot>{

	@Override
	public EPackage getEPackageEInstance() {
		return UIPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return UIFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "ui";
	}

}
